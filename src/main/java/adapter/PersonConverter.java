package adapter;

import person.Person;

public interface PersonConverter {
    Person convert(String json);
}
