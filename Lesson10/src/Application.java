import java.util.Scanner;

public class Application {
    private Shop shop = new Shop();

    public Shop getShop() {
        return shop;
    }

    public void Start() throws ProductAlreadyExist, InvalidProductId {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите действие (Вывод всех товаров," +
                " Добавление товара, Удаление товара, Редактирование товара, Выход):");
        String console = scanner.nextLine();

        do {
            if (console.equals("Вывод всех товаров") || console.equals("Вывод")) {
                System.out.println("В какой сортировке вывести? (По цене или По добавлению)");
                String sort = scanner.nextLine();
                if (sort.equals("По цене")) {
                    System.out.println("По возрастанию или По убыванию?");
                    String priceSort = scanner.nextLine();
                    switch (priceSort) {
                        case "По возрастанию":
                            shop.sortPriceNonReversed(shop);
                            break;
                        case "По убыванию":
                            shop.sortPrice(shop);
                            break;
                    }
                }
                if (sort.equals("По добавлению")) {
                    shop.showAllProducts(shop);
                }
                Start();
            }

            if (console.equals("Добавление товара") || console.equals("Добавление")) {
                System.out.println("Введите id товара: ");
                int id = scanner.nextInt();
                System.out.println("Введите название товара: ");
                String name = scanner.nextLine();
                name = scanner.nextLine();
                System.out.println("Введите тип товара: ");
                String type = scanner.nextLine();
                System.out.println("Введите цену товара: ");
                int price = scanner.nextInt();

                Product newProduct = new Product(id, name, type, price);
                shop.addProduct(newProduct);
                Start();
            }

            if (console.equals("Удаление товара") || console.equals("Удаление")) {
                System.out.println("Введите id товара, который хотите удалить: ");
                int id = scanner.nextInt();
                shop.removeProduct(id);
                Start();
            }
            if (console.equals("Редактирование товара") || console.equals("Редактирование")) {
                System.out.println("Введите id товара, который хотите отредактировать: ");
                int id = scanner.nextInt();
                System.out.println("Введите новое название товара: ");
                String name = scanner.nextLine();
                name = scanner.nextLine();
                System.out.println("Введите новый тип товара: ");
                String type = scanner.nextLine();
                System.out.println("Введите новую цену товара: ");
                int price = scanner.nextInt();

                Product newProduct = new Product(id, name, type, price);
                shop.editProduct(newProduct);
                Start();
            }
        } while (!console.equals("Выход"));

    }


}
