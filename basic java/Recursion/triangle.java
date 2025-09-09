public class triangle{
    public static void main(String[] args) {
        printtri(4,0);//row and column
        printtri2(4,0);
    }
    static void printtri(int r,int c){
        if (r==0){
            return;
        }
        if (c<r){
            System.out.print("$");
            printtri(r,c+1);
        }
        if (r==c){
            System.out.println("");
            printtri(r-1,0);
        }
    }
    static void  printtri2(int r,int c){
        if (r==0){
            return;
        }
        if (c<r){
          
            printtri(r,c+1);
              System.out.print("$");
        }
        else{
          
            printtri(r-1,0);
              System.out.println("");
        }
    }
}