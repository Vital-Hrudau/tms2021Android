import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Shop {

    List<Product> shop = new LinkedList<>();

    public List<Product> getShop() {
        return shop;
    }

    public void sortPrice(Shop shop) {
        List<Product> sortListPrice = new LinkedList<>(shop.getShop());
        sortListPrice.sort(Comparator.comparing(Product::getPrice).reversed());
        System.out.println("Список всех товаров, сортированный по убыванию цены:");
        for (Product item : sortListPrice) {
            System.out.println(item.getName() + ". Цена: " + item.getPrice());
        }
    }

    public void sortPriceNonReversed(Shop shop) {
        List<Product> sortListPrice = new LinkedList<>(shop.getShop());
        sortListPrice.sort(Comparator.comparing(Product::getPrice));
        System.out.println("Список всех товаров, сортированный по возрастанию цены:");
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
            System.out.println("Добавлен товар: " + product.getName());
            System.out.println("Не забудьте загрузить склады (команда Загрузить (1))");
        }
    }

    public void addCountProduct(int id, int count) throws InvalidProductId {
        boolean added = false;
        for (int i = 0; i < shop.size(); i++) {
            if (shop.get(i).getId() == id) {
                System.out.println("Добавлено " + count + " единиц товара " + shop.get(i).getName());
                shop.get(i).setCount(shop.get(i).getCount() + count);
                added = true;
            }
        }
        if (!added) {
            throw new InvalidProductId("Товара с таким id не существует");
        }
    }

    public void buyCountProduct(int id, int count) throws InvalidProductId {
        boolean success = false;
        for (int i = 0; i < shop.size(); i++) {
            if (shop.get(i).getId() == id) {
                success = true;
                if (shop.get(i).getCount() >= count) {
                    shop.get(i).setCount(shop.get(i).getCount() - count);
                    int price = shop.get(i).getPrice() * count;
                    System.out.println("Куплено " + count + " единиц товара " + shop.get(i).getName()
                            + " на сумму " + price + " $.");
                } else {
                    System.out.println("Необходимое количество товара " + shop.get(i).getName() +
                            " отсутствует на складе");
                }
            }
        }
        if (!success) {
            throw new InvalidProductId("Товара с таким id не существует");
        }

    }

    public Shop showAllProducts(Shop shop) {
        System.out.println("Список всех товаров: ");
        for (Product product : shop.getShop()) {
            System.out.println(product.getName() + " " + product.getCount());
        }
        return shop;
    }

    public void removeProduct(int id) throws InvalidProductId {
        boolean delete = false;
        for (int i = 0; i < shop.size(); i++) {
            if (shop.get(i).getId() == id) {
                System.out.println("Удален товар: " + shop.get(i).getName());
                delete = true;
                shop.get(i).setCount(0);
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
            if (shop.get(i).getId() == p.getId()) {
                edit = true;
                shop.get(i).setName(p.getName());
                shop.get(i).setType(p.getType());
                shop.get(i).setPrice(p.getPrice());
                System.out.println("Изменённый товар: " + shop.get(i).getName() + ".Тип: " + shop.get(i).getType() +
                        ".Цена: " + shop.get(i).getPrice());
            }
        }
        if (!edit) {
            throw new InvalidProductId("Товара с таким id не существует");
        }
    }
}