package W7;

import java.util.Scanner;

public class EvenOddCount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10];
        System.out.println("Enter your 10 numbers: ");

        for (int i = 0; i<10; i++)
        {
            numbers[i] = input.nextInt();
        }
        int even = 0;
        int odd = 0;
        for (int i=0; i<10;i++ ) {
            if (numbers[i] % 2 == 0) {
                even = even + 1;
            } else
                odd = odd + 1;
        }
        System.out.println("Even numbers: " + even);
        System.out.println("Odd numbers: " + odd);
    }

}
