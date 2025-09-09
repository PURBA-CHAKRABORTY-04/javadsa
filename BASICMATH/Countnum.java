import java.util.Scanner;
// Program to count the number of digits in a number

public class Countnum{
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=sc.nextInt();
        int count=0;
        while(num!=0){
            num=num/10;
            count++;
        }
        System.err.println("Number of digits in the given number is: " + count);
    }
}