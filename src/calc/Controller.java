package calc;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class Controller {

    public TextField display;
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
    public Button resultButton;
    public Button sumButton;
    public Button subButton;
    public Button multButton;
    public Button divButton;
    public Button buttonClear;
    public Button buttonPoint;

    public double result1;
    public double result2;
    public String operation;
    public String lastOperation;
    boolean isFirstNumber = true;
    boolean clearText = false;


    public void digit(ActionEvent actionEvent) {
        System.out.println("actionEvent = " + actionEvent.toString());

        Button button = (Button) actionEvent.getSource();
        if (clearText) {
            display.setText("");
            clearText = false;
        }

        display.setText(display.getText() + button.getText());

    }

    public void clear(ActionEvent actionEvent) {
        display.setText("");
        isFirstNumber = true;
    }

    public void operation(ActionEvent actionEvent) {
        Button button = (Button) actionEvent.getSource();
        result1 = Double.parseDouble(display.getText());
        System.out.println("result is " + result1);
        operation = button.getText();
        if(isFirstNumber) {
            result2 = result1;
            lastOperation = operation;
            isFirstNumber = false;
        } else {
            operate(result1);
            lastOperation = operation;
        }
        clearText = true;

    }

    public void operate(double result1) {
        if (lastOperation.equals("+")) {
            result2 += result1;
        } else if (lastOperation.equals("-")) {
            result2 -=result1;
        } else if (lastOperation.equals("*")) {
            result2 *= result1;
        } else if (lastOperation.equals("/")) {
            result2 /=result1;
        } else if (lastOperation.equals("=")) {
            result2 = result1;
        }
        System.out.println("result2 is " + result2);
        display.setText(Double.toString(result2));

    }


}
