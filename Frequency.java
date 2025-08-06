public class Frequency {   //hashing is the main point whenever the question is about frequency
    public static void main(String[] args) {
        int n = 77722102;
        int hash[] = new int[10];
        System.out.println("number "+n);
        while(n!=0){
            int digit = n%10;
            hash[digit]++;
            n/=10;
        }
        for(int i = 0;i<hash.length;i++){
            System.out.println(i+" "+hash[i]);
        }
    }
    
}
