import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number: ");
        int n = sc.nextInt();
        sc.close();
        System.out.println("the square root of the number "+n+" is "+(Math.sqrt(n)));
    }
}
