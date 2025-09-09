import java.util.Scanner;
public class countzeros{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=sc.nextInt();
        int cz=count(num, 0);
        System.out.println("Count of zeros: " + cz);
    }
    static int count(int num,int count){
        int temp=num%10;
        if (temp==0){
            count=count+1;}
            if (num<10){
                return count;
            }
            return count(num/10,count);
    }

    }