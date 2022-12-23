import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class VendingMachine {
    private List<Product> products;
    private static List<Product> Default = new ArrayList<>(Arrays.asList(new Product("rice", 79), new Soda("Cherry-Berry", 75.99, "Cherry and blueberries"),
            new Cheese("Gouda", 1450, 49.5, 5)));

    public VendingMachine() {
        this(Default);
    }

    public VendingMachine(List<Product> products) {
        this.products = products;
    }

    public String toString() {
        StringBuilder result = new StringBuilder();
        products.forEach(i -> result.append(i.toString() + "\n"));
        return result.toString();
    }

    public List<Product> findByName(String name) {

        return finder(p->p.getName() == name);
    }
    public List<Product> findByPrice(double price1, double price2) {

        return finder(p->p.getPrice() < price2 && p.getPrice() > price1);
    }

    private List finder(Function<Product, Boolean> f){
        List<Product> result = new ArrayList<>();
        products.forEach(i -> {
            if ( Boolean.TRUE.equals(f.apply(i))) {
                result.add(i);
            }
        });
        return result;
    }

}
