public class rotatedbinarysearch{
    public static void main(String[] args) {
        int []arr={4,5,6,7,0,1,2};
        int target=0;
        int result=binsearch(arr,target,0,arr.length-1);
        if(result!=-1){
            System.out.println("Element found at index: " + result);
        }
        else{
            System.out.println("Element not found in the array.");
        }

    }
    public static int binsearch(int[]arr,int target,int start,int end){
        if (start > end) {
            return -1;
        }
        int mid=start+(end-start)/2;
        if (arr[mid]==target){
            return mid;
        }
        if (arr[start]<arr[mid]){ //case1 where left part is sorted
            if (target>=arr[start]&& target<arr[mid]){// case1 but the target element is in the left part
                return binsearch(arr,target,start,mid-1);
            }
            else{
                return binsearch(arr,target,mid+1,end);// case1 but the element is in the right part the unsorted part
            }
        }
       if (target>arr[mid]&& target<arr[end]){// case2 where right part is sorted
        return binsearch(arr,target,mid+1,end);// case2 but the element is in the right part
       }
       else{
        return binsearch(arr,target,start,mid-1);// case2 but the element is in the left part
       }

    }
}
//this is a rotated binary search where the array is rotated at some pivot point so we have to look for which part is sorted and gotta
//check which part it is in..