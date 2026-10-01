import java.util.ArrayList;
import java.util.Comparator;


class Product{
    int productId;
    String productName;
    double price;

    Product(int productId, String productName, double price){
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }

    @Override
    public String toString(){
        return productId + " " + productName + " " + price;
    }
}

class ProductComparator implements Comparator<Product>{
    @Override 
    public int compare(Product p1, Product p2){
        int priceCompare = Double.compare(p2.price,p1.price);
        if(priceCompare == 0){
            return p1.productName.compareTo(p2.productName);
        }
        return priceCompare;
    }
}
public class shorting2 {
    public static void main(String[] args){
        ArrayList<Product> products = new ArrayList<>();

        products.add(new Product(101, "Laptop", 60000));
        products.add(new Product(102, "Mobile", 30000));
        products.add(new Product(103, "Tablet", 30000));
        products.add(new Product(104, "Headphones", 5000));
        products.add(new Product(105, "Camera", 60000));

        products.sort(new ProductComparator());

        System.out.println("Products sorted by price (high to low):");

        for (Product p : products) {
            System.out.println(p);
    }
}
}
