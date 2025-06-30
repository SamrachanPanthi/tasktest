class Inheritance {
    String brand;

    Inheritance(String brand) {
        this.brand = brand;
    }

    void start() {
        System.out.println("Vehicle is starting");
    }
}

class Car extends Inheritance {
    String modelName;

    Car(String brand, String modelName) {
        super(brand);  
        this.modelName = modelName;
    }

    @Override
    void start() {
        System.out.println(brand + " " + modelName + " car is starting");
    }
}

public class Inheritances {
    public static void main(String[] args) {
        Inheritance v = new Inheritance(" abcd");
        v.start();  

        Car c = new Car("BYD", "aabbbcc");
        c.start();  
    }
}