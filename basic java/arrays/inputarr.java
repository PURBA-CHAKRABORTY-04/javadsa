import java.util.Scanner;
public class inputarr{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
 
      int[][] arr=new int[3][];
      for(int i=0;i<arr.length;i++){
          System.out.print("Enter the size of row " + i + ": ");
          int size = sc.nextInt();
          
          arr[i] = new int[size];
          for(int j=0;j<size;j++){
              System.out.print("Enter element [" + i + "][" + j + "]: ");
              arr[i][j] = sc.nextInt();
          }
      }
      System.out.println("The 2D array is:");
      for(int i=0;i<arr.length;i++){
          for(int j=0;j<arr[i].length;j++){
              System.out.print(arr[i][j] + " ");
          }
          System.out.println();
      }
      sc.close();
  }

}