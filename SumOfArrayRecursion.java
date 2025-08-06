public class SumOfArrayRecursion {
    static int doSum(int a[],int index){
        if(index==a.length){
            return 0;
        }
        int sum = doSum(a, index+1);
        return sum+a[index];
    }

    static int doMultiply(int a[],int index){
        if(index==a.length){
            return 1;
        }
        int multiply = doMultiply(a, index+1);
        return multiply*a[index];
    }


    public static void main(String[] args) {
        int a[]={10,20,30,40,50};
        int sum = doSum(a, 0);
        System.out.println(sum);
        int mul = doMultiply(a,0);
        System.out.println(mul);
    }    
}
