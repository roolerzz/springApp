package com.ps.springm1.model;

import com.ps.springm1.Card;

public class CurrentAccount implements Account {
	
	private Card creditCard;
	
	public void setCreditCard(Card creditCard) {
		this.creditCard = creditCard;
	}

	@Override
	public String createAccount() {
		return "current Account created Successfully." ;
	}

	@Override
	public String cardDetails() {
		// TODO Auto-generated method stub
		return this.creditCard.cardDetails();
	}

}
