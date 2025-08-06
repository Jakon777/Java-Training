import java.util.Scanner;

public class NumberReverse {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number that you want reverse: ");
        int n = sc.nextInt();
        int temp = n;
        while(n!=0){
            int r = n%10;
            sum = (sum*10)+r;
            n /=10;
        }
        System.out.println("the reverse of the number "+temp+" is "+sum);
        sc.close();
    }
}
