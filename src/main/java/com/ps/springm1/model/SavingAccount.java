package com.ps.springm1.model;

import com.ps.springm1.Card;

public class SavingAccount implements Account {
	
	private Card atmCard;
	
	public SavingAccount(Card card) {
		// TODO Auto-generated constructor stub
		atmCard = card;
	}
	
	@Override
	public String createAccount() {
		return "Saving account created successfully.";
	}

	@Override
	public String cardDetails() {
		// TODO Auto-generated method stub
		return atmCard.cardDetails();
	}
	
}
