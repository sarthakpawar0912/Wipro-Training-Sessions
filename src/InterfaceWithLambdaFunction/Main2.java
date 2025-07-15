package InterfaceWithLambdaFunction;

public class Main2 {
    public static void main(String[] args) {
        // Lambda expression for t1 to add three numbers
        Test t1 = (a, b, c) -> a + b + c;

        // Lambda expression for t2 to multiply three numbers
        Test t2 = (a, b, c) -> a * b * c;

        // Test with values 2, 3, 4
        int result1 = t1.myFunction(2, 3, 4);
        int result2 = t2.myFunction(2, 3, 4);

        // Print results
        System.out.println("Addition result: " + result1); // Should print 9
        System.out.println("Multiplication result: " + result2); // Should print 24
    }
}