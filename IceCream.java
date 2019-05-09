class IceCream extends DessertByNumber
{
	double price=0,tax=0,totalbill=0,taxRate=7;
	final int  pricePerScoop = 100 ;
	
	IceCream(String dessertName,int number)
	{
		super(dessertName,number);
		
	}
	
	public double calculateprice () 
	{
		return price=number*pricePerScoop;
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
		return "Price of  "+number+" scoop of  "+dessertName+ " is\t\t\t\t\t"+price;
	}
	
	
}
