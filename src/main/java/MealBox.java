import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Padrão composite
public class MealBox implements MealCompositeInterface {
    private List<MealCompositeInterface> meals = new ArrayList<>();

    public void add(MealCompositeInterface ...meals) {
        Arrays.stream(meals).forEach(m -> this.meals.add(m));
    }

    @Override
    public Float getPrice() {
        return this.meals.stream().reduce(0F, (sum, m) -> sum + m.getPrice(), Float::sum);
    }

    @Override
    public String toString() {
        return "MealBox{" +
                "meals=" + meals +
                '}';
    }
}
