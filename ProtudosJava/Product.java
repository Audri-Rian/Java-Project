import java.time.LocalDate;

public class Product { // Creating the class
    private String name;
    private String description;
    private double price;
    private int quantity; // Assigning private attributes
    private LocalDate manufacturingDate;

    public Product(String name, String description, double price, int quantity, LocalDate manufacturingDate) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
        this.manufacturingDate = manufacturingDate;
    }

    public String getName() { // Name
        return name; // Getter method to return the name
    }

    public void setName(String name) {
        this.name = name; // Updating the attribute
    }

    public String getDescription() { // Product description
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() { // Product price
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() { // Product quantity
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public LocalDate getManufacturingDate() { // Product manufacturing date
        return manufacturingDate;
    }

    public void setManufacturingDate(LocalDate manufacturingDate) {
        this.manufacturingDate = manufacturingDate;
    }

    @Override
    public String toString() {
        return "Product{" +
               "Name='" + name + '\'' +
               ", Description='" + description + '\'' +
               ", Price=" + price +
               ", Quantity=" + quantity +
               ", Manufacturing Date=" + manufacturingDate +
               '}';
    }
}
