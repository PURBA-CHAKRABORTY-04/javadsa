public class bubblesort{
    public static void main(String[] args) {
        int []arr={2,5,8,51,52,59,7};
        int n=arr.length;
        bubblearr(arr,n);
       for(int i=0;i<n;i++){
        System.out.print(arr[i]+" ");
    }
    }
    static void bubblearr(int[]arr,int n){
        if(n==1){
            return;
        }
        for(int i=0;i<n-1;i++){
            if (arr[i]>arr[i+1]){
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;  
            }
        }
        bubblearr(arr,n-1);
    }
}