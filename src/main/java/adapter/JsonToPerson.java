package adapter;

import person.Person;

public interface JsonToPerson {
    Person convert(String json);
}
