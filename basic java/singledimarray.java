
public class singledimarray {

    int array[] = null;

    public singledimarray(int size) {
        array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.MIN_VALUE;
        }
    }

    public void insert(int index, int val) {
        try {
            if (array[index] == Integer.MIN_VALUE) {
                array[index] = val;
            } else {
                System.out.println("Index already occupied.");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index out of bounds.");
        }
    }

    public void display() {
        for (int i = 0; i < array.length; i++) {
            if (array[i] != Integer.MIN_VALUE) {
                System.out.print(array[i] + " ");
            } else {
                System.out.print("null ");
            }
        }
        System.out.println();
    }

    public void searchelement(int val) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == val) {
                System.out.println("Element found at index: " + i);
                return;

            } else if (i == array.length - 1) {
                System.out.println("Element not found.");
            }
        }
    }

    public void delelement(int index) {
   try { for (int i=0;i<array.length;i++)
         {
            if (array[i]==Integer.MIN_VALUE){
                System.out.println("No element found at indexor val already deleted: " + i);
            }
            else if (i==index) {
                array[i] = Integer.MIN_VALUE;
             }
         }
    } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Index out of bounds.");
       
   } 
}

    

    public static void main(String[] args) {
        singledimarray arr = new singledimarray(5);
        arr.insert(0, 10);
        arr.insert(1, 20);
        arr.insert(2, 30);

        arr.insert(3, 40);
        arr.insert(4, 50);
        arr.display();
        arr.searchelement(30);
        arr.searchelement(100);
        arr.delelement(50);
        arr.delelement(120);
    }

}
