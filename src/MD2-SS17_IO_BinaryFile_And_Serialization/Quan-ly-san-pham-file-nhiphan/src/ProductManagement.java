import java.io.Serializable;
import java.util.*;

public class ProductManagement implements Serializable {
    List<Product> productList = null;

    public ProductManagement() {
        productList = new ArrayList<>();
    }

    public void addProduct(Product product) {
        productList.add(product);
    }

    public void display() {
        for (Product product: productList) {
            System.out.println(product);
        }
    }

    public Product searchProduct(String id) {
        for (Product product : productList) {
            if (product.getId().equals(id)) {
                return product;
            }
        }
        return null;
    }
}
