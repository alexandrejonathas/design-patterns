public class AmericanFactoryImpl extends PeopleFactory {
    @Override
    Person getPerson(String name) { return new AmericanImpl(name); }
}
