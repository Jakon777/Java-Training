
import java.util.Scanner;

public class VowelChecker {
    public static void main(String[] args) {

        //not efficient ***************
        // List<Character> vowels = Arrays.asList('a','e','i','o','u');
        // boolean flag = false;
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter any alphabet");
        // char ch = sc.next().charAt(0);
        // for(char c:vowels){
        //     if(c==ch){
        //         flag = true;
        //         break;
        //     }
        // }
        // if(flag)
        // System.out.println(ch+" is a vowel");
        // else
        // System.out.println(ch+" is not a vowel");

        //efficient code **************
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().toLowerCase().charAt(0);  // convert to lowercase immediately

        // Check if character is a vowel
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println(ch + " is a vowel.");
        } else {
            System.out.println(ch + " is not a vowel.");
        }

        sc.close();
         
    }
}
