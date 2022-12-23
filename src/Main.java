import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Простой продукт");
        Product water = new Product("water", 27.40);
        System.out.println(water);
        System.out.println("Продуктовая корзина по умолчанию");
        VendingMachine products = new VendingMachine();
        System.out.println(products);

        List<Product> tovary = new ArrayList<>();
        tovary.add(water);
        tovary.add(new Product("cheese", 279.99));
        tovary.add(new Soda("cokpo", 19, "grapes"));
        tovary.add(new Cheese("Camembert", 1500, 60, 8));

        VendingMachine mach2 = new VendingMachine(tovary);
        System.out.println("Большая продуктовая корзина со всеми товарами");
        System.out.println(mach2);

        List<Product> findByNames = mach2.findByName("Camembert");
        System.out.println("Поиск по имени");
        System.out.println(findByNames);

        List<Product> findByPrice = mach2.findByPrice(27, 289);
        System.out.println("Поиск по цене");
        System.out.println(findByPrice);
    }
}