package calc;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class Controller {

    public Button calcButton;
    public TextField aField;
    public TextField bField;
    public TextField resultField;
    public VBox mainPanel;

    public void calcSum(ActionEvent actionEvent) {
        System.out.println("Controller.calcSum");
        double a = Double.parseDouble(aField.getText());
        double b = Double.parseDouble(bField.getText());
        double sum = a + b;
        resultField.setText(Double.toString(sum));
    }
}
