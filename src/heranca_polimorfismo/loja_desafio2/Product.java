package heranca_polimorfismo.loja_desafio2;

public class Product {
    private String name;
    private double price;
    public String priceTag() {
        return String.format("%s $ %.2f", name, price);
    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


}
