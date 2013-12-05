package utils;

import java.util.Date;

import com.marzeta.bank.dao.AccountDao;
import com.marzeta.bank.dao.AccountHistoryDao;
import com.marzeta.bank.model.Account;
import com.marzeta.bank.model.AccountHistory;

public class Withdraw implements Transaction {
	// @Autowired
	private AccountDao accountDao;
	private AccountHistoryDao accountHistoryDao;
	
	// @Transactional
	public Response execute(Request req) {
		Account account = accountDao.findById(req.getAccountId());

		Response resp = new Response();
		long newBalance = account.getBalance() - req.getWithdrawalAmount();
		if (newBalance > account.getMinBalance()) {
			AccountHistory accountHistory = new AccountHistory();
			accountHistory.setAccountId(req.getAccountId());
			accountHistory.setDate(new Date()); // TODO: should be taken from dB!
			accountHistory.setText("Withdrawing: " + req.getWithdrawalAmount());
			accountHistoryDao.save(accountHistory);
		
			account.setBalance(newBalance);
			resp.setSuccess(true);
			accountDao.update(account);
		}
		
		return resp;
	}
}
