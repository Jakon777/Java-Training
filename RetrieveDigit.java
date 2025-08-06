public class RetrieveDigit {
    public static void main(String[] args) {
        int a =12345;
        int n = a;
        int digits=1;
        while(a!=0){
            digits*=10;
            a/=10;
        }
        digits/=10;
        while(n!=0){

            System.out.println(n/digits);
            n=n%digits;
            digits=digits/10;
        }
    }
      
}
