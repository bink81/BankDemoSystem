package utils;

public class Request {
	private long accountId;
	private long withdrawalAmount;
	
	public long getAccountId() {
		return accountId;
	}
	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}
	public long getWithdrawalAmount() {
		return withdrawalAmount;
	}
	public void setWithdrawalAmount(long withdrawalAmount) {
		this.withdrawalAmount = withdrawalAmount;
	}
}
