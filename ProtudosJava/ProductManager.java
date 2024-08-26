import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ProductManager {
    private List<Product> products;

    public ProductManager() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    public Product findProductByName(String name) {
        for (Product product : products) {
            if (product.getName().equalsIgnoreCase(name)) {
                return product;
            }
        }
        return null;
    }

    public void listProducts() {
        for (Product product : products) {
            System.out.println(product);
        }
    }

    public static void main(String[] args) {
        // Creating instances of Product
        Product product1 = new Product("Frontline", "Utilizado para pulgas", 60, 3, LocalDate.of(2024, 8, 20));
        Product product2 = new Product("Deworm", "Utilizado para tratar infestações por vermes", 50, 8, LocalDate.of(2024, 4, 10));

        // Creating instance of ProductManager
        ProductManager manager = new ProductManager();

        // Adding products
        manager.addProduct(product1);
        manager.addProduct(product2);

        // Listing products
        System.out.println("List of Products:");
        manager.listProducts();

        // Finding a product by name
        Product foundProduct = manager.findProductByName("Laptop");
        if (foundProduct != null) {
            System.out.println("Product found: " + foundProduct);
        } else {
            System.out.println("Product not found.");
        }

        // Removing a product
        manager.removeProduct(product1);
        System.out.println("List of Products after removal:");
        manager.listProducts();
    }
}
