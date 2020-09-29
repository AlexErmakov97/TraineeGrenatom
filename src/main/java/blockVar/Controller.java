package blockVar;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ProgressBar;

public class Controller {

    @FXML
    ProgressBar mainProgressBar;
    @FXML
    Button buttonStart;

    sample.changeProgress temp = new sample.changeProgress();
    sample.IncThread inc = new sample.IncThread();
    DecThread dec = new DecThread();

    private boolean isAlive() {
        if(temp.isAlive() || inc.isAlive() || dec.isAlive())
            return true;
        return false;
    }

    private void stopProgress() {
        if(isAlive()) {
            temp.interrupt();
            temp.stop();
            inc.interrupt();
            inc.stop();
            dec.interrupt();
            dec.stop();
        }
    }

    public void startProgress(ActionEvent event) {
        stopProgress();
        temp = new sample.changeProgress(mainProgressBar);
        temp.start();
    }

    public void breakAll(ActionEvent event) {
        inc = new sample.IncThread(mainProgressBar);
        dec = new DecThread(mainProgressBar);
        inc.start();
        dec.start();
    }
}
    

