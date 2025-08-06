import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int temp = n;
        while(n!=0){
                int rem = n%10;
                sum += rem;
                n = n/10;
        }
        System.out.println("the sum of the  digits of the number "+temp+" is "+sum);
        sc.close();

    }
}
