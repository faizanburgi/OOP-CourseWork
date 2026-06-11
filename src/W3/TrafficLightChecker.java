import java.util.Scanner;

public class TrafficLightChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the current color code of traffic light: ");
        int currentColor = input.nextInt();

        //THIS IS USING IF-ELSE

//        if (currentColor == 1)
//            System.out.println("The next color is green.");
//        else if (currentColor==2)
//            System.out.println("The next color is yellow.");
//        else if (currentColor==3)
//            System.out.println("The next color is red.");
//        else
//            System.out.println("This is an invalid color.");


        //THIS IS USING SWITCH CASE

        switch (currentColor){
            case 1:
                System.out.println("The next color is green.");
                break;
            case 2:
                System.out.println("The next color is yellow.");
                break;
            case 3:
                System.out.println("The next color is red.");
                break;
            default:
                System.out.println("This is an invalid color.");
                break;


        }
    }
}
