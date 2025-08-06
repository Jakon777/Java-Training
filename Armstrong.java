public class Armstrong {
    public static void main(String[] args) {
        int n =153;
        int n1=n;
        int sum=0;
        int digits=String.valueOf(n).length();

            while(n>0){
                int digit= n%10;
                sum += Math.pow(digit, digits);
                n/= 10;

            }
            if(sum==n1){
                System.out.println("the given number is armstrong");
            }
            else{
                System.out.println("the given number is not armstrong");
            }
        }


}
