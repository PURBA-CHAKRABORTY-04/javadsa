import java.util.Scanner;
public class movezeros{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
       int[]arr=new int[size];
       for(int i=0;i<arr.length;i++){
           arr[i]=sc.nextInt();
       }
        int[]temp=new int[size];
        for(int i=0,j=0;i<size;i++){
            if(arr[i]!=0){
                temp[j]=arr[i];
                j++;
            }
        }
       // int zeros=size-temp.length;
        for(int i=temp.length;i<size;i++){
            temp[i]=0;
        }
        for(int i=0;i<size;i++){
            System.out.print(temp[i]+" ");
        }
}
}