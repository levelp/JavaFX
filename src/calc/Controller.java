package calc;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class Controller {

    public TextField aField;
    public TextField resultField;
    public VBox mainPanel;

    public Button button1;
    public Button button2;
    public Button button3;
    public Button button4;
    public Button button5;
    public Button button6;
    public Button button7;
    public Button button8;
    public Button button9;
    public Button button0;

    public void digit(ActionEvent actionEvent) {
        System.out.println("actionEvent = " + actionEvent.toString());
        if (actionEvent.getSource() instanceof Button) {
            Button button = (Button) actionEvent.getSource();
            aField.setText(aField.getText() + button.getText());
        }
    }
}
