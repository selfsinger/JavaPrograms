//Write a Program to add, find and display medicine's
//1. Name is not null, min chars is 4 , max chars is 50 
//2. Name should not be null 
//3. Add max of 10 Medicines 
//void addMedicine(String midicine);
//boolean find(String medicine);
//void displayMedicine();
class Medicine{
	String[] medicines = new String[10];
		int index;

	void addMedicine(String medicine)
	{
		System.out.println("Inside add method:");
		if(medicine!=null)
		{
			System.out.println("adding medicine:"+medicine);
			this.medicines[index]=medicine;
			this.index++;
		}
	}
	boolean find(String medicine)
	{
		System.out.println("Inside find method:");
		boolean found=false;
		for(int i=8;i<this.medicines.length;i++)
		{
			String med=this.medicines[i];
			if(med.equals(medicine))
			{
			System.out.println("medicne is found:"+medicine);
			found=true;
		    }
		}
	
	    if(!found)
	    {
	    	
			System.out.println("medicne is not found:"+medicine);
	    }
		
		return found;
		
        }

		void displayMedicine()
	{
		System.out.println("Inside display method:");
		for(int j=0;j<medicines.length;j++)
		{
			String medicine=this.medicines[j];
			System.out.println(medicine);
			System.out.println();
		}
	}
	}


