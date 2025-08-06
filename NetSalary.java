import java.util.Scanner;

public class NetSalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the basic salary of the employee: ");
        float net = sc.nextFloat();
        sc.close();
        float pf = 1400;
        float hra = (float) (0.30*net);
        float da = (float) (0.20*net);
        float ta = (float) (0.10*net);
        System.out.println("The HRA is : "+hra);
        System.out.println("The DA is : "+da);
        System.out.println("The TA is : "+ta);
        System.out.println("The Net Salary is : "+(net+hra+ta+da-pf));
    }
}
