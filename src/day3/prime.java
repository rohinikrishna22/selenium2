package day3;

public class prime {
	static int count=0;
	public void primenumbers() 
	{
	      for(int i=2 ; i<=60 ; i=i+2)
	        {

	    	  System.out.print(i);
	    	  System.out.print(" ");
	    	  count++;
	        }
	
	}
	
	public static void main(String[] args) 
	
	{
		prime p =new prime();
		p.primenumbers();
		System.out.println(" ");
		System.out.println("No of prime numbers is  :"+count); 
		
		
	}

}
