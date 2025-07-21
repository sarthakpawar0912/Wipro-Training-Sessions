package CollectionFramework.EmployeeVector;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorEmployee {

    public static void main(String[] args) {
        // Vector for storing Employee
        Vector<Employee> vector = new Vector<>();


        vector.add(new Employee(1, "Anushka"));
        vector.add(new Employee(2, "sarthak"));
        vector.add(new Employee(3, "Ramkrishna"));


        System.out.println("Using Iterator:");
        Iterator<Employee> iterator = vector.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println();


        System.out.println("Using Enumeration:");
        Enumeration<Employee> enumeration = vector.elements();
        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }
    }
}