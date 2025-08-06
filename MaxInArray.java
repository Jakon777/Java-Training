public class MaxInArray {

    static int max(int a[],int index){
        if(index==a.length){
            return 0;
        }
        int m = max(a,index+1);
        if(a[index]>m){
            m=a[index];
        }
        return m;
    }
    public static void main(String[] args) {
        int arr[]= {90,100,8,50,88};
        int maximum = max(arr, 0);
        System.out.println("the maximum element is: "+maximum);
    }
}
