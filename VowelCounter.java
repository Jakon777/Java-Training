public class VowelCounter {
    public static void main(String[] args) {
        String str = "Hello, how are you".toLowerCase();
        int hash[] = new int[5]; //for vowels: a,e,i,o,u

        // for(int i = 0;i<str.length();i++){
        //     if(str.charAt(i)=='a'){
        //         hash[0]++;
        //     }
        //     else if(str.charAt(i)=='e'){
        //         hash[1]++;
        //     }
        //     else if(str.charAt(i)=='i'){
        //         hash[2]++;
        //     }
        //     else if(str.charAt(i)=='o'){
        //         hash[3]++;
        //     }
        //     else if(str.charAt(i)=='u'){
        //         hash[4]++;
        //     }
        // }
        
        for (char ch : str.toCharArray()) {
            switch (ch) {
                case 'a' -> hash[0]++;
                case 'e' -> hash[1]++;
                case 'i' -> hash[2]++;
                case 'o' -> hash[3]++;
                case 'u' -> hash[4]++;
            }
        }

        System.out.println("a : "+hash[0]);
        System.out.println("e : "+hash[1]);
        System.out.println("i : "+hash[2]);
        System.out.println("o : "+hash[3]);
        System.out.println("u : "+hash[4]);
    }
}
