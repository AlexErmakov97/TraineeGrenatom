package blockVar;

import javafx.scene.control.ProgressBar;

import java.util.concurrent.Semaphore;

public class DecThread extends Thread {

    private ProgressBar incBar;
    private Semaphore incSem;
    private double progressValue;


    DecThread() {

    }


    DecThread(ProgressBar bar) {
        this.incBar = bar;
        this.progressValue = 0.1;
//        incBar.setProgress(sample.SharedResource.valueProgressBar);
    }


    private void changeDecThread() {

        for (double i = 1; i > 0; i -= progressValue) {
            try {
                sleep(200);
                incBar.setProgress(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


    private synchronized void decProgress() {
        while (!isInterrupted()) {
            changeDecThread();
        }
    }

    @Override
    public void run() {
        decProgress();
    }
}
