package MultiThreading.Practice;

class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread running: " + i);
            try {
                Thread.sleep(500); // Sleep for 500ms
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        MyThread t1 = new MyThread(); // Create thread object
        t1.start(); // Start the thread

        for (int i = 1; i <= 5; i++) {
            System.out.println("Main thread: " + i);
            try {
                Thread.sleep(500); // Sleep for 500ms
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
