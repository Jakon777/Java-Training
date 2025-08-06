import java.util.HashSet;
public class HappyNumber {
    public static boolean isHappy(int num){
        HashSet<Integer> hash = new HashSet<>();
        while(num!=1 && !hash.contains(num)){
            hash.add(num);
            num = sumOfSquares(num);
        }
        return num==1;
    }
    private static int sumOfSquares(int n){
        int sum = 0;
        while(n>0){
            int digit=n%10;
            sum +=(digit*digit);
            n/=10;
        }
        return sum;

    }
    public static void main(String[] args) {
        int n = 28;
        if(isHappy(n))
        System.out.println(n+" is a Happy Number");
        else
        System.out.println(n+" is not a Happy Number");
}
}
