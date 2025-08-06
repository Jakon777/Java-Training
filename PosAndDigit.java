// import java.util.Scanner;

public class PosAndDigit {
    public static void main(String[] args) {
        // int digit = 1;
        // int pos =1;
        // int newPos=0;
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the number: ");
        // int n = sc.nextInt();
        // sc.close();
        // while (n!=0) {
        //     digit = n%10;
        //     int mul =1;
        //     for(int i =1;i<digit;i++){
        //         mul*=10;
        //     }
        //     newPos = newPos+(pos*mul);
        //     pos++;
        //     n/=10;
        // }
        // System.out.println("the new Number after swapping the position and digit is: "+newPos);


        // efficient code =====>
        int num = 35421;
        int pos = 0;
        int sum = 0;
        while (num!=0) {
            int digit = num%10;
            pos++;
            int power = (int)Math.pow(10,digit-1);
            sum = sum + pos*power;
            num/=10;
        }
        System.out.println(sum);
    }
}
