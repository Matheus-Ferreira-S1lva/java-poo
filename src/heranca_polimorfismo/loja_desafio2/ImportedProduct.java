package heranca_polimorfismo.loja_desafio2;

public class ImportedProduct extends Product {
    private Double customsFee;
    public Double totalPrice() {
        return getPrice() + customsFee;
    }

    public ImportedProduct(String name, Double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    public Double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(Double customsFee) {
        this.customsFee = customsFee;
    }

    @Override
    public String priceTag() {
        return String.format("Name: %s, Price: $ %.2f, (Customs fee: $ %.2f )", getName(), totalPrice(), customsFee);
    }
}
