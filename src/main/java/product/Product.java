package product;

public class Product extends ProductComponent{
    private String name;
    private Float price;

    public Product(String name, Float price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }
    @Override
    public Float getPrice() {
        return this.price;
    }
}
