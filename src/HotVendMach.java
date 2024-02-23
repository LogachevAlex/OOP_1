import java.util.List;

public class HotVendMach extends VendMach {
    public HotVendMach(String name, String place) {
        super(name, place);
    }

    public void getProductTemp() {
        for (Product product : this.products.keySet()) {
            if (product instanceof HotDrinks) {
                HotDrinks hotDrink = (HotDrinks) product;
                System.out.println("Продукт: " + hotDrink.getName() + ", Температура: " + hotDrink.getTemp());
            }
        }
    }
}

