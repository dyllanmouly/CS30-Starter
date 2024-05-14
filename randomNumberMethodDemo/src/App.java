import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner keys = new Scanner(System.in);
        
        // System.out.println("Enter an integer: ");
        // int int1 = keys.nextInt();

        // System.out.println("Enter another integer: ");
        // int int2 = keys.nextInt();

        // System.out.println("Enter a decimal number: ");
        // double dbl1 = keys.nextDouble();

        // System.out.println("Enter a sceond decimal number: ");
        // double dbl2 = keys.nextDouble();
        
        System.out.println("The number is: " + rdDbl(100));
        System.out.println("The number is: " + rdInt(20, 100));
    }

    //Custom Random Double Generator
    public static double rdDbl(double max) {
        //generate random double between 0 and max
        double gen = Math.random() * max;

        return gen;
    }

    public static int rdInt(int min, int max) {
        //generate random double between 0 and max
        double gen = Math.random() * (max - min) + min;

        // Math.random * 80 + 20 ----> number between 20 and 100

        //cast the double as an int to drop the decimals
        return (int) gen;
    }
}
