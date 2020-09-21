package Serialization;

import java.io.Serializable;

public class Person implements Serializable {
    private String name;
    private int age;
    transient private String occupation;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public Person setOccupation(int gradeOfAge) {
        switch (gradeOfAge) {
            case (1):
                this.occupation = Occupation.GRADE_1.getKindOfOccupation();
                break;
            case (2):
                this.occupation = Occupation.GRADE_2.getKindOfOccupation();
                break;
            case (3):
                this.occupation = Occupation.GRADE_3.getKindOfOccupation();
                break;
            case (4):
                this.occupation = Occupation.GRADE_4.getKindOfOccupation();
                break;
            case (5):
                this.occupation = Occupation.GRADE_5.getKindOfOccupation();
                break;
            case(6):
                this.occupation = Occupation.GRADE_6.getKindOfOccupation();
            default:
                this.occupation = Occupation.GRADE_1.getKindOfOccupation();
                break;
        }
        return this;
    }

    @Override
    public String toString() {
        return "Person is " + name +
                ", years old " + age +
                ", the main occupation " + occupation + '\n';
    }
}
