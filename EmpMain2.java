class Emp{
	String name,desig;
	int age,salary;
	Emp(String name,int age,int salary,String desig){
		this.name=name;
		this.age=age;
		this.salary=salary;
		this.desig=desig;
	}
	public void display(){
		System.out.println("Name:"+name+",age:"+age+",salary:"+salary+",desig:"+desig);
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
		System.out.println("Salary:"+salary);
		System.out.println("Desig:"+desig);
		System.out.println();
	}
	 public void raiseSalary(){
		salary+=2000;
	}
	
}
class Tester extends Emp{
	Tester(String name,int age){
		super(name,age,15000,"Tester");
	
	}


}
class Programmer extends Emp{
	Programmer(String name,int age){
		super(name,age,30000,"Programmer");
	
	}
	public void raiseSalary(){
		salary+=5000;
	}
}
class Manager extends Emp{
	Manager(String name,int age){
		super(name,age,90000,"Manager");
	
	}
	public void raiseSalary(){
		salary+=10000;
	}
}
public class EmpMain2{
	public static void main(String args[]){
		Emp e1 = new Tester("Ravi",20);
		Emp e2 = new Programmer("Prashanth",23);
		Emp e3 = new Manager("Mamtha",21);
		e1.display();
		e2.display();
		e3.display();

		e1.raiseSalary();
		e2.raiseSalary();
		e3.raiseSalary();



		
		e1.display();
		e2.display();
		e3.display();
	}
}
		




		





		



