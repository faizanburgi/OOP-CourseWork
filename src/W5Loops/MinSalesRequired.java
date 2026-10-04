package W5Loops;

import java.util.Scanner;

public class MinSalesRequired {
    public static void main (String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your base salary: ");
        double baseSalary = input.nextDouble();
        System.out.print("Enter your target income: ");
        double targetIncome = input.nextDouble();


        double comission = 0;
        double salesAmount=0;

        for( ; ;salesAmount++) {
            if (salesAmount >= 0 && salesAmount <= 5000) {
                comission = 0.06 * salesAmount;
            } else if (salesAmount > 5000 && salesAmount <= 10000) {
                comission = (0.06 * 5000) + (0.08 * (salesAmount - 5000));
            } else if (salesAmount > 10000) {
                comission = (0.06 * 5000) + (0.08 * 5000) + (0.1 * (salesAmount - 10000));
            }
            if (baseSalary + comission >= targetIncome) {
                break;
            }
        }
        System.out.println("You need $"+salesAmount+" sales to earn $30000 a year." );

    }
}
