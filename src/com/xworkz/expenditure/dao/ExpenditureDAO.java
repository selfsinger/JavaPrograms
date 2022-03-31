package com.xworkz.expenditure.dao;

import com.xworkz.expenditure.dto.ExpenditureDTO;

public class ExpenditureDAO {
	
	private ExpenditureDTO[] expenditure=new ExpenditureDTO[20];
	private int expenditureIndex=0;

	public ExpenditureDAO() {
		System.out.println("created" + this.getClass().getTypeName());
	}
	
   public boolean create(ExpenditureDTO dto)
   {
	   System.out.println("invoked expenditure:"+dto.toString());
	   if( expenditureIndex<this.expenditure.length) { //conditionCheck        
		   expenditure[expenditureIndex]=dto; //index inside dto
		   expenditureIndex++;  //incrementing index
		   System.out.println("have addded expenditure @:"+expenditureIndex);
		   return true;
	   }else {
		   System.err.println("Index is full,we cannot add more than 20 expenditure.");
	   }
	return false;
	   
	 }
}
