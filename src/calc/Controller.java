package calc;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Controller {

    public TextField display;
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
    public Button plusButton;
    public Button minusButton;

    HashMap<Button, Action> operations = new LinkedHashMap<Button, Action>();

    public Controller() {
        super();
        operations.put(plusButton, Action.PLUS);
        operations.put(minusButton, Action.MINUS);
    }

    public void digit(ActionEvent actionEvent) {
        System.out.println("actionEvent = " + actionEvent.toString());
        if (actionEvent.getSource() instanceof Button) {
            Button button = (Button) actionEvent.getSource();
            display.setText(display.getText() + button.getText());
        }
    }

    public void operation(ActionEvent actionEvent) {
        /*if (actionEvent.getSource().equals(plusButton)) {
            System.out.println("Сложение");
        }
        if (actionEvent.getSource().equals(minusButton)) {
            System.out.println("Вычитание");
        }*/
        Action action = operations.get(actionEvent.getSource());
        // switch (action)
    }

    public static void main(String[] args) {
        // Action action = Action.MINUS;
        // System.out.println(action);
    }
}
