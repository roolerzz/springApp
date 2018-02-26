package com.ps.springm1;

import com.ps.springm1.model.Account;
import com.ps.springm1.model.CurrentAccount;
import com.ps.springm1.model.SavingAccount;

public class MyBankApp {
	public static void main(String[] args) {
		Account savAcc = new SavingAccount();
		System.out.println(savAcc.createAccount());
		Account curAcc = new CurrentAccount();
		System.out.println(curAcc.createAccount());
		
	}
}
