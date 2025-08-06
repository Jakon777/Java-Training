public class Lcm {
    public static void main(String[] args) {
        int a = 10;
        int b = 2;
        int big = a>=b?a:b;
        while (true) {
            if (big%a==0 && big%b == 0) {
                System.out.println("LCM is"+big);
                break;
            }
            big++;
        }

    }
}
