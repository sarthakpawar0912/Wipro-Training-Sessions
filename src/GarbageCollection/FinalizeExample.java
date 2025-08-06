package GarbageCollection;

public class FinalizeExample {

    private String name;

    public FinalizeExample(String name) {
        this.name = name;
    }

    // Override finalize() method
    @Override
    protected void finalize() throws Throwable {
        try {
            System.out.println("Finalizing object: " + name);
            // Perform cleanup (e.g., closing resources)
        } finally {
            super.finalize();
        }
    }

    public static void main(String[] args) {
        // Create objects
        FinalizeExample obj1 = new FinalizeExample("Object 1");
        FinalizeExample obj2 = new FinalizeExample("Object 2");

        // Make objects eligible for garbage collection
        obj1 = null;
        obj2 = null;

        // Request garbage collection
        System.out.println("Requesting GC...");
        System.gc();

        // Sleep to allow GC to run (not guaranteed)
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {

            e.printStackTrace();
        }

        System.out.println("Main method ends.");
    }
}