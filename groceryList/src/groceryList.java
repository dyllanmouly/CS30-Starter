import java.util.ArrayList;
import java.util.Scanner;
public class groceryList {

static String item;
static int listLength, quit;
static ArrayList<String> theList = new ArrayList<String>();

public static String shoppingList() 
{
    listLength = 0;
    for (int listLength = 3; listLength > 0; listLength++)
    {
        Scanner keys = new Scanner(System.in);
        System.out.println("What would you like to add?");
        item = keys.nextLine();
        theList.add(item);
        System.out.println("Your list: " + theList);
        System.out.println("Is that all? (1 = yes, 2 = no)");
        quit = keys.nextInt();
        if (quit == 1){
            System.out.println("Here is your final list: " + theList);
            break;
        }
        else;
    }
    return item;
}

}

