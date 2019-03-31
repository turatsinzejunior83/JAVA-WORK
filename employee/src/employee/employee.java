package employee;
import java.util.*;

public class employee {

	public int option;
	public int gross_salary;
	public int rssb;
	public int net_salary;
	public int salary;
	public int tax;
	public String name;
	public int hour;

	public static class monthly extends employee{
		public void emp1()
		{
			Scanner in = new Scanner(System.in);
			System.out.println("Enter salary per monthly");
			salary=in.nextInt();
			
		tax= (salary*30)/100;
		rssb=(salary*3)/100;
		net_salary=salary-(tax+rssb);
		
		
		}
		
		
	}
	public static class week extends employee{
		public void emp2(){
			System.out.println("Enter salary per week");
			Scanner in = new Scanner(System.in);
			salary=in.nextInt();
			net_salary=salary;
			
		}
	}
	public static class hour extends employee{
		
	public  int emp3(){
		System.out.println("Please enter number of hours");
		Scanner in = new Scanner(System.in);
		hour = in.nextInt();
		System.out.println("Please enter salary per hours");
		salary = in.nextInt();
		
		if(hour<=40){
		return(net_salary = hour*salary);
		
		}
		else{
			return(net_salary=(hour*salary)+((40-hour)*salary));
			
			
		}
	}
	}


	
	public  static void main(String[] args) {
		
		hour b = new hour();
        week c=new week();
        monthly d=new monthly();
		System.out.println("Please enter employee name:");
		Scanner in = new Scanner(System.in);
      b.name=in.nextLine();
        System.out.println("Please select option of emp according to option:");
        System.out.println("______________________________________________");
        System.out.println("1.monthly,2.weekly,3.hour");
        b.option=in.nextInt();
        System.out.println("name is "+b.name);
		if(b.option==1)
		{
			d.emp1();
			System.out.println("Salary is: "+d.net_salary);
			
		}
		else if(b.option==2){
			c.emp2();
			System.out.println("Salary is: "+c.net_salary);
		}
		else if(b.option==3){
		    b.emp3();
			System.out.println("Salary is: "+b.net_salary);
			
		}
		else{
			System.out.println("Invalid option!");
		}
                
		
		}
	
}



