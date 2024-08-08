package BMICalculatorD3T3Q1;
import java.util.Scanner;
public class CalcInput {
    int a;
    int b;
    public CalcInput(){
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Please give appropriate data");
            System.out.print("Weight = :"); 
            this.a = sc.nextInt(); System.out.println();
            System.out.print("Height = :"); 
            this.b = sc.nextInt(); System.out.println();
        } while (a <= 0 || b <= 0);
        
        sc.close();
    }
    
}
