public class App {
    public static void main(String[] args) throws Exception {
        int x = 5;

        //checks if x is over 5
        if (x>5) {
            System.out.println("BIG NUMBER");
        }
    
        //this is -12 < x < 5 because 5 is already checked
        else if (x > -12) {
            System.out.println("Mild Weather");
        }

        // this os x =< -12 because the others have been checked
        else {
            System.out.println("VERY COLD");
        }
    }

}
