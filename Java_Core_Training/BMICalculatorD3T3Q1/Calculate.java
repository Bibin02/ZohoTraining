package BMICalculatorD3T3Q1;

public class Calculate{
    private float BMI;
    public Calculate(CalcInput inp){
        BMI = inp.a / inp.b;
    }

    public void display(){
        System.out.println(BMI);
    }
}
