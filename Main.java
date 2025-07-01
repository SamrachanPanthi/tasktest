class Product {
    int id;
    String name;
    double price;
    Product() {
        id = 0;
        name = "Unknown";
        price = 0.0;
    }
    Product(int id) {
        this.id = id;
        name = "Unknown";
        price = 0.0;
    }
    Product(int id, String name) {
        this.id = id;
        this.name = name;
        price = 0.0;
    }
    Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
    void display() {
        System.out.println("Product ID: " + id);
        System.out.println("Product Name: " + name);
        System.out.println("Product Price: Rs" + price);
        System.out.println("");
    }
}

public class Main {
    public static void main(String[] args) {
        Product p1 = new Product();
        Product p2 = new Product(101);
        Product p3 = new Product(102, "Laptop");
        Product p4 = new Product(103, "Smartphone", 599.99);

        p1.display();
        p2.display();
        p3.display();
        p4.display();
    }
}

