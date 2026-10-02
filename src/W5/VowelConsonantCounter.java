package W5;

//import javax.swing.*;
import java.util.Scanner;

public class VowelConsonantCounter {
   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.print("Enter a string: ");
       String text = input.nextLine();

       text = text.toUpperCase();

       int vowelCount = 0;
       int consonantCount = 0;

       for(int i = 0; i < text.length(); i++) {
           char ch = text.charAt(i);

           if(ch >= 'A' && ch <= 'Z'){
               if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                   vowelCount++;
               }
               else {
                   consonantCount++;
               }
           }
       }
       System.out.println("Number of vowels: " + vowelCount);
       System.out.println("Number of consonants: " + consonantCount);
    }
}
