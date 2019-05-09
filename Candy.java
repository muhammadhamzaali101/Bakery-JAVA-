class Candy extends DessertByNumber
{
	final double pricePerDozen = 120 ;
	double totalbill=0,price=0,tax=0,taxRate=7;
	Candy( String dessertName,int number)
	{
		
		super(dessertName,number);
	}
	public double calculateprice () 
	{
		price= number*pricePerDozen ;
		return price ;
	}
	public double calculateTax()
	{
		tax=taxRate*price/100 ;
		return tax ;
	}	
	public double calculateBill()
	{
	      	return totalbill=tax+price;
	}	
	
	
	
	public String toString()
	{
		return "Price of  "+number+" dozen "+dessertName+ " is\t\t\t\t\t"+price;
	}
	
}
