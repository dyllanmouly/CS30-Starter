import java.util.Scanner;
public class triangle {
    
    int side1, side2, side3, perimeter;
    double area, sideP;

    public void triangleSides()
    {
        Scanner keys = new Scanner(System.in);
        System.out.println("Side 1?");
        side1 = keys.nextInt();
        System.out.println("Side 2?");
        side2 = keys.nextInt();
        System.out.println("Side 3?");
        side3 = keys.nextInt();
    }

    public void triangleMath()
    {
        perimeter = side1 + side2 + side3;
        
        sideP = perimeter / 2.0;
    
        area = sideP * (sideP - side1) * (sideP - side2) * (sideP - side3);
        area = Math.sqrt(area);
        System.out.println("The area is: " + area);
    }

}
