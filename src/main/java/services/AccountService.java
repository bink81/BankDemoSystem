package services;

import utils.Request;
import utils.Response;
import utils.Transaction;
import utils.Withdraw;

public class AccountService {
	public Response withdraw(Request req) {
		Transaction t = new Withdraw();
		return t.execute(req);
	}
}
