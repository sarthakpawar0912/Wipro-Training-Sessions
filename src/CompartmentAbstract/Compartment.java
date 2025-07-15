package CompartmentAbstract;
import java.util.Random;

abstract class Compartment {

    public abstract String notice();

}

class FirstClass extends Compartment {

    @Override
    public String notice() {
        return "This is a First Class compartment.";
    }
}

class Ladies extends Compartment {
    @Override
    public String notice() {
        return "This is a Ladies compartment.";
    }
}

class General extends Compartment {
    @Override
    public String notice() {
        return "This is a General compartment.";
    }
}

class Luggage extends Compartment {
    @Override
    public String notice() {
        return "This is a Luggage compartment.";
    }
}

class TestCompartment {
    public void test() {
        Compartment[] compartments = new Compartment[4];
        Random random = new Random();

        for (int i = 0; i < 4; i++) {
            int type = random.nextInt(4) + 1;
            switch (type) {
                case 1:
                    compartments[i] = new FirstClass();
                    break;
                case 2:
                    compartments[i] = new Ladies();
                    break;
                case 3:
                    compartments[i] = new General();
                    break;
                case 4:
                    compartments[i] = new Luggage();
                    break;
            }
        }

        System.out.println("Compartment Notices:");
        for (int i = 0; i < 4; i++) {
            System.out.println("Compartment " + (i + 1) + ": " + compartments[i].notice());
        }
    }

    public static void main(String[] args) {
        TestCompartment test = new TestCompartment();
        test.test();
    }
}