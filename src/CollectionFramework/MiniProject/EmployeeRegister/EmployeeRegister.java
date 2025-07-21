package CollectionFramework.MiniProject.EmployeeRegister;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class EmployeeRegister {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Employee> employeeList = new ArrayList<>();

        // here we will get to total numbers of employee
        System.out.print("Enter the Number of Employees: ");
        int numEmployees = sc.nextInt();

        // here we will collect employee data
        for (int i = 1; i <= numEmployees; i++) {

            System.out.println("Enter Employee " + i + " Details:");

            System.out.print("Enter the Firstname: ");
            String firstName = sc.nextLine();

            System.out.print("Enter the Lastname: ");
            String lastName = sc.nextLine();

            System.out.print("Enter the Mobile: ");
            String mobileNumber = sc.nextLine();

            System.out.print("Enter the Email: ");
            String email = sc.nextLine();

            System.out.print("Enter the Address: ");
            String address = sc.nextLine();

            Employee emp = new Employee(firstName, lastName, mobileNumber, email, address);
            employeeList.add(emp);
        }

        // sort employees by their first name
        Collections.sort(employeeList, (e1, e2) -> e1.firstName.compareTo(e2.firstName));

        System.out.println("\nEmployee List:");
        for (Employee emp : employeeList) {
            System.out.format("%-15s %-15s %-15s %-30s %-45s%n", emp.firstName, emp.lastName, emp.mobileNumber, emp.email, emp.address);
        }
    }
}