import java.util.*;

public class Economics {

    private Shop shop;

    public Economics(Shop shop) {
        this.shop = shop;
    }

    Set<String> shopTypes = new HashSet<>();


    public void amountProductTypes(Shop shop) {
        for (int i = 0; i < shop.getShop().size(); i++) {
            shopTypes.add(shop.getShop().get(i).getType());
        }
        System.out.println("Количество типов товаров: " + shopTypes.size());
    }

    public void amountCountProduct(Shop shop) {
        int sum = 0;
        for (Product product : shop.getShop()) {
            sum += product.getCount();
        }
        System.out.println("Общее кол-во товаров: " + sum);
    }

    public void averageCost(Shop shop) {
        int sum = 0;
        int count = 0;
        for (Product product : shop.getShop()) {
            sum += product.getPrice();
            count += product.getCount();
        }
        int result = sum / count;
        System.out.println("Средняя стоимость товара: " + result + " $.");
    }

    public void averageCostofTypes(Shop shop) {
        Map<String, List<Integer>> costTypes = new HashMap<>();
        for (int i = 0; i < shop.getShop().size(); i++) {
            String type = shop.getShop().get(i).getType();
            int price = shop.getShop().get(i).getPrice();
            if (costTypes.get(type) == null) {
                ArrayList<Integer> priceList = new ArrayList<>();
                priceList.add(price);
                costTypes.put(type, priceList);
            } else {
                List<Integer> typePrices = costTypes.get(type);
                typePrices.add(price);
            }
        }
        for (String type : costTypes.keySet()) {
            int sum = 0;
            int result = 0;
            List<Integer> priceList = costTypes.get(type);
            for (int i = 0; i < priceList.size(); i++) {
                sum += priceList.get(i);
            }
            result = sum / priceList.size();
            System.out.println("Тип: " + type + ". Средняя цена: " + result + " $.");
        }
    }
}





