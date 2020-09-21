package Serialization;

public class CalculateGradeOfAge {
    public static int calculateGradeOfAge(int age) {
        int gradeOfInteger = 1;
        if (age > 0 && age <= 3)
            return gradeOfInteger = 1;
        if (age >= 4 && age <= 6)
            return gradeOfInteger = 2;
        if (age >= 7 && age <= 18)
            return gradeOfInteger = 3;
        if (age >= 19 && age <= 22)
            return gradeOfInteger = 4;
        if (age >= 22 && age <= 64)
            return gradeOfInteger = 5;
        if (age >= 65)
            return gradeOfInteger = 6;
        else return gradeOfInteger;
    }
}
