package Serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

public class WritePersons {
    private String nameOfFile;
    private List arrayList;

    public WritePersons(String nameOfFile, List list) {
        this.nameOfFile = nameOfFile;
        this.arrayList = list;
    }

    public void serializePerson() {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(this.nameOfFile);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(this.arrayList);
            fileOutputStream.close();
        } catch (IOException e) {
            System.out.println("FileNotFound");
        }
    }
}
