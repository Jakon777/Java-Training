public class NumberToString {
    static String word[] = {"ZERO","ONE","TWO","THREE","FOUR","FIVE","SIX","SEVEN","EIGHT","NINE"};
    static void numToWords(int n){
        if(n==0){
            return;
        }
        numToWords(n/10);
        System.out.print(word[n%10]+" ");
    }
    public static void main(String[] args) {
        int n = 1543;
        numToWords(n);
    }
}
