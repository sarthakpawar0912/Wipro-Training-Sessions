package Videorental;
import java.util.ArrayList;
import java.util.Scanner;

class Video {

    private String videoName;
    private boolean checkout;
    private int rating;


    public Video(String name) {
        this.videoName = name;
        this.checkout = false;
        this.rating = 0;
    }


    public String getName() {
        return videoName;
    }


    public void doCheckout() {
        this.checkout = true;
    }


    public void doReturn() {
        this.checkout = false;
    }

    public void receiveRating(int rating) {

        if (rating >= 0 && rating <= 10) {
            this.rating = rating;

        }
    }

    public int getRating() {
        return rating;
    }

    public boolean getCheckout() {
        return checkout;
    }
}

class VideoStore {

    private ArrayList<Video> store;

    public VideoStore() {
        this.store = new ArrayList<>();
    }

    public void addVideo(String name) {
        store.add(new Video(name));
        System.out.println("Video \"" + name + "\" added successfully.");
    }

    public void doCheckout(String name) {

        for (Video v : store) {

            if (v.getName().equalsIgnoreCase(name) && !v.getCheckout()) {
                v.doCheckout();
                System.out.println("Video \"" + name + "\" checked out successfully.");
                return;
            }
        }
        System.out.println("Video \"" + name + "\" is not available.");
    }

    public void doReturn(String name) {
        for (Video v : store) {
            if (v.getName().equalsIgnoreCase(name) && v.getCheckout()) {
                v.doReturn();
                System.out.println("Video \"" + name + "\" returned successfully.");
                return;
            }
        }
        System.out.println("Video \"" + name + "\" is not checked out.");
    }

    public void receiveRating(String name, int rating) {
        for (Video v : store) {
            if (v.getName().equalsIgnoreCase(name)) {
                v.receiveRating(rating);
                System.out.println("Rating \"" + rating + "\" has been mapped to the Video \"" + name + "\".");
                return;
            }
        }
        System.out.println("Video \"" + name + "\" not found.");
    }

    public void listInventory() {
        if (store.isEmpty()) {
            System.out.println("Inventory is empty.");
            return;
        }
        System.out.println("Video Name | Checkout Status | Rating");
        for (Video v : store) {
            System.out.println(v.getName() + " | " + v.getCheckout() + " | " + v.getRating());
        }
    }
}

class VideoLauncher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        VideoStore store = new VideoStore();
        int choice;

        do {
            System.out.println("MAIN MENU");
            System.out.println("==========");
            System.out.println("1. Add Videos :");
            System.out.println("2. Check Out Video :");
            System.out.println("3. Return Video :");
            System.out.println("4. Receive Rating :");
            System.out.println("5. List Inventory :");
            System.out.println("6. Exit :");
            System.out.print("Enter your choice (1..6): ");

            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter the name of the video you want to add: ");
                    String addName = scanner.nextLine();
                    store.addVideo(addName);
                    break;
                case 2:
                    System.out.print("Enter the name of the video you want to check out: ");
                    String checkoutName = scanner.nextLine();
                    store.doCheckout(checkoutName);
                    break;
                case 3:
                    System.out.print("Enter the name of the video you want to Return: ");
                    String returnName = scanner.nextLine();
                    store.doReturn(returnName);
                    break;
                case 4:
                    System.out.print("Enter the name of the video you want to Rate: ");
                    String rateName = scanner.nextLine();
                    System.out.print("Enter the rating for this video: ");
                    int rating = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    store.receiveRating(rateName, rating);
                    break;
                case 5:
                    store.listInventory();
                    break;
                case 6:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 6.");
            }
        } while (choice != 6);

        scanner.close();
    }
}