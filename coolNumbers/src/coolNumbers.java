import java.util.Scanner;
public class coolNumbers{

private int num;

public static boolean CoolNum( int num )
{
    Scanner keys = new Scanner(System.in);
    System.out.println("Choose a number. ");
    num = keys.nextInt();
    for (int x = num; x > 0; x--){
        if (num % 3 == 1 && num % 4 == 1 && num % 5 == 1 && num % 6 == 1){
            System.out.println("cool number :) " + num);
            num--;
        }
        else{
            System.out.println("not cool :( " + num);
            num--;
        }
        
   
}
return false;
}

}



    