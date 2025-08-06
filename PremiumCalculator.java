import java.util.Scanner;

public class PremiumCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Name: ");
        String name = sc.nextLine();
        System.out.println("Enter your Gender: ");
        String gender = sc.next();
        System.out.println("Enter your Age: ");
        int age = sc.nextInt();
        System.out.println("Enter your City (Metro or Non-Metro): ");
        String city = sc.next().toLowerCase();
        sc.close();
        if (age >= 25 && age <= 35 && gender.equals("male") && city.equals("metro")) {
            System.out.println(name+", Your Premium is 6%");
        }
        else if (age >= 25 && age <= 40 && gender.equals("male") && city.equals("non-metro")) {
            System.out.println(name+", Your Premium is 4%");
        }
        else if (age >= 25 && age <= 42 && gender.equals("female") && city.equals("metro")) {
            System.out.println(name+", Your Premium is 3%");
        } 
        else if (age >= 25 && age <= 45 && gender.equals("female") && city.equals("non-metro")) {
            System.out.println(name+", Your Premium is 2%");
        } 
        else {
            System.out.println(name+", You're Not Insured");
        }


    }

}
