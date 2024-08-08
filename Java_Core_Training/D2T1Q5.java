/*5(L3).Write a program that generates a random number and asks the user to guess hat the number is. 
If the user's guess is higher than the random number, 
the program should display "Too high, try again." 
If the user's guess is lower than the random number, 
the program should display "Too low, try again." 
The program should use a loop that repeats until the user correctly guesses the random number. */

import java.util.Scanner;

public class D2T1Q5 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int num = (int)(Math.random()*100),guess;
// System.out.println(num);
do {
System.out.print("Guess the number : ");
guess = sc.nextInt();

if (guess == num) {
System.out.println("Congrats you found it");
}
else if (guess > num) {
System.out.println("Too High");
}
else
System.out.println("Too Low");

} while (num != guess);
sc.close();
}
}
