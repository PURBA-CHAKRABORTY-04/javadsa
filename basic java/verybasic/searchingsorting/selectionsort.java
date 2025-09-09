public class selectionsort{
    public static void main(String[] args) {
        int []arr={2,5,1,59,25,63};
        int n=arr.length;
        selection(arr,n);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    static void selection(int[]arr,int n){
        if (n==1){
            return;
        }
        int largest=0;
        for(int i=0;i<n;i++){
            if (arr[largest]<arr[i]){
                largest=i;
            }

        }
         int temp=arr[largest];
         arr[largest]=arr[n-1];
         arr[n-1]=temp;
         selection(arr,n-1);
    }
}