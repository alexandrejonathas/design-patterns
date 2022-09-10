public class Main {
    public static void main(String[] args) {

        DefaultDishBuilder dishBuilder = new DefaultDishBuilder();
        dishBuilder.makeMeal();

        var mealBox = dishBuilder.getMealBox();
        System.out.println(mealBox);
        System.out.println(mealBox.getPrice());
    }
}
