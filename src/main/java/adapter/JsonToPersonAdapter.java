package adapter;

import com.google.gson.Gson;
import person.Person;

public class JsonToPersonAdapter implements PersonConverter {
    @Override
    public Person convert(String json) {
        return new Gson().fromJson(json, Person.class);
    }
}
