package MyException;

import java.util.ArrayList;

public class MainException {
    public static void main(String[] args) {
        AddElement addElement = new AddElement();
        ArrayList <Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 11; i++) {
            try {
                addElement.getSizeOfArray(arrayList.size());
            } catch (LimitAdd ex) {
                //limitAdd.printStackTrace();
                System.out.println(ex.getMessage());
            }
            arrayList.add(i);
        }
    }
}
