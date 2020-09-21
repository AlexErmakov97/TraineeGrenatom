package Serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.util.List;

import static Serialization.CalculateGradeOfAge.calculateGradeOfAge;

public class ReadPersons {
    private String fileName;
    private List<Person> personList;

    public ReadPersons(String fileName) {
        this.fileName = fileName;
    }

    public List<Person> getPersonList() {
        return personList;
    }

    public void deserialize() {
        try {
            FileInputStream fileInputStream = new FileInputStream(this.fileName);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            this.personList = (List<Person>) objectInputStream.readObject();
            this.personList.stream().forEach(e -> {
                e.setOccupation(calculateGradeOfAge(e.getAge()));
            });

//            for(Person person : this.personList){
//                int i = person.getAge();
//                int y = calculateGradeOfAge(i);
//                person.setOccupation(y);}

        } catch (IOException e) {
            System.out.println("FileNotFound");
        } catch (ClassNotFoundException c) {
            System.out.println("Error");
        }
    }
}
