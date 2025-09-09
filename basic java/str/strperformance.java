public class strperformance{
    public static void main(String[] args) {
        String empty="";
        for (int i=0;i<26;i++){
              char ch=(char)('a'+i); // Convert integer to character
              System.out.println(ch);
                empty+=ch; // String concatenation
        }
        System.out.println("Final string: " + empty);
    }
}