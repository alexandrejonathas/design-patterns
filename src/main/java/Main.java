import adapter.JsonToPersonAdapter;

public class Main {
    public static void main(String[] args) {
        var jsonPerson = "{\"name\":\"Jonathas\", \"age\": 38}";
        var personAdapter = new JsonToPersonAdapter();

        var person = personAdapter.convert(jsonPerson);
        System.out.println(person);
    }
}
