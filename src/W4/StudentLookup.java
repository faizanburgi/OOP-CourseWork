package W4;

import java.util.Scanner;

public class StudentLookup {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the two character code: ");
        String code = input.nextLine();

        switch (code.charAt(0)){
            case 'I':
                System.out.println("Information Management");
                break;
            case 'C':
                System.out.println("Computer Science");
                break;
            case 'A':
                System.out.println("Accounting");
                break;
        }
        switch (code.charAt(1)){
            case '1':
                System.out.print("Freshman");
                break;
            case '2':
                System.out.print("Sophomore");
                break;
            case '3':
                System.out.print("Junior");
                break;
            case '4':
                System.out.print("Senior");
                break;
        }
    }
}
