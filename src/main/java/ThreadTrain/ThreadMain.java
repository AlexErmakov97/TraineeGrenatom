package ThreadTrain;

public class ThreadMain {
    public static void main(String[] args) throws InterruptedException {

        Control control = new Control();
        FirstThread firstThread = new FirstThread();
        SecondThread secondThread = new SecondThread();
        ThirdThread thirdThread = new ThirdThread();

        control.first(firstThread);
        control.second(secondThread);
        control.third(thirdThread);
    }
}
