import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Shop {
    List<Product> shop = new LinkedList<>();
    Scanner scanner = new Scanner(System.in);

    public List<Product> getShop() {
        return shop;
    }

    public void sortPrice(Shop shop) {
        List<Product> sortListPrice = new LinkedList<>(shop.getShop());
        sortListPrice.sort(Comparator.comparing(Product::getPrice).reversed());
        System.out.println("Список всех товаров, сортированный по цене:");
        for (Product item : sortListPrice) {
            System.out.println(item.getName() + ". Цена: " + item.getPrice());
        }
    }

    public void addProduct(Product product) throws ProductAlreadyExist {
        int id = product.getId();
        boolean have = false;
        for (int i = 0; i < shop.size(); i++) {
            if (shop.get(i).getId() == id) {
                have = true;
                throw new ProductAlreadyExist("Товар с таким id уже существует");
            }
        }
        if (!have) {
            shop.add(0, product);
        }
    }

    public Shop showAllProducts(Shop shop) {
        System.out.println("Список всех товаров: ");
        for (Product product : shop.getShop()) {
            System.out.println(product.getName());
        }
        return shop;
    }

    public void removeProduct(int id) throws InvalidProductId {
        boolean delete = false;
        for (int i = 0; i < shop.size(); i++) {
            if (shop.get(i).getId() == id) {
                System.out.println("Удален товар: " + shop.get(i).getName());
                delete = true;
                shop.remove(i);
            }
        }
        if (!delete) {
            throw new InvalidProductId("Товара с таким id не существует");
        }
        System.out.println("Размер списка товаров: " + shop.size());
    }

    public void editProduct(Product p) throws InvalidProductId {
        boolean edit = false;
        for (int i = 0; i < shop.size(); i++) {
            if (shop.get(i) == p) {
                edit = true;
                String name = shop.get(i).getName();
                String type = shop.get(i).getType();
                System.out.println("Искомый товар: " + name + ".Тип: " + type);
                System.out.println("Введите новое название: ");
                String newName = scanner.nextLine();
                shop.get(i).setName(newName);
                System.out.println("Новое имя: " + newName);
                System.out.println("Введите новый тип: ");
                String newType = scanner.nextLine();
                shop.get(i).setType(newType);
                System.out.println("Изменённый товар: " + newName + ".Тип: " + newType);
            }
        }
        if (!edit) {
            throw new InvalidProductId("Товара с таким id не существует");
        }
    }
}