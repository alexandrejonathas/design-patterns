public class Main {
    public static void main(String[] args) {
        var obj1 = MySingleton.getInstance();
        var obj2 = MySingleton.getInstance();

        System.out.println(obj1 == obj2);
    }
}
