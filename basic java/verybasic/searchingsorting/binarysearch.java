public class binarysearch{
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 5;
        int result = binary(arr, 0, arr.length - 1, target);
          if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
    static int binary(int[]arr,int left,int right,int target){
        int mid=left+(right-left)/2;
        if(left>right){
            return -1; // Target not found
        }
        else if (arr[mid]==target){
            return mid;
        }
        else if (arr[mid]<target){
            return binary(arr,mid+1,right,target);
        }
        else{
            return binary(arr,left,mid-1,target);
        }
    }
}
