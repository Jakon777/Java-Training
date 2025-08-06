import java.util.Scanner;
public class SwapNum {
    public static int[] swapWithTemp(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        return new int[]{a,b};
    }
    public static int[] swapWithoutTemp(int a, int b){
        a = a+b;
        b = a-b;
        a = a-b;
        return new int[]{a,b};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 integer numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        int[] swapped = swapWithTemp(a,b);
        int[] swapped2 = swapWithoutTemp(a,b);
        System.out.println("Numbers before Swapped are: ");
        System.out.println("a = "+a+"\n"+"b= "+b);
        System.out.println("Numbers after Swapped are: ");
        System.out.println("a = "+swapped[0]+"\n"+"b= "+swapped[1]);
        System.out.println("a = "+swapped2[0]+"\n"+"b= "+swapped2[1]);
    }
}


