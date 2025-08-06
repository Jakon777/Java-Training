import java.util.Scanner;
public class SimpleInterest {
    public static float simpleInterest(int p, float r, int t){
        float si = (float)(p*r*t)/100;
        return si;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Principle, Rate and Time(years):");
        int p = sc.nextInt();
        float r = sc.nextFloat();
        int t = sc.nextInt();
        sc.close();
        System.out.println("the simple interest is: "+simpleInterest(p, r, t));
    }
}
