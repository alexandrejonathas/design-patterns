public class BraziliantImpl implements Person {
    private String name;

    public BraziliantImpl(String name){
        this.name = name;
    }

    @Override
    public void say(String msg) {
        System.out.println(name+": "+msg);
    }
}
