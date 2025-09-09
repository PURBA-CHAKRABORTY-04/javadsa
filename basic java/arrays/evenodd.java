
import java.util.*  ;

class evenodd{
    public static void main(String[] args) {
        int[]arr={2,5,6,9,8,59,88,85,66,45,32,12,11,10};
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if (i%2==0){
                even.add(arr[i]);
                
            }
            else{
                odd.add(arr[i]);
            }
        }
        Collections.sort(even);
        Collections.sort(odd);
        System.out.println("Even indexed elements: " + even);
        System.out.println("Odd indexed elements: " + odd);
    }
}