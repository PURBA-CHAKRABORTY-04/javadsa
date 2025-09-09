import java.util.Scanner;
public class linearsearchrec{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n= sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the element to search:");
        int target = sc.nextInt();
        int val =linearsearch(arr,0,target);
        if(val==-1){
            System.out.println("Element not found");
        }
        else{
            System.out.println("Element found at index: " + val);
        }
    }
    static int linearsearch(int[]arr,int i,int target){
        if(arr[i]==target){
            return i;
        }
        else if(i>arr.length-1){
            return -1;
        }
        return linearsearch(arr,i+1,target);
    }
}