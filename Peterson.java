public class Peterson {
    public static void main(String[] args) {
        int n = 145;
        int num = n;
        int sum = 0;
        while(n!=0){
            n = n%10;
            int temp = n;
            while(temp!=1){
                int fact = 1;
                fact*=temp;
                temp--;
                sum +=fact;
            }
            n/=10;

        }
        System.out.println(num==sum);
    }
}
