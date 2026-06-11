import java.util.Scanner;

public class ExamResult {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your score or -1 to end the program: ");

        for(int score = input.nextInt(); score != -1; score = input.nextInt()) {
            if (score >= 60) {
                System.out.println("You passed the exam.");
            } else {
                System.out.println("You failed the exam.");
            }

            System.out.print("Enter your score or -1 to end the program: ");
        }

    }
}