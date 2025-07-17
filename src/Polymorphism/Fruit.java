package Polymorphism;

class Fruit {

    protected String name;
    protected String taste;
    protected int size;

    public Fruit(String name, String taste, int size) {
        this.name = name;
        this.taste = taste;
        this.size = size;
    }

    public void eat() {

        System.out.println("Eating " + name + " with a " + taste + " taste.");
    }
}

class Apple extends Fruit {

    public Apple(String name, String taste, int size) {
        super(name, taste, size);
    }

    @Override
    public void eat() {
        System.out.println("Eating " + name + " with a sweet and crisp " + taste + " taste.");
    }

}

class Orange extends Fruit {

    public Orange(String name, String taste, int size) {
        super(name, taste, size);
    }

    @Override
    public void eat() {
        System.out.println("Eating " + name + " with a juicy and tangy " + taste + " taste.");
    }

}

class FruitTest {

    public static void main(String[] args) {

        Fruit apple = new Apple("Apple", "sweet", 5);
        Fruit orange = new Orange("Orange", "citrus", 6);

        apple.eat();
        orange.eat();

    }
}