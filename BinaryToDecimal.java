public class BinaryToDecimal {
    static int increment = 0;
    static void binaryToDecimal(int binary,int sum,int length){
        if(length==0){
            System.out.println(sum);
            return;
        }
        int rem = binary%10;
        sum = (int)(sum + rem*(Math.pow(2,increment)));
        binary/=10;
        increment++;
        length--;
        binaryToDecimal(binary, sum, length);
    }

    public static void main(String[] args) {
        int binary = 10001100;
        int n = binary;
        int length = 0;
        while(binary!=0){
            length++;
            binary/=10;
        }
        binaryToDecimal(n, 0, length);


    }   
}
