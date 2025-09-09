public class Palindrome{
    public static void main(String[] args) {
        String str = "madam";

        String reversedStr = "";
        int strLength=str.length();
        for(int i=strLength-1;i>=0;i--){
            reversedStr += str.charAt(i);
        }
        if (str.toLowerCase().equals(reversedStr.toLowerCase())) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }
}