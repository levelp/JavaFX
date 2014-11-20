package calc;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;

public class Controller {


    public NewTextField display;
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
    public static boolean isPointAllowed = true;

    public void clearTextField() {
        display.setText("");
    }

    public void digit(ActionEvent actionEvent) {
        System.out.println("actionEvent = " + actionEvent.toString());

        Button button = (Button) actionEvent.getSource();

        if (display.getText().length() <= 10) {


            //освобождаем поле после ввода символа оператора
            if (clearText) {
                clearTextField();
                clearText = false;
            }
            if (!button.equals(buttonPoint)) {

                display.setText(display.getText() + button.getText());
            } else {
                if (isPointAllowed) {
                    display.setText(display.getText() + button.getText());
                    isPointAllowed = false;
                }

            }
        }

    }

    public void clear(ActionEvent actionEvent) {
        clearTextField();
        isFirstNumber = true;
        isPointAllowed = true;
    }

    public void operation(ActionEvent actionEvent) {
        Button button = (Button) actionEvent.getSource();
        //добавляем текущее число в текстовом поле в переменную result1
        result1 = Double.parseDouble(display.getText());
        operation = button.getText();
        isPointAllowed = true;
        if (isFirstNumber) {
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
        switch (lastOperation.charAt(0)) {
            case '+':
                result2 += result1;
                break;
            case '-':
                result2 -= result1;
                break;
            case '*':
                result2 *= result1;
                break;
            case '/':
                result2 /= result1;
                break;
            case '=':
                result2 = result1;
                break;
            default:
                break;
        }

        display.setText(Double.toString(result2));
    }

}
