package W4JavaAPI;

import java.util.Scanner;

public class AreaOfPolygon
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of sides: ");
        double n = input.nextDouble();

        System.out.print("Enter the length of side of regular polygon: ");
        double s = input.nextDouble();

        double Area;
        Area = (( n * Math.pow(s,2) ) / 4 * (Math.tan(Math.PI/n)));

        System.out.println("The area of the regular polygon is: " + Area);

    }
}
