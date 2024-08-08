/*
4(L2).Print the average of three numbers entered by user 
by creating a class named 'Average' having a method to calculate and print the average.
*/
public class D2T2Q4 {
public static void main(String[] args) {
Average objAverage = new Average();
System.out.println(objAverage.avg(3,6,3,2,1,9,7,5));
}
}
class Average{
int avg(int...vals){
int result = 0;
for (int i:vals) {
result += i; 
}
return result / vals.length;
}
}