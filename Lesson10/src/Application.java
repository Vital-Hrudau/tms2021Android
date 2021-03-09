import java.util.Scanner;

public class Application {
    private Shop shop;

    Economics economics = new Economics(shop);

    public Application(Shop shop) {
        this.shop = shop;
    }


    public void start() throws ProductAlreadyExist, InvalidProductId {
        Scanner scanner = new Scanner(System.in);
        String console = "";
        do {
            System.out.println("Выберите действие (Загрузить товар (1), Вывод всех товаров (2)," +
                    " Добавление товара (3), Купить товар (4), Удаление товара (5) \nРедактирование товара (6)," +
                    " Бухгалтерия (0), Выход):");
            console = scanner.nextLine();
            if (console.equals("Загрузить") || console.equals("1")) {
                System.out.println("Введите id товара: ");
                int id = scanner.nextInt();
                System.out.println("Введите кол-во товара: ");
                int count = scanner.nextInt();
                shop.addCountProduct(id, count);
            }

            if (console.equals("Вывод всех товаров") || console.equals("2")) {
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
            }

            if (console.equals("Добавление товара") || console.equals("3")) {
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
            }


            if (console.equals("Купить") || console.equals("4")) {
                System.out.println("Введите id товара: ");
                int id = scanner.nextInt();
                System.out.println("Введите кол-во товара: ");
                int count = scanner.nextInt();
                shop.buyCountProduct(id, count);
            }

            if (console.equals("Удаление товара") || console.equals("5")) {
                System.out.println("Введите id товара, который хотите удалить: ");
                int id = scanner.nextInt();
                shop.removeProduct(id);
            }

            if (console.equals("Редактирование товара") || console.equals("6")) {
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

            }

            if (console.equals("Бухгалтерия") || console.equals("0")) {
                System.out.println("Отчет бухгалтерии:");
                economics.amountProductTypes(shop);
                economics.amountCountProduct(shop);
                economics.averageCost(shop);
                economics.averageCostofTypes(shop);

            }
        } while (!console.equals("Выход"));

    }
}
