package MyException;

public class AddElement {
    public void getSizeOfArray(int sizeOfArrayList) throws LimitAdd {
        if (sizeOfArrayList == 10) throw new LimitAdd();
    }
}
