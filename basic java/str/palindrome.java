
public class palindrome {

    public static void main(String[] args) {
        String str = "madam";
        StringBuilder sb = new StringBuilder(str);
        String reversed = sb.reverse().toString();
        if (str.toLowerCase().equals(reversed.toLowerCase())) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
    }
}
