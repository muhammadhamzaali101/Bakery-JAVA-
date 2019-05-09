class Cake extends DessertByWeight
{
	
	double price=0,tax=0,totalbill=0,taxRate=7;
	
	
	 final int  pricePerLb  ;
	   
	
	Cake( String dessertName,int weight,int pricePerLb)
	{	
		super(dessertName,weight);
		this.pricePerLb = pricePerLb;
	}
	
	
	public double calculateprice() 
	{
	
		price= weight*pricePerLb ;
		
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
		return "Price of "+weight+"Lb "+dessertName+ " is\t\t\t\t\t\t"+price;
	}
}