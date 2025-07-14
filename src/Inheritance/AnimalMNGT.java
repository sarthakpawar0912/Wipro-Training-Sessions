package Inheritance;
import java.util.Scanner;

public class AnimalMNGT {

    class Animal{
        String name;
        public Animal(String name){
            this.name=name;
        }
        void eat(){
            System.out.println(name+" is eating.");
        }
        void sleep(){
            System.out.println(name+" is sleeping.");
        }
    }

    class Bird extends Animal{

        boolean canFly;
        Bird(String name,boolean canFly){
            super(name);
            this.canFly=canFly;
        }

        void eat(){
            System.out.println(name+" is eating   food.");
        }

        void sleep(){
            System.out.println(name+" is sleeping in nest.");
        }

        void fly(){
            System.out.println(name+(canFly?" is flying high!":" can't fly."));
        }
    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        AnimalMNGT am=new AnimalMNGT();
        System.out.print("Animal name: ");
        String animalName=sc.nextLine();

        Animal animal=am.new Animal(animalName);
        animal.eat();
        animal.sleep();

        System.out.print("Bird name: ");
        String birdName=sc.nextLine();
        System.out.print("Can fly (true/false): ");
        boolean canFly=sc.nextBoolean();

        Bird bird=am.new Bird(birdName,canFly);
        bird.eat();
        bird.sleep();
        bird.fly();
    }
}