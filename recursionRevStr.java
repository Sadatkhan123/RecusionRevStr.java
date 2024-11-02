public class recursionRevStr {

    static String rev="";
    public static void s (String str,int i){
        if(i==0)
        {
            System.out.println(rev);
            return ;
        }
        char ch=str.charAt(i);
        rev=rev+ch;
        s(str, i-1);

    }
    public static void main(String[] args) {
        String str=" hello";
        int i=str.length()-1;
        s(str,i);
    }
}
