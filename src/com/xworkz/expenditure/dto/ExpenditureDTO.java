package com.xworkz.expenditure.dto;

import com.xworkz.expenditure.constants.ExpenditurePeriod;

public class ExpenditureDTO {
	
	double amount;
	double tax;
	ExpenditurePeriod expenditurePeriod;
	String spentOn,personName;
	
	public ExpenditureDTO()
	{
		System.out.println("created:"+this.getClass().getSimpleName());
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

	public ExpenditurePeriod getExpenditurePeriod() {
		return expenditurePeriod;
	}

	public void setExpenditurePeriod(ExpenditurePeriod expenditurePeriod) {
		this.expenditurePeriod = expenditurePeriod;
	}

	public String getSpentOn() {
		return spentOn;
	}

	public void setSpentOn(String spentOn) {
		this.spentOn = spentOn;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}
	
	

}
