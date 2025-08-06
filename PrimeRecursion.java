public class PrimeRecursion {

    static void isPrime(int n,int i){
        if(n<2){
            System.out.println("Number is not prime");
            return;
        }
        if(n==2){
            System.out.println("Number is Prime");
            return;
        }
        if(n%i==0){
            System.out.println("Number is not Prime");
            return;
        }
        if(i==2){
            System.out.println("Number is Prime");
            return;
            
        }
        isPrime(n, i-1);
    }

    static int isPrime2(int n){
        
        return 0;
    }

    public static void main(String[] args) {
        isPrime(1, 0);      //isPrime(n,n-1)
    }
}
