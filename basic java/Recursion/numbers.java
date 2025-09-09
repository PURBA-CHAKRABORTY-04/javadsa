
import java.util.Scanner;

public class numbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms in the series:");
        int n = sc.nextInt();
        //n=n+1;

        System.out.println(prnt(n));
    }

    static int prnt(int n) {
        if (n == 0) {
            return 0;
        }
        System.out.print(n + " ");
        return prnt(n - 1);
    }
}
