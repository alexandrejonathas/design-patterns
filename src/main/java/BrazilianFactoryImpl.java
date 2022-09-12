public class BrazilianFactoryImpl extends PeopleFactory {
    @Override
    public Person getPerson(String name) {
        return new BraziliantImpl(name);
    }
}
