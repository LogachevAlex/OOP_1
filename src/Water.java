public class Water extends Drinks {
    public Water(String name, double cost) {
        super(name, cost);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getCost() {
        return cost;
    }

    @Override
    public void getInfo() {
        System.out.println("Товар" + getName() + getCost() + "рублей");
    }
}
