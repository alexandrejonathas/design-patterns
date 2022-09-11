public class Person implements Prototype {
    private String firstName;
    private String lastName;
    private Integer age;

    public Person(String firstName, String lastName, Integer age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    private Person(Prototype prototype) {
        this.firstName = ((Person)prototype).firstName;
        this.lastName = ((Person)prototype).lastName;
        this.age = ((Person)prototype).age;
    }

    public void say(String msg) {
        System.out.println(this.firstName+": "+msg);
    }

    public String getFullName() { return firstName +" "+ lastName; }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public Prototype clone() {
        return new Person(this);
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}
