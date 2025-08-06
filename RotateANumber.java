public class RotateANumber {
    public static void main(String[] args) {
        int n = 12346;
        int num = n;
        int k =-2; //initialize the rotation value
        int count = 0;
        while(num!=0){  //count the number of digits in a number 
            count++;
            num/=10;
        }


        k = k%count;   //if k > digits of the number then find the module of k

        if(k<0){
            k+=count; // converts negative rotations to equivalent positive rotation
        }


        int dig = 1;
        int digit = (int)Math.pow(10, k);    // it will find the number of digits that should be moved from last to first
        int div = n/digit;         // it will find that part of number that should be rotated to the right
        int div2 = div;
        int rem = n%digit;
        while(div!=0){      //find the place where the right part must moved to left 
            dig*=10;
            div/=10;
        }
        n = rem*dig + div2;    
        System.out.println(n);

        
        
    }
}

// efficient code is written below: ====>

// public class RotateANumber {
// public static void main(String[] args) {
// int n = 12346;
// int k = -2;  // rotation count (can be negative)

// int temp = n;
// int count = 0;

// // Count digits
// while (temp != 0) {
//     temp /= 10;
//     count++;
// }

// // Normalize k to within digit range
// k = ((k % count) + count) % count;

// // Compute power only once
// int pow = (int) Math.pow(10, k);

// // Split number into two parts
// int rem = n % pow;
// int div = n / pow;

// // Multiply remainder with 10^(count - k)
// int multiplier = (int) Math.pow(10, count - k);

// int rotated = rem * multiplier + div;

// System.out.println(rotated);
// }
// }

