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
		ExpenditureDTO dto2 = new ExpenditureDTO();
		dto2.setPersonName("Chetu");
		dto2.setSpentOn("Aari Needles");
		dto2.setAmount(2500);
		dto2.setTax(5);
		dto2.setExpenditurePeriod(ExpenditurePeriod.MONTHLY);
		System.out.println(dao.create(dto2));
		
		System.out.println();
		ExpenditureDTO dto3 = new ExpenditureDTO();
		dto3.setPersonName("Chandana");
		dto3.setSpentOn("shirt");
		dto3.setAmount(1000);
		dto3.setTax(5);
		dto3.setExpenditurePeriod(ExpenditurePeriod.QUATERLY);
		System.out.println(dao.create(dto3));
		
		System.out.println();
		ExpenditureDTO dto4 = new ExpenditureDTO();
		dto4.setPersonName("Pinkuu");
		dto4.setSpentOn("veena");
		dto4.setAmount(15500);
		dto4.setTax(18);
		dto4.setExpenditurePeriod(ExpenditurePeriod.YEARLY);
		System.out.println(dao.create(dto4));
		
		System.out.println();
		ExpenditureDTO dto5 = new ExpenditureDTO();
		dto5.setPersonName("Purnu");
		dto5.setSpentOn("sweatPants");
		dto5.setAmount(2000);
		dto5.setTax(15);
		dto5.setExpenditurePeriod(ExpenditurePeriod.QUATERLY);
		System.out.println(dao.create(dto5));
		
		System.out.println();
		ExpenditureDTO dto6 = new ExpenditureDTO();
		dto6.setPersonName("Sumanth");
		dto6.setSpentOn("books");
		dto6.setAmount(500);
		dto6.setTax(4);
		dto6.setExpenditurePeriod(ExpenditurePeriod.MONTHLY);
		System.out.println(dao.create(dto6));
		
		System.out.println();
		ExpenditureDTO dto7 = new ExpenditureDTO();
		dto7.setPersonName("sharanya");dto7.setSpentOn("tradOutfits");dto7.setAmount(3000);dto7.setTax(17);dto7.setExpenditurePeriod(ExpenditurePeriod.QUATERLY);
		System.out.println(dao.create(dto7));
		
		System.out.println();
		ExpenditureDTO dto8 = new ExpenditureDTO();
		dto8.setPersonName("Shashank");dto8.setSpentOn("watch");dto8.setAmount(3500);dto8.setTax(16);dto8.setExpenditurePeriod(ExpenditurePeriod.YEARLY);
		System.out.println(dao.create(dto8));
		
		System.out.println();
		ExpenditureDTO dto9 = new ExpenditureDTO();
		dto9.setPersonName("Renuka");dto9.setSpentOn("denim");dto9.setAmount(4000);dto9.setTax(19);dto9.setExpenditurePeriod(ExpenditurePeriod.YEARLY);
		System.out.println(dao.create(dto9));
		
		System.out.println();
		ExpenditureDTO dto10 = new ExpenditureDTO();
		dto10.setPersonName("sahana");dto10.setSpentOn("sarree");dto10.setAmount(5000);dto10.setTax(20);dto10.setExpenditurePeriod(ExpenditurePeriod.QUATERLY);
		System.out.println(dao.create(dto10));
		
		System.out.println();
		ExpenditureDTO dto11 = new ExpenditureDTO();
		dto11.setPersonName("sandeep");dto11.setSpentOn("mobile");dto11.setAmount(20000);dto11.setTax(25);dto11.setExpenditurePeriod(ExpenditurePeriod.YEARLY);
		System.out.println(dao.create(dto11));
		
		System.out.println();
		ExpenditureDTO dto12 = new ExpenditureDTO();
		dto12.setPersonName("Bharati");dto12.setSpentOn("SportsShoes");dto12.setAmount(6000);dto12.setTax(20);dto12.setExpenditurePeriod(ExpenditurePeriod.YEARLY);
		System.out.println(dao.create(dto12));
		
		System.out.println();
		ExpenditureDTO dto13 = new ExpenditureDTO();
		dto13.setPersonName("manjushree");dto13.setSpentOn("ornaments");dto13.setAmount(2000);dto13.setTax(13);dto13.setExpenditurePeriod(ExpenditurePeriod.YEARLY);
		System.out.println(dao.create(dto13));
		
		System.out.println();
		ExpenditureDTO dto14 = new ExpenditureDTO();
		dto14.setPersonName("netra");dto14.setSpentOn("silver");dto14.setAmount(4000);dto14.setTax(21);dto14.setExpenditurePeriod(ExpenditurePeriod.YEARLY);
		System.out.println(dao.create(dto14));
		
		System.out.println();
		ExpenditureDTO dto15 = new ExpenditureDTO();
		dto15.setPersonName("sheela");dto15.setSpentOn("sandals");dto15.setAmount(2300);dto15.setTax(14);dto15.setExpenditurePeriod(ExpenditurePeriod.QUATERLY);
		System.out.println(dao.create(dto15));
		
		System.out.println();
		ExpenditureDTO dto16 = new ExpenditureDTO();
		dto16.setPersonName("Neela");dto16.setSpentOn("toys");dto16.setAmount(1300);dto16.setTax(8);dto16.setExpenditurePeriod(ExpenditurePeriod.QUATERLY);
		System.out.println(dao.create(dto16));
		
		System.out.println();
		ExpenditureDTO dto17 = new ExpenditureDTO();
		dto17.setPersonName("Mamatha");dto17.setSpentOn("Groceries");dto17.setAmount(5000);dto17.setTax(12);dto17.setExpenditurePeriod(ExpenditurePeriod.MONTHLY);
		System.out.println(dao.create(dto17));
		
		System.out.println();
		ExpenditureDTO dto18 = new ExpenditureDTO();
		dto18.setPersonName("Chitra");dto18.setSpentOn("homeDeco");dto18.setAmount(5000);dto18.setTax(17);dto18.setExpenditurePeriod(ExpenditurePeriod.YEARLY);
		System.out.println(dao.create(dto18));
		
		System.out.println();
		ExpenditureDTO dto19 = new ExpenditureDTO();
		dto19.setPersonName("Satish");dto19.setSpentOn("camera");dto19.setAmount(50000);dto19.setTax(30);dto19.setExpenditurePeriod(ExpenditurePeriod.YEARLY);
		System.out.println(dao.create(dto19));
		
		System.out.println();
		ExpenditureDTO dto20 = new ExpenditureDTO();
		dto20.setPersonName("Pushpa");dto20.setSpentOn("jewels");dto20.setAmount(10000);dto20.setTax(34);dto20.setExpenditurePeriod(ExpenditurePeriod.YEARLY);
		System.out.println(dao.create(dto20));

	}

}
