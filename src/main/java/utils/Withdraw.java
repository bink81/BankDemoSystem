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
		AccountHistory accountHistory = new AccountHistory();
		accountHistory.setAccountId(req.getAccountId());
		accountHistory.setDate(new Date()); // TODO: should be taken from dB!
		accountHistory.setText("Withdrawing " + req.getBalanceChange());
		accountHistoryDao.save(accountHistory);
		
		Response resp = new Response();
		if (account.getBalance() > account.getMinBalance()) {
			account.setBalance(account.getBalance() + req.getBalanceChange());
			resp.setSuccess(true);
			accountDao.save(account);
		}
		
		return resp;
	}
}
