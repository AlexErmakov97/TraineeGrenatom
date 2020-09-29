package blockVar;

import javafx.scene.control.ProgressBar;

import java.util.concurrent.Semaphore;

public class IncThread extends Thread{

    private ProgressBar incBar;
    private Semaphore incSem;
    private double progressValue;


    IncThread() {

    }



    IncThread(ProgressBar bar) {
        this.incBar = bar;
        this.progressValue = 0.1;

    }

    private void changeIncThread() {

        for (double i = 0; i <= 1; i += progressValue) {
            try {
                sleep(200);
                incBar.setProgress(i);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }



    private synchronized void incProgress() {
        while (!isInterrupted()) {
            changeIncThread();
        }
    }


    @Override
    public void run() {
       incProgress();
    }
}
