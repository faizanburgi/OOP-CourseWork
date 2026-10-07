package W6Methods;

public class UnitConversion {
    public static double poundToKilogram(double pound){
        double kilogram = 2.204 * pound;
        return kilogram;
    }
    public static double kilogramToPound(double kilogram){
        double pound = 0.453 * kilogram;
        return pound;
    }

    public static void main(String[] args) {
        System.out.println("Kilogram          Pound");
        for(double kilogram = 1; kilogram<200 ; kilogram +=2){
        System.out.println( kilogram +"               "+kilogramToPound(kilogram) );
        }
        System.out.println("Pound             Kilogram");
        for(double pound = 20; pound<=515 ; pound +=5){
            System.out.println( pound +"               "+poundToKilogram(pound) );
        }
    }
}
