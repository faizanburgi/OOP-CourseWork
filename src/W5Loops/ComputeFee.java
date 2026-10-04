package W5Loops;

public class ComputeFee {
    public static void main(String[] args) {
        double baseFee = 10000;
        double baseRate = 0.06;
        double totalFees = 0.0;
        System.out.println("Year"+ "\t"+"Tution Fees");

        for (int y = 1; y <= 10; y++)
        {
            double tutionFee = 0.0;
            tutionFee =(baseFee * (baseRate * y) + baseFee);

            System.out.println(y+ "\t\t" + tutionFee);
            totalFees=totalFees+tutionFee;
        }
        System.out.println("The total fees after 10th Year is: "+ totalFees);
    }
}
