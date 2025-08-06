public class ArmstrongRecursion {

    static void isArmstrong(int n , int org, int digits, int sum){
        if(n==0){
            System.out.println(org==sum?"Armstrong":"Not Armstrong");
            return;
        }
        sum = (int)(sum+Math.pow(n%10,digits));
        isArmstrong(n/10, org, digits, sum);

    }

    static boolean isArmstrong2(int n,int org,int digits, int sum){
        if(n==0){
            return org==sum;
        }
        sum = (int)(sum+Math.pow(n%10,digits));
        return isArmstrong2(n/10, org, digits, sum);
    }

    public static void main(String[] args) {
        int n = 370;
        int num = n;
        int digits = 0;
        while(n!=0){
            digits++;
            n/=10;
        }
        isArmstrong(num, num, digits, 0);
        if(isArmstrong2(num, num, digits, 0)){
            System.out.println("Armstrong");
        }
        else
        System.out.println("Not Armstrong");
    }
}
