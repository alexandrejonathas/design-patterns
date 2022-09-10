//Prato default
public class DefaultDishBuilder implements MealBuilderInterface {

    private MealBox mealBox = new MealBox();

    @Override
    public MealBuilderInterface makeMeal() {
        var rice = new Rice("Arroz", 5F);
        var bean = new Bean("Feijão", 8F);
        var meat = new Meat("Carne", 20F);
        mealBox.add(rice, bean, meat);
        return this;
    }

    @Override
    public MealBuilderInterface makeBeverage() {
        var beverage = new Beverage("Bebida", 8F);
        mealBox.add(beverage);
        return this;
    }

    @Override
    public MealBuilderInterface makeDessert() {
        var dessert = new Dessert("Sobremesa", 10F);
        mealBox.add(dessert);
        return this;
    }

    public MealBox getMealBox() {
        return mealBox;
    }

    public Float getPrice() {
        return mealBox.getPrice();
    }

}
