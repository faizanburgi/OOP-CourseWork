import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class ASCIICodeFinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a character: ");

        String ch = input.nextLine();
        char c = ch.charAt(0);

        System.out.println("The ASCII code for character "+ c+" is " +(int)c);


        Random No = new Random();
        int RN1 = No.nextInt(10);
        int RN2 = No.nextInt(10);
        int cmb = RN1*10 + RN2;
        char cmbC = (char) cmb;

        System.out.println("\nThe random two digit no. is: " +cmb);
        System.out.println("The character of the  random two digit number is: "+ cmbC);

    }
}
