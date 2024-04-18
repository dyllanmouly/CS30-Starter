import java.util.Scanner;
public class temp {

    private int temp;

    public void setTemp()
    {
        Scanner keys = new Scanner(System.in);
        System.out.println("Enter temperature: ");
        temp = keys.nextInt();
    }
     
    public int tempType()
    {
        Scanner keys = new Scanner(System.in);
        System.out.println("Is that temperature in Fahrenheit(1) or Celsius(2)?");
        int tempPicked = keys.nextInt();
        
        return tempPicked;
    }

    public void fahrenheitConvert()
    {
        System.out.println(1.8 * temp + 32);
    }

    public void celsiusConvert()
    {
        System.out.println(0.56 * (temp - 32));
    }

}