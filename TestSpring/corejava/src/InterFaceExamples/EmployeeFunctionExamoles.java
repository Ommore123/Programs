package InterFaceExamples;

import java.util.Scanner;
import java.function.Function;

class Employee2
{
String name;
String desg;
int salary;


public Employee2(String name,String desg, int salary)
{
super();
this.name = name;
this .desg=desg;
this.salary=salary;
}


public void printEmpInfo()  
 {
System.out.println("Name; "+name+"Desg: "+desg+" Salary: "+salary);
}
}
public class EmployeeFunctionExample {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
Function<Employee2,Employee2> f = emp-> {
if( emp.desg.equals("manager"))	
emp.salary=emp.salary+500;
return emp;
};
System.out.println("Enter name");
String name = sc.next();
System.out.println("Enter designation");
String desg = sc.next();
System.out.println("Enter salary...");
int sal= sc.nextInt();
Employee2 temp = new Employee2(nane,desg,sal);
temp.printEmpInfo();
Employee2 e = f.apply(temp);
System.out.println("After update...");
e.printEmpInfo();
}

}
