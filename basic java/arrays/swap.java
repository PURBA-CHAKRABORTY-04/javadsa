public class swap{
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5,6,7,8,9};
        swap(arr, 2, 5);
        max(arr);
        reversal(arr);
       

    }
    static void swap(int[] arr,int index1,int index2){
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
        System.out.println("After swapping: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
    static void max(int[] arr){
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if (arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("Maximum element: " + max);
    }
    static void reversal(int[]arr){
        int end=arr.length-1;
        for(int start=0;start<arr.length/2;start++){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            end--;
        }
         System.out.print("Reversed array: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");//println  is not used here cause it prints a new line after   each iteration so we used println here
        }
    }
}