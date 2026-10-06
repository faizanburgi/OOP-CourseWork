package W6Methods;

import java.util.Scanner;

public class SortNumbers {
    public static void displaySortedNumbers(double num1, double num2, double num3){
        double highest,middle,lowest;

        if (num1 >= num2 && num1 >= num3) {
            highest = num1;
            if (num2 >= num3) {
                middle = num2;
                lowest = num3;
            } else {
                middle = num3;
                lowest = num2;
            }
        } else if (num2 >= num1 && num2 >= num3) {
            highest = num2;
            if (num1 >= num3) {
                middle = num1;
                lowest = num3;
            } else {
                middle = num3;
                lowest = num1;
            }
        } else {
            highest = num3;
            if (num1 >= num2) {
                middle = num1;
                lowest = num2;
            } else {
                middle = num2;
                lowest = num1;
            }
        }
        // Print in descending order
        System.out.println(highest + ", " + middle + ", " + lowest);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your 1st Number: ");
        double num1 = input.nextDouble();
        System.out.println("Enter your 2nd Number: ");
        double num2 = input.nextDouble();
        System.out.println("Enter your 3rd Number: ");
        double num3 = input.nextDouble();

        displaySortedNumbers(num1,num2,num3);
    }
}
