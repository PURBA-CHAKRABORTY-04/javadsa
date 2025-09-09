import java.util.Scanner;
public class sumofdigitsrec{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find the sum of its digits:");
        int num = sc.nextInt();
        int result= sum(num);
        System.out.println("Sum of digits of " + num + " is: " + result);
    }
    static int sum(int num){
        int temp= num % 10; // Get the last digit
        if (temp == num) { // Base case: if the number is a single digit
            return temp;
        }
        num= num / 10; // Remove the last digit
        return temp + sum(num); 
    }
}