import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Product> prodList = new ArrayList<>();

        prodList.add(new Water("Кола", 30.0));
        prodList.add(new Water("Фанта", 31.5));
        prodList.add(new Water("Липтон", 30.75));

        ArrayList<Integer> amountList = new ArrayList<>();
        amountList.add(6);
        amountList.add(10);
        amountList.add(26);

        VendMach coldDrinksAvtomat = new VendMach("Автомат", "Сочи");
        coldDrinksAvtomat.initProduct(prodList, amountList);
        coldDrinksAvtomat.getProducts();
        coldDrinksAvtomat.sellProduct("Липтон", 2);
        coldDrinksAvtomat.getProducts();
        coldDrinksAvtomat.setPlace("Москва");
        coldDrinksAvtomat.getPlace();

        VendMach hotDrinksAvtomat = new VendMach("Автомат горячих напитков", "Сочи");

        ArrayList<Product> hotProdList = new ArrayList<>();

        hotProdList.add(new HotDrinks("Кофе", 30.0, 88));
        hotProdList.add(new HotDrinks("Чай", 31.5, 100));

        System.out.println(hotProdList);

        ArrayList<Integer> amountHotDrinksList = new ArrayList<>();
        amountHotDrinksList.add(60);
        amountHotDrinksList.add(100);

        hotDrinksAvtomat.initProduct(hotProdList, amountHotDrinksList);
        hotDrinksAvtomat.getProducts();
        hotDrinksAvtomat.sellProduct("Кофе", 10);
        hotDrinksAvtomat.getProducts();





    }
}
