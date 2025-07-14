package Inheritance;
import java.util.Scanner;
public class PersonMNGT{

    abstract class Person{

        String name;

        public Person(String name){
            this.name=name;
        }

        public String getName(){
            return name;
        }

        public void setName(String name){
            this.name=name;
        }

        abstract void displayInfo();

    }

    class Employee extends Person{

        double annualSalary;
        int startYear;
        String insuranceNumber;

        Employee(String name,double annualSalary,int startYear,String insuranceNumber){
            super(name);
            this.annualSalary=annualSalary;
            this.startYear=startYear;
            this.insuranceNumber=insuranceNumber;
        }

        public double getAnnualSalary(){
            return annualSalary;
        }

        public void setAnnualSalary(double annualSalary){
            this.annualSalary=annualSalary;
        }

        public int getStartYear(){
            return startYear;
        }

        public void setStartYear(int startYear){
            this.startYear=startYear;
        }

        public String getInsuranceNumber(){
            return insuranceNumber;
        }

        public void setInsuranceNumber(String insuranceNumber){
            this.insuranceNumber=insuranceNumber;
        }

        void displayInfo(){
            System.out.println("Name:"+name);
            System.out.println("Annual Salary:"+annualSalary);
            System.out.println("Start Year:"+startYear);
            System.out.println("Insurance Number:"+insuranceNumber);
        }

    }
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        PersonMNGT pm=new PersonMNGT();

        System.out.print("Enter name: ");
        String name=sc.nextLine();
        System.out.print("Enter salary: ");
        double salary=sc.nextDouble();
        System.out.print("Enter start year: ");
        int year=sc.nextInt();

        sc.nextLine();
        System.out.print("Enter insurance number: ");
        String insurance=sc.nextLine();

        Employee emp=pm.new Employee(name,salary,year,insurance);
        emp.displayInfo();


        System.out.print("Change salary: ");
        double newSalary=sc.nextDouble();

        emp.setAnnualSalary(newSalary);
        System.out.print("Change insurance number: ");
        sc.nextLine();

        String newInsurance=sc.nextLine();
        emp.setInsuranceNumber(newInsurance);

        System.out.println("Updated Employee Info:");
        emp.displayInfo();

    }
}