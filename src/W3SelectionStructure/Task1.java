package W3SelectionStructure;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your wavelength here: ");
        double waveLength = input.nextDouble();

        if (waveLength < 450 && waveLength>=380)
            System.out.println("The color is voilet.");
        else if (waveLength < 495 && waveLength >= 450)
            System.out.println("The color is Blue.");
        else if (waveLength < 570 && waveLength >= 495)
            System.out.println("The color is Green.");
        else if (waveLength < 590 && waveLength >= 570)
            System.out.println("The color is Yellow.");
        else if (waveLength < 620 && waveLength >= 590)
            System.out.println("The color is Orange.");
        else if (waveLength < 750 && waveLength >= 620)
            System.out.println("The color is Red.");

        else
            System.out.println("the wavelength" +
                    "is not within the visible spectrum.");
    }
}


