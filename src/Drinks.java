public abstract class Drinks implements Product {
    protected String name;
    protected double cost;

    public Drinks(String name, double cost) {
        this.name = name;
        this.cost = cost;
    }

    @Override
    public abstract String getName();

    @Override
    public abstract double getCost();

    public void getInfo() {
        System.out.println(getName());
    }
}
