import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> foodBox = new ArrayList<>();
        foodBox.add(new Product("Nuts", 30, 504));
        foodBox.add(new Product("Snickers", 35, 507));
        foodBox.add(new Product("Lipton", 45, 135));
        foodBox.add(new Product("Sprite", 29, 140));
        foodBox.add(new Product("Lay's", 70, 536));
        foodBox.add(new Product("Pringles", 100, 529));
        foodBox.add(new Product("Crackers", 47, 354));
        foodBox.add(new Product("Cookies", 55, 437));
        foodBox.add(new Product("Bubble gums", 12, 192));


        foodBox.add(new Water("WATER", 9, 0, 0));


        VendingMachine v1 = new VendingMachine(foodBox);
        System.out.println(v1);






    }
}