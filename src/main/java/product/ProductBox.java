package product;

import java.util.ArrayList;
import java.util.List;

public class ProductBox extends ProductComponent {

    private List<ProductComponent> products = new ArrayList<>();

    private String name;

    public ProductBox(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void addComponent(ProductComponent product) {
        products.add(product);
    }

    @Override
    public void removeComponent(ProductComponent product) {
        products.remove(product);
    }

    @Override
    public Float getPrice() {
        return products.stream().reduce(0F, (sum, product) -> sum + product.getPrice(), Float::sum);
    }
}
