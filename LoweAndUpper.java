import java.util.Scanner;
public class LoweAndUpper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter anything: ");
        String str = sc.nextLine();
        sc.close();
        System.out.println("UpperCase sentence: "+str.toUpperCase());
        System.out.println("LowerCase sentence: "+str.toLowerCase());

    }
}
