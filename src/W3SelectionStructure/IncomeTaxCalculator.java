package W3SelectionStructure;

import java.util.Scanner;

public class IncomeTaxCalculator
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Annual Income: ");

        int income = input.nextInt();

        if (income<=5000 && income>=0)
        {
            System.out.println("Tax Rate = 0% & Total income tax to be paid is 0.");
        }
        else if (income<=20000 && income>5000)
        {
            System.out.println("Tax Rate = 0% upto 5000 + 1% on next " + (income-5000) +
                    " \n Total income tax to be paid is "+ ((income - 5000)/100));
        }
        else if (income<=35000 && income>20000)
        {
            System.out.println("Tax Rate = 0% upto 5000 + 1% on next 15000 + 3% on  "
                    + (income-20000) +" \n Total income tax to be paid is "+ ((3*(income - 20000)/100)+150));
        }
        else if (income<=50000 && income>35000)
        {
            System.out.println("Tax Rate = 0% upto 5000 + 1% on next 15000 + 3% on next 15000 + 6% on   "
                    + (income-35000) +" \n Total income tax to be paid is "+ ((6*(income - 35000)/100)+600));
        }
        else if (income<=70000 && income>50000)
        {
            System.out.println("Tax Rate = 0% upto 5000 + 1% on next 15000 + 3% on next 15000 + 6% on next 15000 + 11% on "
                    + (income-50000) +" \n Total income tax to be paid is "+ ((11*(income - 50000)/100)+1500));
        }
        else if (income<=100000 && income>70000)
        {
            System.out.println("Tax Rate = 0% upto 5000 + 1% on next 15000 + 3% on next 15000 + 6% on next 15000 + 11% on next 20000 + 19% on "
                    + (income-70000) +" \n Total income tax to be paid is "+ ((19*(income - 70000)/100)+3700));
        }
        else if (income<=400000 && income>100000)
        {
            System.out.println("Tax Rate = 0% upto 5000 + 1% on next 15000 + 3% on next 15000 + 6% on next 15000 + 11% on next 20000 + 19% on next 30000 " +
                    "+ 25% on " + (income-100000) +" \n Total income tax to be paid is "+ ((25*(income - 100000)/100)+9400));
        }
        else if (income<=600000 && income>400000)
        {
            System.out.println("Tax Rate = 0% upto 5000 + 1% on next 15000 + 3% on next 15000 + 6% on next 15000 + 11% on next 20000 + 19% on next 30000 " +
                    "+ 25% on next 300000 + 26% on " + (income-400000) +" \n Total income tax to be paid is "+ ((26*(income - 400000)/100)+84400));
        }
        else if (income<=2000000 && income>600000)
        {
            System.out.println("Tax Rate = 0% upto 5000 + 1% on next 15000 + 3% on next 15000 + 6% on next 15000 + 11% on next 20000 + 19% on next 30000 " +
                    "+ 25% on next 300000 + 26% on next 200000 + 28% on " + (income-600000) +" \n Total income tax to be paid is "
                    + ((28*(income - 600000)/100)+136400));
        }
        else if (income>2000000)
        {
            System.out.println("Tax Rate = 0% upto 5000 + 1% on next 15000 + 3% on next 15000 + 6% on next 15000 + 11% on next 20000 + 19% on next 30000 " +
                    "+ 25% on next 300000 + 26% on next 200000 + 28% on 1400000 + 30% on " + (income-2000000) +" \n Total income tax to be paid is "
                    + ((30*(income - 2000000)/100)+528400));
        }

    }
}
