class Brownie extends DessertByNumber
{
	double price=0,tax=0,totalbill=0,taxRate=7;
	int pricePeritem = 150 ;
	 Brownie( String dessertName , int number)
	{
		super(dessertName , number) ;
	
	}
	
	public double calculateprice () 
	{
		return price=number*pricePeritem;
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
		return "Price of "+number+" "+dessertName+ " is\t\t \t\t\t\t"+price;
	}
}