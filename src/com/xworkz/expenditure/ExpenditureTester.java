package com.xworkz.expenditure;

import com.xworkz.expenditure.constants.ExpenditurePeriod;
import com.xworkz.expenditure.dao.ExpenditureDAO;
import com.xworkz.expenditure.dto.ExpenditureDTO;

public class ExpenditureTester {

	public static void main(String[] args) {

		ExpenditureDTO dto = new ExpenditureDTO();
		dto.setPersonName("Megha");
		dto.setSpentOn("Outft");
		dto.setAmount(1500);
		dto.setTax(5);
		dto.setExpenditurePeriod(ExpenditurePeriod.QUATERLY);
		ExpenditureDAO dao = new ExpenditureDAO();
		boolean created = dao.create(dto);
		System.out.println("created:" + created);

		System.out.println();
		ExpenditureDTO dto1 = new ExpenditureDTO();
		dto1.setPersonName("Manju");
		dto1.setSpentOn("shoes");dto1.setAmount(2500);
		dto1.setTax(15);
		dto1.setExpenditurePeriod(ExpenditurePeriod.QUATERLY);
		System.out.println(dao.create(dto1));
		
		System.out.println();
		dto.setPersonName("Chetu");
		dto.setSpentOn("Aari Needles");
		dto.setAmount(2500);
		dto.setTax(5);
		dto.setExpenditurePeriod(ExpenditurePeriod.MONTHLY);
		System.out.println(dao.create(dto));
		
		System.out.println();
		dto1.setPersonName("Chandana");
		dto1.setSpentOn("shirt");
		dto1.setAmount(1000);
		dto1.setTax(5);
		dto1.setExpenditurePeriod(ExpenditurePeriod.QUATERLY);
		System.out.println(dao.create(dto1));
		
		System.out.println();
		dto1.setPersonName("Pinkuu");
		dto1.setSpentOn("veena");
		dto1.setAmount(15500);
		dto1.setTax(18);
		dto1.setExpenditurePeriod(ExpenditurePeriod.YEARLY);
		System.out.println(dao.create(dto1));
		
		System.out.println();
		dto1.setPersonName("Purnu");
		dto1.setSpentOn("sweatPants");
		dto1.setAmount(2000);
		dto1.setTax(15);
		dto1.setExpenditurePeriod(ExpenditurePeriod.QUATERLY);
		System.out.println(dao.create(dto1));
		
		System.out.println();
		dto1.setPersonName("Sumanth");
		dto1.setSpentOn("books");
		dto1.setAmount(500);
		dto1.setTax(4);
		dto1.setExpenditurePeriod(ExpenditurePeriod.MONTHLY);
		System.out.println(dao.create(dto1));
		
		System.out.println();
		dto1.setPersonName("sharanya");dto1.setSpentOn("tradOutfits");dto1.setAmount(3000);dto1.setTax(17);dto1.setExpenditurePeriod(ExpenditurePeriod.QUATERLY);
		System.out.println(dao.create(dto1));
		
		System.out.println();
		dto1.setPersonName("Shashank");dto1.setSpentOn("watch");dto1.setAmount(3500);dto1.setTax(16);dto1.setExpenditurePeriod(ExpenditurePeriod.YEARLY);
		System.out.println(dao.create(dto1));
		
		System.out.println();
		dto1.setPersonName("Renuka");dto1.setSpentOn("denim");dto1.setAmount(4000);dto1.setTax(19);dto1.setExpenditurePeriod(ExpenditurePeriod.YEARLY);
		System.out.println(dao.create(dto1));
		
		System.out.println();
		dto1.setPersonName("sahana");dto1.setSpentOn("sarree");dto1.setAmount(5000);dto1.setTax(20);dto1.setExpenditurePeriod(ExpenditurePeriod.QUATERLY);
		System.out.println(dao.create(dto1));
		
		System.out.println();
		dto1.setPersonName("sandeep");dto1.setSpentOn("mobile");dto1.setAmount(20000);dto1.setTax(25);dto1.setExpenditurePeriod(ExpenditurePeriod.YEARLY);
		System.out.println(dao.create(dto1));
		
		System.out.println();
		dto1.setPersonName("Bharati");dto1.setSpentOn("SportsShoes");dto1.setAmount(6000);dto1.setTax(20);dto1.setExpenditurePeriod(ExpenditurePeriod.YEARLY);
		System.out.println(dao.create(dto1));
		
		System.out.println();
		dto1.setPersonName("manjushree");dto1.setSpentOn("ornaments");dto1.setAmount(2000);dto1.setTax(13);dto1.setExpenditurePeriod(ExpenditurePeriod.YEARLY);
		System.out.println(dao.create(dto1));
		
		System.out.println();
		dto1.setPersonName("netra");dto1.setSpentOn("silver");dto1.setAmount(4000);dto1.setTax(21);dto1.setExpenditurePeriod(ExpenditurePeriod.YEARLY);
		System.out.println(dao.create(dto1));
		
		System.out.println();
		dto1.setPersonName("sheela");dto1.setSpentOn("sandals");dto1.setAmount(2300);dto1.setTax(14);dto1.setExpenditurePeriod(ExpenditurePeriod.QUATERLY);
		System.out.println(dao.create(dto1));
		
		System.out.println();
		dto1.setPersonName("Neela");dto1.setSpentOn("toys");dto1.setAmount(1300);dto1.setTax(8);dto1.setExpenditurePeriod(ExpenditurePeriod.QUATERLY);
		System.out.println(dao.create(dto1));
		
		System.out.println();
		dto1.setPersonName("Mamatha");dto1.setSpentOn("Groceries");dto1.setAmount(5000);dto1.setTax(12);dto1.setExpenditurePeriod(ExpenditurePeriod.MONTHLY);
		System.out.println(dao.create(dto1));
		
		System.out.println();
		dto1.setPersonName("Chitra");dto1.setSpentOn("homeDeco");dto1.setAmount(5000);dto1.setTax(17);dto1.setExpenditurePeriod(ExpenditurePeriod.YEARLY);
		System.out.println(dao.create(dto1));
		
		System.out.println();
		dto1.setPersonName("Satish");dto1.setSpentOn("camera");dto1.setAmount(50000);dto1.setTax(30);dto1.setExpenditurePeriod(ExpenditurePeriod.YEARLY);
		System.out.println(dao.create(dto1));
		
		System.out.println();
		dto1.setPersonName("Pushpa");dto1.setSpentOn("jewels");dto1.setAmount(10000);dto1.setTax(34);dto1.setExpenditurePeriod(ExpenditurePeriod.YEARLY);
		System.out.println(dao.create(dto1));
		
		
		




	}

}
