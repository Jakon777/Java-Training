import java.util.Arrays;

public class NumberPosition {

    static int[] helper(int a[], int index, int val,int count){
        if(index==a.length){
            int result[] = new int[count];
            return result;
        }
        if(a[index]==val){
            count++;
        }
        int result[] = helper(a, index+1, val, count);
        if(a[index]==val){
            result[count-1]=index;
        }
        return result;
    }

    static int[] numberPos(int a[], int index, int val){
            return helper(a, index, val, 0);
        }
    public static void main(String[] args) {
        int a[] = {10,21,10,12,11,10,19,10};
        int result[] = numberPos(a, 0, 10);
        System.out.println(Arrays.toString(result));
    }
}
