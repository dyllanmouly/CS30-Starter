import java.util.Scanner;
public class leapYear{

int year;

public void yearSelect()
{
    Scanner keys = new Scanner(System.in);
    System.out.println("Choose a year. ");
    year = keys.nextInt();
}

public void yearCalc()
{
    
    if (year % 400 == 0){
        System.out.println("That year is a leap year.");
    }
    else if(year % 4 == 0 && year % 100 != 0){
        System.out.println("That year is a leap year.");
    }
    else{
        System.out.println("That year is not a leap year.");
    }

}

}
