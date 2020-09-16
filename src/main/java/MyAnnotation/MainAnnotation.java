package MyAnnotation;

import java.lang.reflect.Field;

public class MainAnnotation {

    public static void main(String[] args) throws IllegalAccessException{
        TestAnnotation m = new TestAnnotation();

        //тут рефлексия
        for(Field field : TestAnnotation.class.getDeclaredFields()) {
            FieldCustomVal fieldCustomVal = field.getAnnotation(FieldCustomVal.class);
            field.setAccessible(true);
            field.set(m, fieldCustomVal.value());
//            field.setAccessible(false);
        }
        //конец рефлексии
        System.out.println(m.getMyFieldWithCustomVal());
        System.out.println(m.getMyFieldWithDefaultVal());
    }
}
