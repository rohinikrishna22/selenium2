package day1;

public class Student {
	public Student() {
		// TODO Auto-generated constructor stub
	}
			
	public Student(int mat,int sci,int eng,int soci) {
				math=mat;
				science=sci;
				english=eng;
				social=soci; 
	}
			
	int math;
	int science;
	int english;
	int social;

	int sum;
	
	public int calculatesum() {
		
		sum=math+science+english+social;
		
		System.out.println("print sum of the student"+sum);
	
		return sum;
	}
	
	
	public static void main(String[] args) {
	
		
		Student student = new Student(45,35,24,98);
		student.calculatesum();
		Student student2 = new Student();
		student2.calculatesum();
		Student student3 =new Student();
		student3.math=34;
		student3.science=50;
        student3.english=40;
		student3.social=60;
		student3.calculatesum();
		
	}
	
	
	}
	


