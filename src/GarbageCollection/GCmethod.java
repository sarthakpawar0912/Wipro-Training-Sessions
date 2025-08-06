package GarbageCollection;

public class GCmethod {


    public static void main(String[] args) {
    // Create objects to make them eligible for garbage collection
    for (int i = 0; i < 1000; i++) {
        new String("Object " + i); // These objects lose reference immediately
    }

    // Request garbage collection
    System.out.println("Requesting Garbage Collection...");
    System.gc();

    // Optional: Sleep to observe GC behavior (not guaranteed)
    try {
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }

    System.out.println("Program continues after GC request.");
    }

}
