package adapter;

import com.google.gson.Gson;
import person.Person;

public class JsonToPersonAdapter implements JsonToPerson {
    @Override
    public Person convert(String json) {
        return new Gson().fromJson(json, Person.class);
    }
}
