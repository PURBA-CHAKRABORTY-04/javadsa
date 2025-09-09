public class strbuilder{
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder();
        for (int i=0;i<26;i++){
            char ch=(char)('a'+i);
            sb.append(ch); // Using StringBuilder for efficient string concatenation
        }
        System.out.println("Final string: " + sb.toString());
    }
}