package product;

public abstract class ProductComponent {
    public abstract Float getPrice();
    public abstract String getName();

    //Não força os leafs a implementarem métodos desnecessários, um dos problemas é possuir um método que não faz nada
    public void addComponent(ProductComponent product){}
    public void removeComponent(ProductComponent product){}
}
