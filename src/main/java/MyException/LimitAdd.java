package MyException;

public class LimitAdd extends Exception {

//    public LimitAdd(String message) {
//        super(message);
//    }

    @Override
    public String getMessage() {
        return "Error: trying to add 11th element";
    }

}
