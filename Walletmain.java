package wallet.ui;

import java.util.*;

import wallet.entity.WalletAccount;

public class Walletmain {
	public static void main(String[] args) {
		Walletmain m = new Walletmain();
		m.execute();
	}

	Map<String, WalletAccount> store = new HashMap<>();

	public void execute() {
		final String mob1="9032301002";
		WalletAccount w1 = new WalletAccount(mob1, "Swathi", 2000);
		store.put("9032301002", w1);
		WalletAccount w2 = new WalletAccount("9441607400", "Sailaja", 2000);
		store.put("9441607400", w2);

		print();
		WalletAccount fetched = findBymobileNo(mob1);
		System.out.println("The customer with given mobile number is:" + fetched.getName());

		w2.transferamount(w1, 200);
		store.put("9441607400", w2);
		System.out.println("After the transaction");
		print();
	}

	public WalletAccount findBymobileNo(String mobileNo) {
		WalletAccount e = store.get(mobileNo);
		return e;
	}

	public void print() {
		Set<String> keys = store.keySet();
		for (String mobileNo : keys) {
			WalletAccount e = store.get(mobileNo);
			System.out.println("Name of Customer:" + e.getName());
			System.out.println("MobileNo of Customer:" + e.getmobileNo());
			System.out.println("Wallet Balance of Customer:" + e.getbalance());
		}
	}
}
