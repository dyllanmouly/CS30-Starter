import java.util.Scanner;
public class Sum {
        
    private double totalSum, num1, num2;

    public void setNums()
    {
    Scanner keys = new Scanner(System.in);
    System.out.println("Enter a number: ");
    num1 = keys.nextInt();
    System.out.println("Another number: ");
    num2 = keys.nextInt();
    }

    public void sum()
    {
    totalSum = (num1 + num2);
    }

    public void print()
    {
    System.err.println("The total sum is: " + totalSum );
    }
}
