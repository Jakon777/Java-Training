import java.util.Scanner;
public class AreaandPeri {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length and breadth of rectangle: ");
        int l = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        int peri = 2*(l+b);
        int ar = l*b;
        System.out.println("the Perimeter and Area of the rectangle is :"+peri+"m \n"+ar+"m*m");
    }
}
