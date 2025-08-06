public class PowerRecursion {
    static int powerOfNumber(int n ,int power){
        if(power==0){
            return 1;
        }
        if(n==0){
            return 0;
        }
        return n*powerOfNumber(n, power-1);
        
    }
    public static void main(String[] args) {
        int result = powerOfNumber(5, 0);
        System.out.println(result);
    }
}
