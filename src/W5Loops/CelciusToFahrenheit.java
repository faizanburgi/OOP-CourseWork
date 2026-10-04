package W5Loops;

public class CelciusToFahrenheit {
    public static void main(String[] args) {
        System.out.println("Celcius\t\t\tFahrenheit");

        for(int C = 0; C <= 100; C += 2)
        {
            double F = C * 9 / 5 + 32;
            System.out.println(C+"\t\t\t"+F);
        }
    }
}
