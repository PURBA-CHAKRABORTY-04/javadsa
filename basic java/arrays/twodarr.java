
import java.util.*;

public class twodarr {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr = {
            {1, 2, 3},
            {4, 5},
            {7, 8, 9}
        };
        for (int i = 0; i < arr.length; i++) {// for each loop
            for (int j = 0; j < arr[i].length; j++) {// for(int[]i: arr)        
                System.out.print(arr[i][j] + " ");//for(int j: i)
                // System.out.print(Arrays.toString(arr[i][j]));here arrays.tostring expects an array but we are passing integer so its not working  
                // System.out.println(); 
            }
            System.out.println();
        }
    }

}
