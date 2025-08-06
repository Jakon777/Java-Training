public class Palindrome{

    static boolean isPalindrome(int n,int org,int reverse){
        if(n==0){
            return org==reverse;
        }
        int digit = n%10;
        reverse= reverse*10+digit;
        return isPalindrome(n/10,org,reverse);
    }

    static int palindrome(int n){
        return palindrome(n,0);
    }
    // helper function
    static int palindrome(int n,int reverse){
        if(n==0){
            return reverse;
        }

        return palindrome(n/10,reverse*10+n%10);
    }
    public static void main(String[] args) {
        int n = 111;
        boolean result = isPalindrome(151, 151, 0);
        System.out.println(result?"Palindrome":"Not Palindrome");
        System.out.println(n==palindrome(n)?"Palindrome":"Not");
        
    }
}
