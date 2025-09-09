import java.util.Scanner;
public class sortedarrrec{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n= sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int val=issorted(arr,0);
        if (val==1){
            System.out.println("The array is sorted.");
        }
        else{
            System.out.println("The array is not sorted.");
        }
    }
    static int issorted(int[]arr,int i){
        if (i==arr.length-1 && arr[i]>=arr[i-1])
            return 1;
        if (arr[i+1]>arr[i])
        {
            return issorted(arr,i+1);
        }

    else
        return 0;
        
    } 

}