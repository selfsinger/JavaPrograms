package com.xwrokz.washingmachine;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

import com.xwrokz.washingmachine.dto.WashingMachineDTO;
import com.xwrokz.washingmachine.type.WashingMachineType;

public class WashingMachineRunner {
	
	public static void main(String[] args) {
		WashingMachineDTO washingMachine1=new WashingMachineDTO(6453, "Bosch", 7.5, "grey", WashingMachineType.FRONT_LOAD, 75000,"WAT28460GB");
		
		WashingMachineDTO washingMachine2=new WashingMachineDTO(2345, "samsung", 4, "white",WashingMachineType.TOP_LOAD,4000, "WA65A4002VS");
		
		WashingMachineDTO washingMachine3=new WashingMachineDTO(5647, "whirlpool", 12,"Black",WashingMachineType.SEMI_AUTOMATC_WASHING_MACHINE,68400,"WA72A8092YR");
		
		WashingMachineDTO washingMachine4=new WashingMachineDTO(4563, "IFB", 10, "Blue",WashingMachineType.WASHER_DRYER_REFRESHER,55000,"WA72B5792UE");
		
		WashingMachineDTO washingMachine5=new WashingMachineDTO(6754, "LG",18,"pink", WashingMachineType.TOP_LOAD,85000,"WA82B9792RE");
		
		WashingMachineDTO washingMachine6=new WashingMachineDTO(8976, "godrej",9,"white", WashingMachineType.FRONT_LOAD,35000,"WA887B9792RE");
		
		WashingMachineDTO washingMachine7=new WashingMachineDTO(2335, "Panasonic",14,"grey",WashingMachineType.SEMI_AUTOMATC_WASHING_MACHINE, 57098,"WB87B97876RE");
		
		WashingMachineDTO washingMachine8=new WashingMachineDTO(7624, "Hafele",8,"black",WashingMachineType.WASHER_DRYER_REFRESHER, 40000,"WC876876RE");
		
		WashingMachineDTO washingMachine9=new WashingMachineDTO(7654, " Siemens",7,"red",WashingMachineType.FRONT_LOAD, 70000,"WC8787U6OP");
		
		WashingMachineDTO washingMachine10=new WashingMachineDTO(1423, " Haier",20,"white",WashingMachineType.TOP_LOAD, 103450,"WC899865RP");
		
		WashingMachineDTO washingMachine11=new WashingMachineDTO(7540, " Onida",8,"grey",WashingMachineType.TWIN_WASH, 90000,"WC8787U6OP");
		
		WashingMachineDTO washingMachine12=new WashingMachineDTO(2413, " Intex",10,"maroon",WashingMachineType.SEMI_AUTOMATC_WASHING_MACHINE, 55000,"WC88712U6OP");
		
		WashingMachineDTO washingMachine13=new WashingMachineDTO(9087, " Mitashi",11,"blue",WashingMachineType.TOP_LOAD, 89000,"WC87UI896OP");
		
		WashingMachineDTO washingMachine14=new WashingMachineDTO(1908, " MarQ ",6,"green",WashingMachineType.FRONT_LOAD, 65000,"WC8787U6OP");
		
		WashingMachineDTO washingMachine15=new WashingMachineDTO(5421, " BPL",8.5,"maroon",WashingMachineType.TOP_LOAD, 45000,"WC56287U6OP");
		
		WashingMachineDTO washingMachine16=new WashingMachineDTO(2567, " Midea",13,"white",WashingMachineType.FRONT_LOAD, 30000,"WC8787U6KL");
		
		WashingMachineDTO washingMachine17=new WashingMachineDTO(8012, " Sansui",8,"red",WashingMachineType.SEMI_AUTOMATC_WASHING_MACHINE, 90000,"WC87098I6OP");
		
		WashingMachineDTO washingMachine18=new WashingMachineDTO(9142, " Electrolux",5,"white",WashingMachineType.FRONT_LOAD, 56000,"WLk7867U6OP");
		
		WashingMachineDTO washingMachine19=new WashingMachineDTO(8712, " Videocon",8,"green",WashingMachineType.TOP_LOAD, 34000,"WC98GH87OP");
		
		WashingMachineDTO washingMachine20=new WashingMachineDTO(6521, " Hyundai",7.5,"black",WashingMachineType.TWIN_WASH, 42000,"WM45667U6KG");
		
		Collection<WashingMachineDTO> machine=new LinkedList<WashingMachineDTO>();
		
		machine.add(washingMachine1);
		machine.add(washingMachine2);
		machine.add(washingMachine3);
		machine.add(washingMachine4);
		machine.add(washingMachine5);
		machine.add(washingMachine6);
		machine.add(washingMachine7);
		machine.add(washingMachine8);
		machine.add(washingMachine9);
		machine.add(washingMachine10);
		machine.add(washingMachine11);
		machine.add(washingMachine12);
		machine.add(washingMachine13);
		machine.add(washingMachine14);
		machine.add(washingMachine15);
		machine.add(washingMachine16);
		machine.add(washingMachine17);
		machine.add(washingMachine18);
		machine.add(washingMachine19);
		machine.add(washingMachine20);
		
		System.out.println("total elments:"+machine.size());
		//System.out.println(machine.toString());
		System.out.println();
		
		for(WashingMachineDTO dto :machine) {
			//System.out.println(dto);
			if(dto.getPrice()>5000) {
				
				System.out.println("the machines whose value is greater than 5000");
			}
			
		}
		
		
		System.out.println();
		for(WashingMachineDTO dto :machine) {
			System.out.println(dto);
			if(dto.getPrice()<5000) {
				
				System.out.println("the machines whose value is less than 5000");
			}
			
		}
		
		System.out.println();
		Iterator<WashingMachineDTO> iterator=machine.iterator(); 
		while(iterator.hasNext()) {
			WashingMachineDTO e=iterator.next();
			System.out.println(e);
			if(e.getCapacity()>5)
			{
				System.out.println("Washing machine....whose capacity is greater than 5");
			}
			
		}
		
		for(WashingMachineDTO dto :machine) {
			System.out.println(dto);
			if(dto.getCapacity()>5 && dto.getCapacity()<15 ) {
				
				System.out.println("Washing machine....whose capacity is greater than 5 nd less than 15");
			}
			else {
				System.out.println("greater than 15");
			}
			
		}
		System.out.println();
		for(WashingMachineDTO dto :machine) {
			System.out.println(dto);
			if(dto.getCapacity()>15) {
				
				System.out.println("Washing machine....whose capacity is greater than 15");
			}
			else {
				System.out.println("less than 15");
				
			}
		}
	
		System.out.println();
		
		Iterator<WashingMachineDTO> iterator1=machine.iterator();
		while(iterator1.hasNext()) {
		WashingMachineDTO thing=iterator1.next();
		System.out.println(thing);
		if(thing.getCapacity()<5)
		{
			iterator1.remove();
		}
		}
	System.out.println("after removing..elements are:"+machine.size());
		
	System.out.println();
	for(WashingMachineDTO dto :machine) {
		System.out.println(dto);
		System.out.println("brand names in uppercase"+dto.getBrand().toUpperCase());
	}
	
	System.out.println();
	for(WashingMachineDTO dto:machine) {
		System.out.println(dto);
		if(dto.getBrand().contains("F")) {
			System.out.println("brand contains F in it");
			}
		else {
			System.out.println("its not contain F");
		}
	}
	System.out.println();
	for(WashingMachineDTO dto:machine) {
		System.out.println(dto);
		if(dto.getBrand().length()>10) {
			System.out.println("brand length have more than 10 characters");
			}
		else {
			System.out.println("not having more than 10 chars");
		}
	}
		
	}
}


