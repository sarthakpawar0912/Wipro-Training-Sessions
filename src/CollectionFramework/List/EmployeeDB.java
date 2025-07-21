package CollectionFramework.List;

import java.util.ArrayList;

public class EmployeeDB {

    ArrayList<Employee> list;

    public EmployeeDB() {
        list = new ArrayList<>();
    }

    boolean addEmployee(Employee e) {
        return list.add(e);
    }

    boolean deleteEmployee(int empId) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).empId == empId) {
                list.remove(i);
                return true;
            }
        }
        return false;
    }

    String showPaySlip(int empId) {
        for (Employee e : list) {
            if (e.empId == empId) {
                return "Pay Slip for Emp ID " + empId + ": Salary = " + e.salary;
            }
        }
        return "Employee not found";
    }
}

