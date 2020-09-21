package Serialization;

public enum Occupation {

    GRADE_1("Sit in home"),
    GRADE_2("Go to kindergarten"),
    GRADE_3("Go to school"),
    GRADE_4("Go to university"),
    GRADE_5("Go to work"),
    GRADE_6("Pensioner");

    private String kindOfOccupation;

    Occupation() {
    }

    Occupation(String kindOfOccupation) {
        this.kindOfOccupation = kindOfOccupation;
    }

    public String getKindOfOccupation() {
        return kindOfOccupation;
    }

}
