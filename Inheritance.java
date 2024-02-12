import java.util.Scanner;
class Employee{
    String name;
    int age;
    int phoneno;
    String address;
    double salary;
    void printditails()
    {
        System.out.println("NAME : "+name);
        System.out.println("AGE : "+age);
        System.out.println("PHONENO : "+phoneno);
        System.out.println("ADDRES : "+address);
       
    }
    void printsalary(){
        System.out.println("SALARY : "+salary);
    }
}
class Officer extends Employee{
    String specialization;
    void printspecialization(){
        System.out.println("SPECIALIZATION : "+specialization);
    }
}
class Manager extends Employee
{
    String department;
    void printdepartment()
    {
        System.out.println("DEPARTMENT : "+department);
    }
}
public class Inheritance
{
    public static void main(String [] args)
    {
        Officer x = new Officer();
        x.name="ganesh";
        x.age=23;
        x.phoneno=23567;
        x.address="ganeshbhavan";
        x.salary=17000;
        x.specialization="data is analysis and exploration";
        System.out.println();
        System.out.println();

        System.out.println("DETAILS OF OFFICER");
        System.out.println("-----------------------");
        x.printditails();
        x.printsalary();
        x.printspecialization();
        Manager y=new Manager();
        y.name="sudheer";
        y.age=24;
        y.phoneno=27383;
        y.address="sudheerbhavan";
        y.salary=17000;
        y.department="HR";


        System.out.println("DETAILS OF MANAGER");
        System.out.println("---------------------");
        y.printditails();
        y.printsalary();
        y.printdepartment();
    }
}