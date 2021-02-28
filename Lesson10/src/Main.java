import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Shop shop = new Shop();
            Product pr1 = new Product(0, "Polo", "Седан", 22000);
            Product pr2 = new Product(1, "Passat", "Седан", 33000);
            Product pr3 = new Product(2, "Sharan", "Минивен", 26000);
            Product pr4 = new Product(3, "Touran", "Минивен", 29000);
            Product pr5 = new Product(4, "Touareg", "Кроссовер", 42000);
            shop.getShop().add(0, pr1);
            shop.getShop().add(0, pr2);
            shop.getShop().add(0, pr3);
            shop.getShop().add(0, pr4);
            shop.getShop().add(0, pr5);

            shop.sortPrice(shop);
            shop.removeProduct();
            shop.editProduct();
            shop.showAllProducts(shop);
        } catch (InvalidProductId ex) {
            ex.printStackTrace();
        }
    }
}
