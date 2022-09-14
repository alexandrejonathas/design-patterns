import product.Product;
import product.ProductBox;

public class Main {
    public static void main(String[] args) {
        var pdv = new ProductBox("Caixa 01");

        var milk = new Product("Leite Piracanjuba", 5F);
        System.out.println(milk.getName()+": "+milk.getPrice());

        var boxOfMilk = new ProductBox("Fardo de leite Piracanjuba");
        for(int i = 0; i < 12; i++) {
            boxOfMilk.addComponent(milk);
        }

        System.out.println("---");
        System.out.println(boxOfMilk.getName()+": "+boxOfMilk.getPrice());

        var chocolate = new Product("Nescau 800g", 6F);
        System.out.println(chocolate.getName()+": "+chocolate.getPrice());

        var boxOfChocolate = new ProductBox("Fardo de nescau");
        for(int i = 0; i < 10; i++) {
            boxOfChocolate.addComponent(chocolate);
        }

        System.out.println("---");
        System.out.println(boxOfChocolate.getName()+": "+boxOfChocolate.getPrice());

        pdv.addComponent(boxOfMilk);
        pdv.addComponent(boxOfChocolate);

        System.out.println("---");
        System.out.println(pdv.getName()+": "+pdv.getPrice());

    }
}
