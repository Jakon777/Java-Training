public class NumberPattern {


        // 11111
        // 11111
        // 11111
        // 11111
        // 11111
    static void pattern1(){
        int n = 5;
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=n;j++){
                System.out.print(1);
            }
            System.out.println();
        }
    }

        // 11111
        // 00000
        // 11111
        // 00000
        // 11111
    static void pattern2(){
        int n = 5;
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=n;j++){
                System.out.print(i%2==0?0:1);
            }
            System.out.println();
        }
    }


        // 01010
        // 01010
        // 01010
        // 01010
        // 01010
    static void pattern3(){
        int n = 5;
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=n;j++){
                System.out.print(j%2==0?1:0);
            }
            System.out.println();
        }
    }

        // 11111
        // 10001
        // 10001
        // 10001
        // 11111
    static void pattern4(){
        int n = 5;
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=n;j++){
                if(j==1||j==n||i==1||i==n)
                System.out.print(1);
                else
                System.out.print(0);
            }
            System.out.println();
        }
    }



        // 10101
        // 10101
        // 10101
        // 10101
        // 10101
    static void pattern5(){
        int n = 5;
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=n;j++){
                System.out.print(j%2==0?0:1);
            }
            System.out.println();
        }
    }


        // 1  2  3  4  5  
        // 6  7  8  9  10
        // 11 12 13 14 15
        // 16 17 18 19 20
        // 21 22 23 24 25
    static void pattern6(){
        int n = 5;
        int count = 1;
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=n;j++){
                if(count<10)
                System.out.print(count+"  ");
                else
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
    }

        // 11111
        // 22222
        // 33333
        // 44444
        // 55555
    static void pattern7(){
        int n = 5;
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=n;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }


        // 12345
        // 12345
        // 12345
        // 12345
        // 12345
    static void pattern8(){
        int n = 5;
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=n;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }


        // 12345
        // 23456
        // 34567
        // 45678
        // 56789
    static void pattern9(){
        int n = 5;
        for(int i = 0;i<=n-1;i++){
            for(int j = 1;j<=n;j++){
                System.out.print(i+j);
            }
            System.out.println();
        }
    }


        // 55555
        // 54444
        // 54333
        // 54322
        // 54321
    static void pattern10(){
        int n = 5;
        for(int i = n;i>=1;i--){
            for(int j = n;j>=1;j--){
                if(i==j || i>j)
                System.out.print(i);
                else
                System.out.print(j);
            }
            System.out.println();
        }
    }


        //     1
        //    22
        //   333
        //  4444
        // 55555
    static void pattern11(){
        for(int i = 1; i<=5;i++){           //for i = 1 to n
           for(int j = 1;j<=5-i;j++){       //for j = 1 to n-i
            System.out.print(" ");
           }
           for(int j = 1;j<=i;j++){
            System.out.print(i);
           }
           System.out.println();
        }           
    }

        // 55555
        // 4444
        // 333
        // 22
        // 1
    static void pattern12(){
        for(int i = 5;i>=1;i--){        //for i = n to 1
            for(int j =1 ;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }

    
        // 1
        // 22
        // 333
        // 4444
        // 55555
    static void pattern13(){
        for(int i = 1;i<=5;i++){        //for i = 1 to n
            for(int j =1 ;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }


        // 11111
        // 2222
        // 333
        // 44
        // 5
    static void pattern14(){
        for(int i = 1;i<=5;i++){        //for i = 1 to n
            for(int j =5 ;j>=i;j--){    //for j = n to i
                System.out.print(i);
            }
            System.out.println();
        }
    }

            // 5
            // 44
            // 333
            // 2222
            // 11111
    static void pattern15(){
        for(int i = 5;i>=1;i--){        //for i = n to 1
            for(int j =0 ;j<=5-i;j++){    //for j = 0 to n-i
                System.out.print(i);
            }
            System.out.println();
        }
    }

        // 1
        // 12
        // 123
        // 1234
        // 12345
    static void pattern16(){
        for(int i = 1;i<=5;i++){        //for i = 1 to n
            for(int j =1 ;j<=i;j++){    //for j = 1 to i
                System.out.print(j);
            }
            System.out.println();
        }
    }



        // 12345
        // 1234
        // 123
        // 12
        // 1    
    static void pattern17(){
        for(int i = 5;i>=1;i--){        //for i = n to 1
            for(int j =1 ;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

        // 1
        // 21
        // 321
        // 4321
        // 54321
    static void pattern18(){
        for(int i = 1;i<=5;i++){        //for i = 1 to n
            for(int j =i;j>=1;j--){    //for j = i to 1
               System.out.print(j);
            }
            System.out.println();
        }
    }


        // 54321
        // 4321
        // 321
        // 21
        // 1
    static void pattern19(){
        for(int i = 5;i>=1;i--){        //for i = n to 1
            for(int j =i;j>=1;j--){    //for j = i to 1
                System.out.print(j);
            }
            System.out.println();
        }
    }


        // 5
        // 54
        // 543
        // 5432
        // 54321
    static void pattern20(){
        for(int i = 0;i<5;i++){        //for i = 0 to n-1
            for(int j =5;j>=5-i;j--){    //for j = n to n-i
                System.out.print(j);
            }
            System.out.println();
        }
    }

        // 12345
        // 2345
        // 345
        // 45
        // 5
    static void pattern21(){
        for(int i = 1;i<=5;i++){        //for i = 1 to n
            for(int j =i;j<=5;j++){    //for j = i to n
                System.out.print(j);
            }
            System.out.println();
        }
    }


        // 1
        // 23
        // 345
        // 4567
        // 56789
    static void pattern22(){
        for(int i = 1;i<=5;i++){        //for i = 1 to n
            int count =0;
            for(int j =1;j<=i;j++){    //for j = 1 to i
                System.out.print(i+count);
                count++;
            }
            System.out.println();
        }
    }


        // 56789
        // 4567
        // 345
        // 23
        // 1
    static void pattern23(){
        for(int i = 5;i>=1;i--){        //for i = n to 1
            int count =0;
            for(int j =1;j<=i;j++){    //for j = 1 to i
                System.out.print(i+count);
                count++;
            }
            System.out.println();
        }
    }



        // 1
        // 11
        // 101
        // 1001
        // 11111
    static void pattern24(){
        for(int i = 1;i<=5;i++){        //for i = 1 to n
            for(int j =1;j<=i;j++){    //for j = 1 to i
                if(i==5 ||j==1 || j==i)    //if i = n or j = 1 or i
                System.out.print(1);
                else
                System.out.print(0);
            }
            System.out.println();
        }
    }


        // 1
        // 24
        // 135
        // 2468
        // 13579
    static void pattern25(){
        for(int i = 1;i<=5;i++){        //for i = 1 to n
            int count = 0;
            for(int j =1;j<=i;j++){    //for j = 1 to i
                if(i%2!=0)
                System.out.print(j+count);
                else
                System.out.print(2+2*count);
                count++;
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        // pattern1();
        // pattern2();
        // pattern3();
        // pattern4();
        // pattern5();
        // pattern6();
        // pattern7();
        // pattern8();
        // pattern9();
        // pattern10();
        // pattern11();
        // pattern12();
        // pattern13();
        // pattern14();
        // pattern15();
        // pattern16();
        // pattern17();
        // pattern18();
        // pattern19();
        // pattern20();
        // pattern21();
        // pattern22();
        // pattern23();
        // pattern24();
        // pattern25();
    }
}
