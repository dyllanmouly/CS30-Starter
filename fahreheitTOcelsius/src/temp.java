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
        System.out.println("Do you want to convert that to Fahrenheit(1) or Celsius(2)?");
        int tempPicked = keys.nextInt();
        
        return tempPicked;
    }

    public void fahrenheitConvert()
    {   //celsius into fahrenheit
        System.out.println(1.8 * temp + 32);
    }

    public void celsiusConvert()
    {   //fahrenheit into celsius
        System.out.println(0.56 * (temp - 32));
    }

}