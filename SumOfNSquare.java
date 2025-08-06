import java.util.Scanner;
public class SumOfNSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter the Number upto which you want the sum: ");
        int n = sc.nextInt();
        sc.close();
        for(int i = 1;i<=n;i++){
            sum +=i*i;
        }
        System.out.println("the sum of square of numbers upto "+n+ " is "+sum);
    }
}
