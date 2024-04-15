import java.util.Scanner;

public class bigORsmallRunner {
    public static void main(String[] args) throws Exception {
    Scanner keys = new Scanner(System.in);
    Scanner keys2 = new Scanner(System.in);

    System.out.print("Enter a number: ");
    int num1 = keys.nextInt();
    System.out.print("Enter a number to compare: ");
    int num2 = keys2.nextInt(); 

    if (num1 > num2){
        System.out.print("Number 1 is bigger.");
    }
    else if (num1 < num2){
        System.out.print("Number 2 is bigger.");
    }
    else{
        System.out.println("Same.");
    }
    
    }
}
