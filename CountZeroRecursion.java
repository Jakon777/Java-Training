public class CountZeroRecursion {
    static void countZero(int n, int count){
        if(n==0){
            System.out.println(count);
            return;
        }
        if(n%10==0)
        count++;
        countZero(n/10, count);
    }

    public static void main(String[] args) {
        countZero(1010020, 0);
    }
}