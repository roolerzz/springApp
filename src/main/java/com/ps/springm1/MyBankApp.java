package com.ps.springm1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ps.springm1.model.Account;
import com.ps.springm1.model.CurrentAccount;
import com.ps.springm1.model.SavingAccount;

public class MyBankApp {
	public static void main(String[] args) {
		/*Account savAcc = new SavingAccount();
		System.out.println(savAcc.createAccount());
		Account curAcc = new CurrentAccount();
		System.out.println(curAcc.createAccount());*/
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/resources/applicationContext.xml");
		Account acc = context.getBean("myAccount",Account.class);
		System.out.println(acc.createAccount());
		System.out.println(acc.cardDetails());
		
		Account cur = context.getBean("curAccount",Account.class);
		System.out.println(cur.createAccount());
		System.out.println(cur.cardDetails());
	}
}
