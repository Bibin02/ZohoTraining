/*
1(L3).Create a BMI calculator by using packages and it should follows,

Create a package file 1 that contains a class that accepts a basic data members need for your calculator

Create a crisp method to calculate a BMI and return the result

Create another package file and create an object for the file 1 class and pass the respective arguments then call the method
*/
import BMICalculatorD3T3Q1.Calculate;
import BMICalculatorD3T3Q1.CalcInput;

public class D3T3Q1 {
    public static void main(String[] args) {
        CalcInput inputObject = new CalcInput();
        Calculate cal = new Calculate(inputObject);
        cal.display();
    }
    
}
