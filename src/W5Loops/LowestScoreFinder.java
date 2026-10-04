package W5Loops;

import java.util.Scanner;

public class LowestScoreFinder
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n = input.nextInt();
        input.nextLine();

        int LNo = Integer.MAX_VALUE;
        int SLNo = Integer.MAX_VALUE;

        String Lna = "";
        String SLna = "";

        for(int i=1; i<=n; i++) {
            System.out.print("Enter the Student Name: ");
            String Name = input.nextLine();

            System.out.print("Enter the Student Marks: ");
            int Marks = input.nextInt();
            input.nextLine();

            if(Marks < LNo){
                SLNo = LNo;
                SLna = Lna;

                LNo = Marks;
                Lna = Name;
            } else if (Marks < SLNo && Marks!=LNo) {
                SLNo = Marks;
                SLna = Name;
            }
        }
        System.out.println("The Std with lowest marks is "+ Lna+"("+LNo+")\n" +
                "The Std with Second Lowest Marks is "+ SLna+"("+SLNo+")");
    }
}
