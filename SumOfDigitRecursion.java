public class SumOfDigitRecursion {
    static void sumOfDigit(int n, int org ,int sum){
        if(n==0){
            System.out.println("Sum of the digits of the number "+org+" is: "+sum);
            return;
        }
        sumOfDigit(n/10,org,sum+(n%10));
    }

    static int sumOfDigit2(int n){
        if(n==0){
            return 0;
        }
        return n%10 + sumOfDigit2(n/10);
    }
    public static void main(String[] args) {
        sumOfDigit(51,51,0);
        int result = sumOfDigit2(512);
        System.out.println(result);
    }

}
