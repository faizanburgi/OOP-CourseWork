package W4;

import java.util.Scanner;

public class DecendingOrder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first country: ");
        String c1 = input.nextLine();

        System.out.print("Enter the second country: ");
        String c2 = input.nextLine();

        System.out.print("Enter the third country: ");
        String c3 = input.nextLine();

        if (c1.compareTo(c2) < 0 && c1.compareTo(c3) < 0 && c2.compareTo(c3)<0)
        {
            System.out.println(c3+" "+c2+" "+c1+" ");
        }
        else if (c1.compareTo(c2) < 0 && c1.compareTo(c3) < 0 && c2.compareTo(c3)>0) {
            System.out.println(c2+" "+c3+" "+c1+" ");
        }
        else if (c2.compareTo(c3) < 0 && c2.compareTo(c1) < 0 && c3.compareTo(c1)<0) {
            System.out.println(c1+" "+c3+" "+c2+" ");
        }
        else if (c2.compareTo(c3) < 0 && c2.compareTo(c1) < 0 && c3.compareTo(c1)>0) {
            System.out.println(c3+" "+c1+" "+c2+" ");
        }
        else if (c3.compareTo(c1) < 0 && c3.compareTo(c2) < 0 && c1.compareTo(c2)<0) {
            System.out.println(c2+" "+c1+" "+c3+" ");
        }
        else if (c3.compareTo(c1) < 0 && c3.compareTo(c2) < 0 && c1.compareTo(c2)>0) {
            System.out.println(c2+" "+c1+" "+c3+" ");
        }


        else if (c1.compareTo(c2) == 0 && c1.compareTo(c3) > 0 && c2.compareTo(c3)>0) {
            System.out.println(c1+" "+c2+" "+c3+" ");
        }
        else if (c1.compareTo(c2) > 0 && c1.compareTo(c3) == 0 && c2.compareTo(c3)>0) {
            System.out.println(c1+" "+c3+" "+c2+" ");
        }
        else if (c1.compareTo(c2) > 0 && c1.compareTo(c3) > 0 && c2.compareTo(c3)==0) {
            System.out.println(c1+" "+c2+" "+c3+" ");
        }
        else if (c1.compareTo(c2) == 0 && c1.compareTo(c3) == 0 && c2.compareTo(c3)==0) {
            System.out.println(c1+" "+c2+" "+c3+" ");
        }

    }
}
