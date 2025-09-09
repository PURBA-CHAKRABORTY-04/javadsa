
import java.util.ArrayList;
import java.util.Scanner;

public class Arraylistsoperation {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<Integer> num = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        System.out.println(numbers);
        numbers.set(2, 100);
        numbers.remove(1);
        Scanner sc = new Scanner(System.in);
        System.out.println(numbers);
        int size;
        System.out.println("enter the size of arrlist");
        size = sc.nextInt();
        for (int i = 0; i < size; i++) {
            num.add(sc.nextInt());
        }
        System.out.println(num);
        System.out.println(num.get(2));
    }
}
