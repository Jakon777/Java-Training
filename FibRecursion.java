public class FibRecursion {
    static int fib(int n) {
        
        if(n==0||n==1){
            return n;
        }
        return fib(n-1)+fib(n-2);
    }
    public static void main(String[] args) {
        int n = fib(5);
        System.out.println(n);
    }
}
