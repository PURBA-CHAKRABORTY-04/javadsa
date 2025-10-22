public class StackMain extends stackk{
  public static void main(String[] args)throws Exception {
      stackk st=new stackk(5);
        st.push(10);
        st.push(20);
        st.push(30);
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());   
  }

}