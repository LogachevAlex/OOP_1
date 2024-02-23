import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VendMach implements VendingMachine{

    protected String name;
    protected String place;
    protected Map<Product, Integer> products = new HashMap<>();
    public VendMach(String name, String place) {
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        if (place.equals("Москва")) {
            System.out.println("Этот вендинговый аппарат нельзя перемещать в Москву!");
        }
        this.place = place;
    }

    public void initProduct(List<Product> productList, List<Integer> amount) {
        if (productList.size() != amount.size()) {
            throw new IllegalArgumentException("Списки продуктов и количество товара должны быть одинаковой длины");
        }
        for (int i = 0; i < productList.size(); i++) {
            products.put(productList.get(i), amount.get(i));
        }
    }

    public void getProducts() {
        for (Map.Entry<Product, Integer> entry : this.products.entrySet()) {
            Product product = entry.getKey();
            Integer amount = entry.getValue();
            System.out.println("Продукт: " + product.getName() + ", Цена: " + product.getCost() + ", Количество: " + amount);
        }
    }

    public void sellProduct(String productName, int number)
    {
        Product selectedProduct = null;
        for (Product product : products.keySet()) {
            if (product.getName().equals(productName)) {
                selectedProduct = product;
                break;
            }
        }

        if (selectedProduct != null && products.get(selectedProduct) > number) {
            // Уменьшаем количество продукта на 1
            products.put(selectedProduct, products.get(selectedProduct) - number);
            System.out.println("Продукт \"" + productName + "\" успешно продан. Оставшееся количество: " + products.get(selectedProduct));
        } else if (selectedProduct != null) {
            System.out.println("Извините, продукт \"" + productName + "\" временно отсутствует или его количество меньше");
        } else {
            System.out.println("Продукт \"" + productName + "\" не найден в ассортименте.");
        }
    }

}
