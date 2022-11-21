public class Product {
    private String name;
    private double price;
    private int calories;

    public Product(String name){
        this.name = name;
    }
    public Product(String name, double price, int calories){
        this(name);
        this.price = price;
        this.calories = calories;
    }

    public String getName() {
        return name;
    }

    public double getPrice(){
        return price;
    }
    // defender
    public void setPrice(double price) {
        if(price > 0) this.price = price;
    }

    public double getCalories() {
        return calories;
    }

    @Override
    public String toString() {
        return String.format("%s %s %d %s %,.1f %s", name,"->", calories,"Kkal |", price, "rub |");
    }
}
