public class Main {
    public static void main(String[] args) {
        var person = new Person("Jonathas", "Lima", 38);
        System.out.println(person);
        System.out.println(person.getFullName());

        var clonedPerson = (Person)person.clone();
        clonedPerson.setFirstName("Morgana");
        System.out.println(clonedPerson);
        System.out.println(clonedPerson.getFullName());

        person.say("Olá, tudo bem?");
        clonedPerson.say("Olá, estou otima e voce?");
    }
}
