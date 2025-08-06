public class EvenOdd {
    public static void main(String[] args) {
        System.out.println("Even number between 1 to 20 are:");
        for(int i = 1;i<=20;i++){
            if(i%2==0){
                System.out.print(i+" ");
            }
        }
        System.out.println("\n Odd number between 1 to 20 are:");
        for(int i = 1;i<=20;i++){
            if(i%2!=0){
                System.out.print(i+" ");
            }
        }
    }
}
