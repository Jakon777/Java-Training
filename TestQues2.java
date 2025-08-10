public class TestQues2 {
    static void sumOfDigits(int n){
        System.out.print(n+" ");
        if(n<10){
            return;
        }
        int sum = helper(n);
        sumOfDigits(sum);
    }
    static int helper(int n){
        if(n==0) {
            return 0;
        }
        return n%10 + helper(n/10);
    }
    public static void main(String[] args) {
        int n = 9876;
        sumOfDigits(n);
    }
}
