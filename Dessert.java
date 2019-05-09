abstract class Dessert
{
	double taxRate=7 ;
    String dessertName ;
	
	 Dessert( String dessertName)
	{
	
		this.dessertName=dessertName ;
		
	} 
	public abstract double calculateprice();
    public	abstract double calculateBill() ;
	
	public abstract double calculateTax() ;
	
	public abstract String toString() ;
	
}


