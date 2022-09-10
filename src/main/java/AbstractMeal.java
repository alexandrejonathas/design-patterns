public class AbstractMeal implements MealCompositeInterface {
    private String name;
    private Float price;

    public AbstractMeal(String name, Float price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public Float getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

}
