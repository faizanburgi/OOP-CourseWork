import java.util.Scanner;

public class VowelIdentifier {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char c = input.next().charAt(0);

        String alphabets ="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String vowels = " aAeEiIoOuU";

        if (alphabets.indexOf(c)==-1){
            System.out.println(c+" is an invalid input.");
        } else if (vowels.indexOf(c)!=-1) {
            System.out.println(c+" is a vowel.");
        }
        else {
            System.out.println(c + " is a consonent.");
        }
    }
}
