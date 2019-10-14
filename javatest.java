import java.io.*;
import javax.swing.*;
import javax.swing.JOptionPane;
import javax.swing.JLabel;

public class javatest {
    public static void main(String[] args) {

        while (true) {

            String firstNumber;
            String secondNumber;
            double sum;
            String Operators;

            firstNumber = JOptionPane.showInputDialog("Enter first number");
            secondNumber = JOptionPane.showInputDialog("Enter second Number");
            Operators = JOptionPane.showInputDialog("Enter operators mathematica ");

            switch (Operators) {
            case "+":

                sum = Integer.parseInt(firstNumber) + Integer.parseInt(secondNumber);

                break;
            case "-":
                sum = Integer.parseInt(firstNumber) - Integer.parseInt(secondNumber);

                break;
            case "*":
                sum = Integer.parseInt(firstNumber) * Integer.parseInt(secondNumber);

                break;
            case "/":
                sum = Integer.parseInt(firstNumber) / Integer.parseInt(secondNumber);

                break;

            default:
                JOptionPane.showMessageDialog(null, "error");
            }

            String end = "The result is  " + sum;

            // JOptionPane.showInputDialog(null, end);
            JOptionPane.showMessageDialog(null, end);
            // System.exit(0);

            String AskContinue = JOptionPane.showInputDialog("continue , yes ,no");
            if (AskContinue.equals("no")) {
                break;
            } else if (!AskContinue.equals("yes")) {
                JOptionPane.showMessageDialog(null, "error");
                break;
            }

        }
    }
}