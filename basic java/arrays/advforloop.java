
public class advforloop {

    public static void main(String[] args) {

        int[][] arr = {
            {1, 2, 3},
            {4, 5},
            {7, 8, 9}
        };
        for (int[] i : arr) {//for(datatype of each element element:the array  )
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

}
