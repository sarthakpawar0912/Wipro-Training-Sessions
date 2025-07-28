package MultiThreading.MiniProject;

public class HareTortoiseRace extends Thread {

    private String name;

    private int distance;
    private static final int RACE_DISTANCE = 100;

    public HareTortoiseRace(String name) {
        this.name = name;
        this.distance = 0;
    }

    public void run() {
        while (distance < RACE_DISTANCE) {
            distance++;
            System.out.println(name + " has run " + distance + " meters");
            if (name.equals("Hare") && distance == 60) {
                try {
                    Thread.sleep(1000); // Hare sleeps for 1000 milliseconds
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println(name + " has finished the race!");
    }

    public static void main(String[] args) {
        HareTortoiseRace hare = new HareTortoiseRace("Hare");
        HareTortoiseRace tortoise = new HareTortoiseRace("Tortoise");

        // Set higher priority for Hare
        hare.setPriority(Thread.MAX_PRIORITY);
        tortoise.setPriority(Thread.MIN_PRIORITY);

        // Start the threads
        hare.start();
        tortoise.start();
    }
}