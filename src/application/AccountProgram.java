package application;

import java.util.Locale;

import entities.Account;
import entities.BusinnessAccount;

public class AccountProgram {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Account accOne = new Account(234, "Richard Gap", 1000.0);
		BusinnessAccount accTwo = new BusinnessAccount(248, "Frank Richard", 1000.0, 500.00);	
		
		accOne.withdraw(300.0);
		
		System.out.println(accOne.getBalance());

		accTwo.loan(200.0);
		
		accTwo.withdraw(100.0);
		
		System.out.println(accTwo.getBalance());
	}

}
