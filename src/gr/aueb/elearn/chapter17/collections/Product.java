package gr.aueb.elearn.chapter17.collections;

import java.util.Objects;

public class Product implements Comparable<Product>{
    private String description;
    private double price;
    private int quantity;

    public Product(){}

    public Product(String description, double price, int quantity) {
        this.description = description;
        this.price = price;
        this.quantity = quantity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "description='" + description + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return getDescription().equals(product.getDescription());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDescription(), getPrice(), getQuantity());
    }

//    @Override
//    public int compareTo(Product o) {
//        return description.compareTo(o.description);
//    }

//    @Override
//    public int compareTo(Product o) {
//        return this.quantity - o.getQuantity();
////        if (this.quantity < o.getQuantity()) return -1;
////        else if (this.quantity == o.getQuantity()) return 0;
////        else return 1;
//    }

    @Override
    public int compareTo(Product o) {
        return Double.compare(this.price,o.getPrice());
    }
}
