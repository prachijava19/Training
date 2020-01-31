package com.designPatterns;

public class CitiBank {
	
	Bank bank;
	
	
	CitiBank(Bank bank)
	{
		this.bank = bank;
	}
	
	void setBank(Bank bank)
	{
		this.bank = bank;
	}
	
	
	
	//new CitiBank().setBank(new Bank());
	
	

}
