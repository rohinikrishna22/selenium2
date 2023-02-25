package day2;

public class Employee {

	int basicpay, boa, emp_level;
	double bonus, monthly_sal, tax, new_tax;
	double monthly_gross, yearly_tax, yearly_gross, pf, yearly_pf, yearly_after_pfgross, yearly_net;
	private int empId;
	private boolean oldTaxType=true;
    
	
	public void deriveTax() {
		 
		if (yearly_after_pfgross > 250000 && yearly_after_pfgross < 500000) {

			tax = .05;
			new_tax = .05;

		} else if (yearly_after_pfgross > 500000 && yearly_after_pfgross < 750000) {
			tax = .20;
			new_tax = .10;
		} else if (yearly_after_pfgross > 750000 && yearly_after_pfgross < 1000000) {
			tax = .20;
			new_tax = .15;
		} else if (yearly_after_pfgross > 1000000 && yearly_after_pfgross < 1250000) {
			tax = .30;
			new_tax = .20;

		} else if (yearly_after_pfgross > 1250000 && yearly_after_pfgross < 1500000) {
			tax = .30;
			new_tax = .25;

		} else if (yearly_after_pfgross > 1500000) {
			tax = .30;
			new_tax = .30;
		}

	}
	
    void init(int level) {
    	empId=level;
       if (level==1) {
    	   basicpay=7000;
    	   boa=5000;
    	   bonus=2000;
       } else if(level==2) {
    	   basicpay=10000;
           boa=7000;
           bonus=2500;
       }else if(level==3) {
    	   basicpay=12000;
    	   boa=9000;
    	   bonus=3000;
       }else if(level==4) {
    	   basicpay=15000;
    	   boa=10000;
    	   bonus=3500;
       }
       
    }

	void calculate() {
		
		monthly_gross = basicpay + boa + bonus;
		yearly_gross = monthly_gross * 12;
		yearly_pf = yearly_gross * .12;
		yearly_after_pfgross = yearly_gross - yearly_pf;
		deriveTax();
		if(oldTaxType) {
			yearly_tax = yearly_after_pfgross * tax;
		}else {
			yearly_tax = yearly_after_pfgross * new_tax;
		}
	
		yearly_net = yearly_after_pfgross - yearly_tax;
		monthly_sal = yearly_net / 12;
        
		System.out.println("Employee "+empId+" monthly salary is " + monthly_sal);

	}
	
	public static void main(String[] args) {
		
	Employee emp_1=new Employee();
	emp_1.init(1);
	emp_1.calculate();
	
	Employee emp_2=new Employee();
	emp_2.init(2);
	emp_2.calculate();
	
	Employee emp_3=new Employee();
	emp_3.init(3);
	emp_3.calculate();
	
	Employee emp_4=new Employee();
	emp_4.init(4);
	emp_4.calculate();
	
	}

}
