package W6;

import java.util.Scanner;

public class ReverseOrder {
    public static void reverse(int number){
        int reversed = 0;
        int temp = number;

        while (temp != 0){
            int digit = temp % 10;
            reversed = reversed * 10 + digit;
            temp = temp / 10;
        }
        System.out.println(reversed);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter an integer number: ");
        int number = input.nextInt();
        reverse(number);
        input.close();
    }
}
