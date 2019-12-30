package wallet.entity;

public class WalletAccount {

	public WalletAccount(String mobileNo, String name, double balance)
	{
		this.mobileNo = mobileNo;
		this.name = name;
		this.balance = balance;
	}

	private String mobileNo;

	public String getmobileNo() {
		return mobileNo;
	}

	public void setmoileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private double balance;

	public double getbalance() {
		return balance;
	}

	public void setbalance(double balance) {
		this.balance = balance;
	}

	
	public void transferamount(WalletAccount a, double amount) {
		this.balance = this.balance - amount;
		a.balance = a.balance + amount;
	}

}

