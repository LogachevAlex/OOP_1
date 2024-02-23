public class HotDrinks extends Drinks {

    protected double temp;

    public HotDrinks(String name, double cost, double temp) {
        super(name,cost);
        this.temp = temp;
    }

    @Override
    public void getInfo() {
        System.out.println("Показываю полиморфизм, переписывая метод getInfo от абстрактного класса");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getCost() {
        return cost;
    }

    public double getTemp() {
        return temp;
    }

    @Override
    public String toString() {
        return "HotDrink{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                ", temperature=" + temp + "°C" +
                '}';
    }

}
