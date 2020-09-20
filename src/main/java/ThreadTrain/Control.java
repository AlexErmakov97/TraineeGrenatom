package ThreadTrain;

import java.util.concurrent.Semaphore;

public class Control {
    private Semaphore semaphore_1 = new Semaphore(0);
    private Semaphore semaphore_2 = new Semaphore(0);

    public void first(Runnable first) throws InterruptedException{
        first.run();
        semaphore_1.release();
    }

    public void second(Runnable second) throws InterruptedException{
        semaphore_1.acquire();
        second.run();
        semaphore_2.release();
    }

    public void third(Runnable third) throws InterruptedException{
        semaphore_2.acquire();
        third.run();
    }
}
