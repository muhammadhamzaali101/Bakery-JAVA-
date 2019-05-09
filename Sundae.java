class Sundae extends IceCream 
{
	int numberOfTopping ;
	final int pricePerTopping = 40 ;
	
	 Sundae (String dessertName,int number,int numberOfTopping)
	{
		super(dessertName,number);
		this.numberOfTopping=number ;
	}
	
	public double calculateprice () 
	{
		return price=number*(pricePerTopping+super.pricePerScoop);
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
		return "Price of "+number+" Scoop "+dessertName+" with "+numberOfTopping+" topping  is\t\t\t"+price;
	}
}