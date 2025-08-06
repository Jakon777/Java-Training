import java.util.Scanner;

public class SwapFirstAndLast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number: ");
        int num = sc.nextInt();
        sc.close();
        int n = num;
        int digit = 1; 
        while(num>10){
            digit*=10;
            num/=10;
        }
        int firstNum = n/digit;
        int lastNum = n%10;
        int middleNumber = (n%digit)-lastNum;
        int swapped = (lastNum*digit)+middleNumber+firstNum;
        System.out.println(swapped);
    }
}
