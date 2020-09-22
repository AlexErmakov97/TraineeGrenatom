package BlockVar;

import javafx.scene.control.ProgressBar;

public class changeProgress extends Thread {

    private boolean sharedValue;
    private ProgressBar mainBar;
    private double progressValue;


    public changeProgress() {

    }

    public changeProgress(ProgressBar bar) {
        this.mainBar = bar;
        this.progressValue = 0.1;
    }

    private void IncThread() {
        if (this.sharedValue == false) {
            for (double i = 0; i <= 1; i += progressValue) {
                try {
                    sleep(200);
                    mainBar.setProgress(i);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        this.sharedValue = true;
    }

    private void DecThread() {
        if (this.sharedValue == true) {
            for (double i = 1; i > 0; i -= progressValue) {
                try {
                    sleep(200);
                    mainBar.setProgress(i);
                    SharedResource.valueProgressBar = i;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        this.sharedValue = false;
    }

    private void Progress() {
        while (!isInterrupted()) {
            IncThread();
            DecThread();
        }
    }

    @Override
    public void run() {
        Progress();
    }
}
