import java.util.Scanner;   
public class factorial{
public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter a number to find its factorial:");
    int n= sc.nextInt();
    int ans=fact(n);
    System.out.println("Factorial of " + n + " is: " + ans);
}
static int fact(int n){
    if (n==1){
        return 1;

    }
else{
    return n*fact(n-1);
}
}
}
