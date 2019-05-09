import java.util.*;
public class Invoice
{
	public static void main(String[]args)
	{
		
		System.out.print("		WELCOME TO KC MENUE\nBrownie				Rs.150/piece\nPastry				Rs.120/piece\nCookie	  	 	        Rs.100/dozen\nCake without fondant topping	Rs.1000/lb\nCake with fondant topping       Rs.1500/lb\nIce cream			Rs.100/scoop\ntopping for Sundae		Rs.40/topping\nCandy				Rs.120/dozen\nTax				7%\n\n\n");
	
		ArrayList<Dessert> D =new ArrayList<Dessert>();
		double TotalTax=0,TotalBill=0,Total=0;
		String dessertName=null;
		int number =0;

		System.out.print("\nWhat you want to purchanse ?\nEnter the name of dessert or type exit to exit:\n");
		Scanner in=new Scanner(System.in);
		dessertName=in.nextLine() ;
		dessertName=dessertName.toUpperCase();
		while (!dessertName.equals("EXIT"))
			
		{
		Scanner input=new Scanner(System.in);
		if(dessertName.equals("CANDY"))
		{
		System.out.print("Enter the number of dozons of Candies\n");
		number=in.nextInt();
		D.add(new Candy(dessertName,number));

		System.out.print("\n\nWhat you want to purchanse ?\nEnter the name of dessert or type exit to exit:\n");
		dessertName=input.nextLine();
		dessertName=dessertName.toUpperCase();
		}
		
		else if(dessertName.equals("COOKIE"))
		{
		System.out.print("Enter the number dozons of of Cookie\n");
		number=in.nextInt();
		D.add(new Cookie(dessertName,number));
		
		System.out.print("\n\nWhat you want to purchanse ?\nEnter the name of dessert or type exit to exit:\n");
		dessertName=input.nextLine();
		dessertName=dessertName.toUpperCase();
		}
	
	   else if(dessertName.equals("CAKE"))
	   {
		   int pricePerLb;
			System.out.println("Do you want a plain cake or a cake with fondant dressing ? p for plain and f for fondant dressing");
			char dressing=in.next().charAt(0) ;
			 if(dressing=='f')
			 {
				 pricePerLb = 1500 ;
			 }
			else
			{
				pricePerLb = 1000 ;
			}
			
		    System.out.print("Enter the number of Pounds for the cake\n");
			number=in.nextInt();
			
			D.add(new Cake(dessertName,number,pricePerLb));
			
			System.out.print("\nWhat you want to purchanse ?\nEnter the name of dessert or type exit to exit:\n");
			dessertName=input.nextLine();
			dessertName=dessertName.toUpperCase();
	   }		   
		
		else if(dessertName.equals("BROWNIE"))
	   {
		    System.out.print("Enter the number of Brownies\n");
			number=in.nextInt();
			D.add(new Brownie(dessertName,number));
			
			System.out.print("\n\nWhat you want to purchanse ?\nEnter the name of dessert or type exit to exit:\n");
			dessertName=input.nextLine();
			dessertName=dessertName.toUpperCase();
	   }

		else if(dessertName.equals("PASTRY"))
	   {
		    System.out.print("Please Enter the number of Patries you want to buy\n");
			number=in.nextInt();
			D.add(new Pastry(dessertName,number));
			
			System.out.print("\n\nWhat you want to purchanse ?\nEnter the name of dessert or type exit to exit:\n");
			dessertName=input.nextLine();
			dessertName=dessertName.toUpperCase();
	   }		 
		
		else if(dessertName.equals("SUNDAE"))
	   {
		    System.out.print("Enter the number of Scoop for Sundae \n");
			number=in.nextInt();
			System.out.print("Enter the Flavour for sundae\n");
			int topping=in.nextInt();
			D.add(new Sundae(dessertName,number,topping));
			
			System.out.print("\n\nWhat you want to purchanse ?\nEnter the name of dessert or type exit to exit:\n");
			dessertName=input.nextLine();
			dessertName=dessertName.toUpperCase();
	   }		 
	   
	   else if(dessertName.equals("ICE"))
	   {
		    System.out.print("Enter the number of scoops you want for Icecream \n");
			number=in.nextInt();
			D.add(new IceCream(dessertName,number));
			
			System.out.print("\n\nWhat you want to purchanse ?\nEnter the name of dessert or type exit to exit:\n");
			dessertName=input.nextLine();
			dessertName=dessertName.toUpperCase();
	   }	
	    else
		{
			 
			 System.out.print("\nPlease Enter Valid Input!\n");
			 System.out.print("What you want to purchanse ?\nEnter the name of dessert or type exit to exit:\n");
	         dessertName=input.nextLine();
			 dessertName=dessertName.toUpperCase();
		}	
		
	}
	
	

		for (Dessert d:D)
		{
			
			d.calculateprice();
			d.calculateTax();
			System.out.println(d.toString()) ;
		
		}
		

		for (Dessert d:D)
		{
			Total=Total+d.calculateBill();
			TotalBill=TotalBill+d.calculateprice();
			TotalTax=TotalTax+d.calculateTax();
		}
		
		
		 System.out.println("Total Cost\t\t\t\t\t\t\t"+TotalBill);
		 System.out.println("Tax       \t\t\t\t\t\t\t"+TotalTax);
		 System.out.println("*****************************************************************************");
		 System.out.println("Total Bill  \t\t\t\t\t\t\t"+Total);
		 System.out.println("*****************************************************************************");
		 
		 System.out.println("THANK YOU FOR COMING :) :) \n HAVE A GOOD DAY AHEAD");
		
		 
	
	
	
	
	}  
}