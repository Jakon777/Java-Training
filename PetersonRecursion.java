public class PetersonRecursion {
    static int strongCheck(int n){
        if(n==0){
            return 0;
        } 

        int result = strongCheck(n/10);
        return result + calculateFactorial(n%10);


    }
    static int calculateFactorial(int num){
        if(num==1 || num==0) 
            return 1;
        return num*calculateFactorial(num-1);
    }
    public static void main(String[] args) {
        int n = 142;
        System.out.println(n==strongCheck(n)?"Strong Number" : "Not a Strong Number");
    }
}
