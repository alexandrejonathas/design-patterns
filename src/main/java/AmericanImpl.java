public class AmericanImpl implements Person {
    private String name;

    public AmericanImpl(String name){
        this.name = name;
    }

    @Override
    public void say(String msg) {
        System.out.println(name+": "+msg);
    }
}
