package Pack2;
import Pack1.CalculateArea;
import java.util.Scanner;
public class Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Radius of circle: ");
        int radius = sc.nextInt();
        sc.close();
        CalculateArea.calArea(radius);
    }
}
