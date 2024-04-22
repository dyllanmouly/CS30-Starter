import java.util.Scanner;
public class geomtryCalculator {
        
    private int formula, length, width, side, radius;

        public int formulaSelect()
        {
            Scanner keys = new Scanner(System.in);
            System.out.println("Would you like to calculate: \n Perimeter of a rectangle, (1) \n Surface area of a cube, (2)  \n Area of a circle (3)?");
            int formulaPicked = keys.nextInt();

            return formulaPicked;
        }
        
        public void rectangle()
        {
            Scanner keys = new Scanner(System.in);
            System.out.println("What is the length? ");
            length = keys.nextInt();
            System.out.println("what is the width? ");
            width = keys.nextInt();
            System.out.println("The answer is: ");
            System.out.println(2 * (length + width));
        }
        public void cube()
        {
            Scanner keys = new Scanner(System.in);
            System.out.println("What is the side? ");
            side = keys.nextInt();
            System.out.println("The answer is: ");
            System.out.println(6 * (side * side));
        }
        public void circle()
        {
            Scanner keys = new Scanner(System.in);
            System.out.println("What is the radius? ");
            radius = keys.nextInt();
            System.out.println("The answer is: ");
            System.out.println(3.14 * (radius * radius));
        }
    }

