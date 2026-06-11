package W3;

import java.util.Scanner;

public class VowelIdentifier {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the alphabet: ");
        char alphabet =  input.next().charAt(0);

        switch (alphabet){
            case 'a':
            case 'A':
            case 'e':
            case 'E':
            case 'i':
            case 'I':
            case 'o':
            case 'O':
            case 'u':
            case 'U':
                System.out.println("Your alphabet is a Vowel");
                break;
            default:
                System.out.println("Your alphabet is a consonent.");
                break;



//            case "a":
//            case "A":
//            case "e":
//            case "E":
//            case "i":
//            case "I":
//            case "o":
//            case "O":
//            case "u":
//            case "U":
        }



    }
}
