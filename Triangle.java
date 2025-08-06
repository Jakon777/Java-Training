import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the three sides of Triangle: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.close();
        if(a == b && b == c && c == a){
            System.out.println("triangle is Equilateral");
        }
        else if(a==b || b==c || c==a){
            System.out.println("Triangle is Isosceles");
        }
        else{
            System.out.println("Triangle is Scalene");
        }
    }
}
