import java.util.Scanner;
public class Greater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.close();
        if(a>b){
            if(a>c){
                System.out.println(a+" is greater");
            }
            else{
                System.out.println(c+" is greater");
            }
        }
        else if(a>c){
            System.out.println(b+" is greater");
        }
        else{
            if(b>c){
                System.out.println(b+" is greater");
            }
            else{
                System.out.println(c+" is greater");
            }
        }
    }
}
