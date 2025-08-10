import java.util.ArrayList;

public class TestQues3 {
    static ArrayList<Integer> hash = new ArrayList<>();
    static void sumOfNum(int N){
        helper(N);
        return;
    }
    static void helper(int N){
        System.out.print(N+" ");
        if(N==1 || hash.contains(N)){
            return;
        }
        hash.add(N);
        if(N%2==0){
            N/=2;
        }
        else{
            N = N*3-1;
        }
        helper(N);

    }
    public static void main(String[] args) {
        int N = 6;
        sumOfNum(N);
    }
}
