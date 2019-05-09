class Cookie extends DessertByNumber 
{
	double pricePerDozen = 100 ;
	double price=0,tax=0,totalbill=0,taxRate=7;
	Cookie(String dessertName,int number)
	{
		super(dessertName,number);	
	}
	
	public double calculateprice() 
	{
		 price=number*pricePerDozen;
		 return price ;
	}
	public double calculateTax()
	{
		return tax=taxRate*price/100;
	}
	
		public double calculateBill()
	{
		return totalbill=tax+price ;
		
	}	
	
	public String toString()
	{
		return "Price of "+number+" dozen "+dessertName+ " is\t\t\t\t\t"+price;
	}
}