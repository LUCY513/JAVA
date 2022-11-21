import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
        private List<Product> foodBox;
        private final static List<Product> initFoodBox = new ArrayList<>();

        static{
            initFoodBox.add(new Product("Nuts", 30, 504));
        }

        public VendingMachine(){
            this(initFoodBox);
        }

        public VendingMachine(List<Product> foodBox){
                this.foodBox = foodBox;
        }

        public Product getProductBy(String name){
                for (Product product : foodBox) {
                        if(product.getName().contains(name)){
                                return product;
                        }
                }
                return null;
        }

        public Product getProductBy(double name){
                for (Product product : foodBox) {
                        if(product.getName().equals(name)){
                                return product;
                        }
                }
                return null;
        }

        @Override
        public String toString() {
                String result = "";
                for (Product food : foodBox) {
                        result = result.concat(food.toString() + "\n");
                }
                return result;
        }
}
