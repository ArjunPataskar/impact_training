class ShoppingCart {
    void addItem(String name) {
        System.out.println("Added item: " + name + " | Quantity: 1 | Price: 0.0");
    }

    void addItem(String name, int quantity) {
        System.out.println("Added item: " + name + " | Quantity: " + quantity + " | Price: 0.0");
    }

    void addItem(String name, int quantity, double price) {

        System.out.println("Added item: " + name + " | Quantity: " + quantity + " | Price: " + price);
    }
}

public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        cart.addItem("Pen");                             
        cart.addItem("Notebook", 3);                    
        cart.addItem("Backpack", 1, 800);             
    }
}
 



