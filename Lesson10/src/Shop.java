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
        for (int i = 0; i < shop.size(); i++) {
            if (product.getId() == shop.get(i).getId()) {
                throw new ProductAlreadyExist("Товар с таким id уже существует");
            } else shop.add(product);
            break;
        }
    }

    public Shop showAllProducts(Shop shop) {
        System.out.println("Список всех товаров: ");
        for (Product product : shop.getShop()) {
            System.out.println(product.getName());
        }
        return shop;
    }

    public void removeProduct() throws InvalidProductId {
        System.out.println("Введите id товара, который хотите удалить: ");
        int id = scanner.nextInt();
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

    public void editProduct() throws InvalidProductId {
        System.out.println("Введите id товара, который хотите редактировать: ");
        int id = scanner.nextInt();
        boolean edit = false;
        for (int i = 0; i < shop.size(); i++) {
            if (shop.get(i).getId() == id) {
                edit = true;
                String name = shop.get(i).getName();
                String type = shop.get(i).getType();
                System.out.println("Искомый товар: " + name + ".Тип: " + type);
                System.out.println("Введите новое название: ");
                String newName = scanner.nextLine();
                newName = scanner.nextLine();
                shop.get(i).setName(newName);
                System.out.println("Новое имя: " + newName);
                System.out.println("Введите новый тип: ");
                String newType = scanner.nextLine();
                shop.get(i).setType(newType);
                System.out.println("Изменённый товар: " + newName + ".Тип: " + newType);
            }
            }
        if(!edit){
            throw new InvalidProductId("Товара с таким id не существует");
        }
        }
    }