import javax.swing.*;

public class SSNFormatChecker {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Enter your SSN: ");


        if (input.indexOf('-') != 3) {
            System.out.println(input + " is an invalid social security number.");
        }
        else if (input.indexOf('-',4) != 6) {
            System.out.println(input + " is an invalid social security number.");
        }
        else {
            System.out.println(input+" is a valid social security number.");
        }

    }
}
