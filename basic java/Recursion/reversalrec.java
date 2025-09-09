
import java.util.Scanner;
public class reversalrec{
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter a number to reverse:");
        int num= sc.nextInt();
        int result= reverse(num);
        System.out.println("Reversed number is: " + result);
    }
    static int reverse(int num){
        if (num < 10) { // Base case: if the number is a single digit
            return num; // Return the number itself
        }
        // int digits = (int) Math.log10(remaining) + 1;
         // Recursive case: reverse the rest of the number and append the last digit
        int temp=num%10;
        num=num/10;
        int digits = (int) Math.log10(num) + 1;
        return (temp* (int)Math.pow(10, digits) + reverse(num));
    }
}