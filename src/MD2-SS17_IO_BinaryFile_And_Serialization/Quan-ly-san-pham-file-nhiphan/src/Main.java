import java.util.List;

public class Main {
    public static void main(String[] args) {
        ProductManagement productManagement = new ProductManagement();
        Product product1 = new Product("DT01","Iphone 12","Apple",1000);
        Product product2 = new Product("DT02","Iphone X","Apple",700);
        Product product3 = new Product("DT03","Oppo Find X3 Pro","Oppo",1300);
        productManagement.addProduct(product1);
        productManagement.addProduct(product2);
        productManagement.addProduct(product3);
        try {
            ReadAndWrite io = new ReadAndWrite();
            io.writeFile("product.csv", productManagement.productList);
            io.readFile("product.txt");
            productManagement.display();
        } catch (Exception e){
            System.err.println("Khong tim thay file hoac file bi loi");
        }
    }
}
