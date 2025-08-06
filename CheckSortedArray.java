public class CheckSortedArray {
    static boolean isSorted(int a[],int index){
        if(index==a.length-1){
            return true;
        }
        if(a[index]>a[index+1]){
            return false;
        }
        return isSorted(a, index+1);

        
    }
    public static void main(String[] args) {
        int a[] = {1,3,9,4,5};
        System.out.println(isSorted(a, 0)?"Sorted":"Not");
    }
}
