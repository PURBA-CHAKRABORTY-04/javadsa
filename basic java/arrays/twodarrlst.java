
import java.util.ArrayList;
import java.util.Scanner;
public class twodarrlst{
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        for (int i=0;i<3;i++){//initializing arralist of Integer type in the 2d arraylist each index of i will point to a specific 1darraylist
            arr.add(new ArrayList<>());
        }
        //creating a 2d array;ist
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements for a 2D ArrayList (3 rows, 4 columns):");
         //taking input from user1 2 3 4 5 6 7 8 9 0 10 11 12 13 14
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                arr.get(i).add(sc.nextInt());
            }
           
        }
          for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                System.out.print(arr.get(i).get(j) + " ");
            }
            System.out.println();
        }

       
    }
}