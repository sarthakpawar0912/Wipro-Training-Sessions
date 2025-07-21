package CollectionFramework.List;

public class EmployeeManagement {
    public static void main(String[] args) {
        EmployeeDB db = new EmployeeDB();

         Employee emp1 = new Employee(1, "Sarthak Pawar Deshmukh", "pawarsr06@gmail.com", "Male", 75000);
        Employee emp2 = new Employee(2, "Ashwin Nagane", "ashwin@gmail.com", "Male", 60000);
        db.addEmployee(emp1);
        db.addEmployee(emp2);

        System.out.println("Employee 1 Details:");
        emp1.getEmployeeDetails();
        System.out.println();

        System.out.println(db.showPaySlip(1));
        System.out.println(db.showPaySlip(3));
        System.out.println();

        System.out.println("Deleting Employee with ID 1: " + db.deleteEmployee(1));
        System.out.println("Trying to show pay slip after deletion: " + db.showPaySlip(1));
    }
}