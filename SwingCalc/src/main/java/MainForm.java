import javax.swing.*;
import java.awt.event.ActionEvent;

/**
 * Created by mille_000 on 19.11.2014.
 */
public class MainForm {
    private JTextField indikatorField; //поле индикатора. Дисплей калькулятора.
    private JPanel panel1;
    private JButton buttonMemoryRem; //вызвать число из памяти на дисплей.
    private JButton buttonMemoryClean; //стереть память.
    private JButton buttonMemorySet; //обнулить память и поместить туда число с дисплея
    private JButton buttonMemoryPlus;//прибавить к памяти число с дисплея и занести результат в память
    private JButton buttonMemoryMinus;//вычесть из памяти число с дисплея и занести результат в память
    private JButton button7;//7
    private JButton button8;//8
    private JButton button9;//9
    private JButton buttonClear;//стереть последнее число
    private JButton buttonReset;//стереть все числа
    private JButton button4;//4
    private JButton button5;//5
    private JButton button6;//6
    private JButton buttonMulti;//умножить
    private JButton buttonDiv;//делить
    private JButton button1;//1
    private JButton button2;//2
    private JButton button3;//3
    private JButton buttonPlus;//плюс
    private JButton buttonMinus;//минус
    private JButton button0;//ноль
    private JButton buttonDot;//десятичная точка
    private JButton buttonChangeSignum;//смена знака
    private JButton buttonEnter;//вычислить
    private JButton buttonDel;//стереть последнюю цифру
    private JTextField memoryField;
    private JButton buttonStat;

    double firstValue = 0.;
    String operation = "+";
    double memoryCell = 0.;
    int stat = 0;

    public void cls0(){

        indikatorField.setText("0");
    }

    public void cls(){

        indikatorField.setText("");
    }

    public void stat(){
        stat++;
    }

    public void cs(){
      //  if(indikatorField.getText().substring(0, 2).equals("Вы")) cls0();
        if(indikatorField.getText().indexOf("Вы") == 0) cls0();
        if(indikatorField.getText().indexOf("In") == 0) cls0();
        if(indikatorField.getText().indexOf("Na") == 0) cls0();
//        if(indikatorField.getText().substring(0, 1).equals("In")) cls0();
        if(indikatorField.getText().substring(0).equals("+")) cls0();
        if(indikatorField.getText().substring(0).equals("-")) cls0();
        if(indikatorField.getText().substring(0).equals("x")) cls0();
        if(indikatorField.getText().substring(0).equals("/")) cls0();
    }


    public MainForm(){

        cls0();

        button0.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
//                cls();
//                if(!(indikatorField.getText().equals("0"))) {
//                    indikatorField.setText(indikatorField.getText() + "0");
//                }
                stat();
                cs();
                indikatorField.setText(indikatorField.getText() + "0");

            }
        });



        button1.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                stat();
                cs();
                indikatorField.setText(indikatorField.getText() + "1");


            }
        });

        button2.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                stat();
                cs();
                indikatorField.setText(indikatorField.getText() + "2");


            }
        });

        button3.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                stat();
                cs();
                indikatorField.setText(indikatorField.getText() + "3");
            }
        });

        button4.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                stat();
                cs();
                indikatorField.setText(indikatorField.getText() + "4");
            }
        });

        button5.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                stat();
                cs();
                indikatorField.setText(indikatorField.getText() + "5");
            }
        });

        button6.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                stat();
                cs();
                indikatorField.setText(indikatorField.getText() + "6");
            }
        });

        button7.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                stat();
                cs();
                indikatorField.setText(indikatorField.getText() + "7");
            }
        });

        button8.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                stat();
                cs();
                indikatorField.setText(indikatorField.getText() + "8");
            }
        });

        button9.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                stat();
                cs();
                indikatorField.setText(indikatorField.getText() + "9");
            }
        });
        buttonDel.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                stat();
                cs();
                String temp = indikatorField.getText();
                if (!temp.isEmpty()){indikatorField.setText(temp.substring(0, temp.length()-1));
                }
//                if (temp.isEmpty()) {
////                    indikatorField.setText(indikatorField.getText() + "0");
////                    break;
//                }
            }
        });

       buttonReset.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                stat();
                cs();
                indikatorField.setText("0");
                firstValue = 0.;
            }
        });

        buttonClear.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                stat();
                cs();
                indikatorField.setText("0");
            }
        });

        buttonDot.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                stat();
                cs();
                String temp = indikatorField.getText();
                if (temp.indexOf(".") == - 1) {
                    indikatorField.setText(indikatorField.getText() + ".");
                }
            }
        });

        buttonMemoryRem.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                stat();
                cs();
                String temp = Double.toString(memoryCell);
                indikatorField.setText(temp);
            }
        });

        buttonMemoryClean.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                stat();
                cs();
                memoryCell = 0.;
                memoryField.setText("");
            }
        });
        buttonMemorySet.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                stat();
                cs();
                memoryCell = Double.valueOf(indikatorField.getText());;
                memoryField.setText("M");
            }
        });

        buttonMemoryPlus.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                stat();
                cs();
                memoryCell = memoryCell + Double.valueOf(indikatorField.getText());;
                if(memoryCell != 0) memoryField.setText("");
                else memoryField.setText("M");
            }
        });

        buttonMemoryMinus.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                stat();
                cs();
                memoryCell = memoryCell - Double.valueOf(indikatorField.getText());;
                if(memoryCell == 0) memoryField.setText("M");
                else memoryField.setText("");
            }
        });





        buttonPlus.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                stat();
                cs();
                firstValue = Double.valueOf(indikatorField.getText());
                indikatorField.setText("+");
                operation = "+";
            }
        });

        buttonMinus.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                stat();
                cs();
                firstValue = Double.valueOf(indikatorField.getText());
                indikatorField.setText("-");
                operation = "-";
            }
        });

        buttonMulti.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                stat();
                cs();
                firstValue = Double.valueOf(indikatorField.getText());
                indikatorField.setText("x");
                operation = "x";
            }
        });

        buttonDiv.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                stat();
                cs();
                firstValue = Double.valueOf(indikatorField.getText());
                indikatorField.setText("/");
                operation = "/";
            }
        });

        buttonChangeSignum.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                stat();
                cs();
                firstValue = Double.valueOf(indikatorField.getText());
                firstValue = -1 * firstValue;
                indikatorField.setText(firstValue + "");


            }
        });

        buttonStat.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                stat();
                cs();
                indikatorField.setText("Вы нажали клавиши " + stat + " раз");
            }
        });

        buttonEnter.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                stat();
                cs();
                double secondValue = Double.valueOf(indikatorField.getText());
                if ("+".equals(operation)){
                    indikatorField.setText((firstValue + secondValue) + "");
                }
                if ("-".equals(operation)){
                    indikatorField.setText((firstValue - secondValue) + "");
                }
                if ("x".equals(operation)){
                    indikatorField.setText((firstValue * secondValue) + "");
                }
                if ("/".equals(operation)){
                    indikatorField.setText((firstValue / secondValue) + "");
                }
                firstValue = 0.;
                operation = "+";
            }
        });
    }


    public static void main(String[] args) {
        JFrame frame = new JFrame("MainForm");
        frame.setContentPane(new MainForm().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }


    //    private void createUIComponents() {
//        // TODO: place custom component creation code here
//    }
}
