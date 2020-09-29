package Serialization;

import java.util.ArrayList;

import java.util.List;

public class SerializationMain {

    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();

        personList.add(new Person("Igor", 1));
        personList.add(new Person("Gena", 48));
        personList.add(new Person("Victor", 78));

        WritePersons writePersons = new WritePersons("persons.bin",personList);
        writePersons.serializePerson();

        ReadPersons readPersons = new ReadPersons("persons.bin");
        readPersons.deserialize();

        personList = readPersons.getPersonList();

        System.out.println(personList.toString());
    }
}
