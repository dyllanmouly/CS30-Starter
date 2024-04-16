import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner keys = new Scanner(System.in);
        Scanner keys2 = new Scanner(System.in);
        Scanner doub = new Scanner(System.in);
        Scanner doub2 = new Scanner(System.in);
        
        System.out.print("Number 1: ");
        int num1 = keys.nextInt();
        System.out.print("Number 2: ");
        int num2 = keys2.nextInt();
        System.out.print("Number 3: ");
        double num3 = doub.nextInt();
        System.out.print("Number 4: ");
        double num4 = doub2.nextInt();

        int sum = num1 + num2;
        double sum2 = num3 + num4;
        System.out.println("Number 1 + Number 2 = " + sum);
        System.out.println("Number 3 + Number 4 = " + sum2);
        
    }
}
