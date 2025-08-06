public class EOCount {
    public static void main(String[] args) {
        int evencount = 0;
        int oddcount =0 ;
        System.out.println("Even number between 1 to 100 are: ");
        for(int i =1; i<=100;i++){
            if(i%2==0){
                System.out.print(i+" ");
                evencount +=1;
            }
        }
        System.out.println("\ntotal even numbers between 1 to 100 is: "+evencount);
        System.out.println("Odd number between 1 to 100 are: ");
        for(int i =1; i<=100;i++){
            if(i%2!=0){
                System.out.print(i+" ");
                oddcount +=1;
            }
        }
        System.out.println("\ntotal odd numbers between 1 to 100 is: "+oddcount);
    }
}
