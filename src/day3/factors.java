package day3;

import java.util.Scanner;

public class factors {
	

		int number;
		static int count=0;

		public void findfactors()

		{ 

			for(int i=1; i<=number;i++)
			{
				if(number%i==0)
				{
					System.out.println(i+ "  ");
					count++;
				}
				     		
			}
			System.out.println("No of Fractions are"+count);
		}
		public static void main(String[] args) {


			factors f =new factors();
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the number:");
			f.number=sc.nextInt();
			f.findfactors();

		}

	}

