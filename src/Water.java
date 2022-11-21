public class Water extends Product{

    private Integer sugarContent;           //содержание сахара

    public Water(String name){
        super(name);                // super (key word) - обращение к члену базового класса
    }

    public Water(String name, double price, int calories){
        super(name, price, calories);
    }

    public Water(String name, double price, int calories, Integer sugarContent){
        super(name, price, calories);
        this.sugarContent = sugarContent;
    }

    public Integer getSugarContent(){
        return this.sugarContent;
    }

    @Override
    public String toString() {
        return String.format("%s %d %s", super.toString(), sugarContent, "sug");
    }
}
