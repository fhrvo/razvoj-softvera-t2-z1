package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import java.awt.*;

public class Controller {

    public Label labela;

    public void Hello(ActionEvent actionEvent) {
        labela.setText("Hello World!");
    }
}
