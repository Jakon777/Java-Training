public class StringNumToNumber {
    static int convert(String str,int result){
        if(str.length()==0){
            return result;
        }
        result = result*10+(str.charAt(0)-'0');
        return convert(str.substring(1),result);

    }
    public static void main(String[] args) {
        String str = "123";
        int n = convert(str,0);
        System.out.println(n);
    }
}
