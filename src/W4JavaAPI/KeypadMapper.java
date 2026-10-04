package W4JavaAPI;

import javax.swing.JOptionPane;

public class KeypadMapper {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Enter a character: ");


        if ("abcABC".indexOf(input)!= -1){
            System.out.println("The corresponding number is 2.");
        }
        else if ("defDEF".indexOf(input)!= -1) {
            System.out.println("The corresponding number is 3.");
        }
        else if ("ghiGHI".indexOf(input)!= -1) {
            System.out.println("The corresponding number is 4.");
        }
        else if ("jklJKL".indexOf(input)!= -1) {
            System.out.println("The corresponding number is 5.");
        }
        else if ("mnoMNO".indexOf(input)!= -1) {
            System.out.println("The corresponding number is 6.");
        }
        else if ("pqrsPQRS".indexOf(input)!= -1) {
            System.out.println("The corresponding number is 7.");
        }
        else if ("tuvTUV".indexOf(input)!= -1) {
            System.out.println("The corresponding number is 8.");
        }
        else if ("wxyzWXYZ".indexOf(input)!= -1) {
            System.out.println("The corresponding number is 9.");
        }
        else {
            System.out.println("Invalid Input.");
        }
    }
}
