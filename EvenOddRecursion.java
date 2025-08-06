public class EvenOddRecursion {
    static int[] countEvenOdd(int n){
        // [0]=even and [1]=odd
        if(n==0){
            int arr[] = {0,0};      //int arr[]= new int[2];
            return arr;
        }
        int arr[]= countEvenOdd(n-1);
        if(n%2==0){
            arr[0]++;
        }
        else
        arr[1]++;
        return arr;
    }

    static void countEvenOdd(int n,int even,int odd){
        // base case
        if(n==0){
            System.out.println("even numbers: "+even+" odd numbers: "+odd);
            return;
        }
        if(n%2==0){
            even++;  
        }
        else
        odd++;
        countEvenOdd(n-1, even, odd);
    }

    public static void main(String[] args) {
        countEvenOdd(100, 0, 0);    
        int arr[]=countEvenOdd(100);
        System.out.println(arr[0]+" "+arr[1]);
    }
}
