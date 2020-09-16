package MyAnnotation;

public class TestAnnotation {
    @FieldCustomVal
    private String myFieldWithDefaultVal;

    @FieldCustomVal(value = "My custom val")
    private String myFieldWithCustomVal;

    public String getMyFieldWithDefaultVal() {
        return myFieldWithDefaultVal;
    }

    public String getMyFieldWithCustomVal() {
        return myFieldWithCustomVal;
    }
}
