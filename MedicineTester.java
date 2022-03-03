class MedicineTester{
public static void main(String[] med)
{
Medicine medicine = new Medicine();
	medicine.addMedicine("Vicodin (hydrocodone/acetaminophen)");
	medicine.addMedicine("Albuterol (Accuneb, Ventolin, Proair, Proventil)");
	medicine.addMedicine("Lisinopril (Generic for Prinivil or Zestril)");
	medicine.addMedicine("Levothyroxine (generic for Synthroid)");
	medicine.addMedicine("Gabapentin (Neurontin)");
	medicine.addMedicine("Metformin (generic for Glucophage)");
	medicine.addMedicine("Lipitor (atorvastatin)");
	medicine.addMedicine("paracetamol");
	medicine.addMedicine("Amlodipine (generic for Norvasc)");
	medicine.addMedicine("Omeprazole (Prilosec)");
	//medicine.addMedicine("CycloSporine");
	System.out.println();
	
	medicine.find("Omeprazole (Prilosec)");
	medicine.find("Amlodipine (generic for Norvasc)");
	
	System.out.println();
	medicine.displayMedicine();



	}
	}



