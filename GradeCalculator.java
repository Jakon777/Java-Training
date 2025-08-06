import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks: ");
        float marks = sc.nextFloat();
        sc.close();
        if(marks>=90){
            System.out.println("Your Grade is : 'A' ");
        }
        if(marks<90 && marks>=70){
            System.out.println("Your Grade is : 'B' ");
        }
        if(marks<70 && marks>=50){
            System.out.println("Your Grade is : 'C' ");
        }
        if(marks<50){
            System.out.println("Your Grade is : 'D' ");
        }
    }
}
