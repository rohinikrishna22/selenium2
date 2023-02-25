package day3;

public class student_marks {
	int sub1,sub2,sub3,sub4;
	int sum,average;
	
	public student_marks()
	{
		
	}
	public student_marks(int s1 , int s2, int s3, int s4)
	{
		sub1 = s1;
		sub2 = s2;
		sub3 = s3;
		sub4 = s4;
	}
	
	public student_marks(int s1 , int s2, int s3)
	{  
		sub1 = s1;
		sub2 = s2;
		sub3 = s3;
		sub4 = 35;
		
	}
	
	public student_marks(int s1 , int s2)
	{ 
		sub1 = s1;
		sub2 = s2;
		sub3 = 35;
		sub4 = 35;
	}
	
	public void calculate()
	{
		
	sum = sub1+sub2+sub3+sub4;
	average = sum/4;
	System.out.println("The sum of the marks is :" +sum);
	System.out.println("The average marks :" +average);
	}
	
	
	
	public static void main(String[] args) {
		
		
		student_marks mark1 = new student_marks(70,80,90,60);
		mark1.calculate();		
		student_marks mark2 = new student_marks(90,60);
		mark2.calculate();
		student_marks mark3 = new student_marks(90,60,70);
		mark3.calculate();
		
	}

}


