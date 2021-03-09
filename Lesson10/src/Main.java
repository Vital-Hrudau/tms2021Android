public class Main {

    public static void main(String[] args) throws ProductAlreadyExist, InvalidProductId {
        Shop shop = new Shop();
        Application application = new Application(shop);
        try {
            Product pr1 = new Product(0, "Polo", "Седан", 22000, 2);
            Product pr2 = new Product(1, "Pаssаt", "Седан", 32000, 1);
            Product pr3 = new Product(2, "Sharan", "Минивен", 26000, 1);
            Product pr4 = new Product(3, "Touran", "Минивен", 29000, 1);
            Product pr5 = new Product(4, "Touareg", "Кроссовер", 42000, 3);

            shop.getShop().add(0, pr1);
            shop.getShop().add(0, pr2);
            shop.getShop().add(0, pr3);
            shop.getShop().add(0, pr4);
            shop.getShop().add(0, pr5);

            application.start();
        } catch (ProductAlreadyExist | InvalidProductId ex) {
            ex.printStackTrace();
        } finally {
            application.start();
        }
    }
}
