public class Pattern {


        // * 
        // * *
        // * * *
        // * * * *
        // * * * * *
    static void pattern1() {
        for(int i=0;i<5;i++){            //for i = 1 to n
            for(int j = 0;j<=i;j++){     //for j = 1 to i    
                System.out.print("* ");
            }
            System.out.println();
        }

    }


            //      *
            //     **
            //    ***
            //   ****
            //  *****    
    static void pattern2() {
        for(int i = 1;i<6;i++){                     //for i = 1 to n
            System.out.print(" ".repeat(6-i));      //for j = 1 to n-i
            // for(int j =0;j<5-i;j++){
            //     System.out.print(" ");
            // }

            System.out.print("*".repeat(i));        //for j = 1 to i
            // for(int j = 0;j<=i;j++){
            //     System.out.print("*");
            // }
            System.out.println();
        }

    }

            // * * * * *
            // * * * *
            // * * *
            // * *
            // *
    static void pattern3() {
        for(int i =5;i>0;i--){              //for i = n to 1
            for(int j=0;j<i;j++){           //for j = 1 to i
                System.out.print("* ");
            }
            System.out.println();
        }
    }




        // *****
        //  ****
        //   ***
        //    **
        //     *
    static void pattern4() {
        for(int i = 5;i>0;i--){             //for i = 5 to 1
            for(int j =0;j<5-i;j++){        //for j = 1 to n-i
                System.out.print(" ");  
            }
            for(int j = 0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }


            // *
            // ***
            // *****
            // ***
            // *    
    static void pattern5() {
        for(int i = 1;i<=3;i++){                //for i = 1 to n
            for(int j =1;j<=(2*i-1);j++){       //for j = 1 to 2i-1
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = 2;i>=1;i--){                //for i = n-1 to 1
            for(int j =1;j<=(2*i-1);j++){       //for j = 1 to 2i-1
                System.out.print("*");
            }
            System.out.println();
        }
    }



        // *****
        // *   *
        // *   *
        // *   *
        // *****
    static void pattern6(){
        for(int i = 0;i<5;i++){                         //for i = 1 to n
            for(int j = 0;j<5;j++){                     //for j = 1 to n
                if(i==0 || i == 4 || j==0 ||j==4){      //if i,j == 1 or n
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }


        //       *
        //      * *
        //     * * *
        //    * * * *
        //   * * * * *
    static void pattern7(){
        for(int i = 0;i<5;i++){                 //for i = 1 to n
            for(int j =0;j<5-i;j++){            //for j = 1 to n-i
                System.out.print(" ");
            }
            for(int j = 0;j<=i;j++){            //for j = 1 to i
                System.out.print(" *");
            }
            System.out.println();
        }
    }



        //    *
        //   ***
        //  *****
        // *******
    static void pattern8(){
        for(int i = 1;i<=4;i++){            //for i = 1 to n
            for(int j = 1;j<=4-i; j++){     //for j = 1 to n-i
                System.out.print(" ");
            }
            for(int j =1;j<=2*i-1;j++){     //for j = 1 to 2i-1
                System.out.print("*");
            }
            System.out.println();
        }
    }

        // *********
        //  *******
        //   *****
        //    ***
        //     *
    static void pattern9(){
        for(int i = 5;i>=1;i--){            //for i= n to 1
            for(int j = 1;j<=5-i; j++){     //for j = 1 to n-i
                System.out.print(" ");
            }
            for(int j =1;j<=2*i-1;j++){     //for j = 1 to 2i-1
                System.out.print("*");
            }
            System.out.println();
        }
    }

        //    *
        //   ***
        //  *****
        // *******
        //  *****
        //   ***
        //    *
    static void pattern10(){
        for(int i = 1;i<=4;i++){            //for i = 1 to n
            for(int j = 1;j<=4-i; j++){      // for j = 1 to n-i
                System.out.print(" ");
            }
            for(int j =1;j<=2*i-1;j++){     //for j = 1 to 2i-1
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = 3;i>=1;i--){            //for i = n-1 to 1
            for(int j = 1;j<=4-i; j++){     //for j = 1 to n-i
                System.out.print(" ");
            }
            for(int j =1;j<=2*i-1;j++){     //for j = 1 to 2i-1
                System.out.print("*");
            }
            System.out.println();
        }
    }

    
            // *** 
            // **   
            // *     
                
            // *     
            // **   
            // *** 
    static void pattern11(){
        for(int i = 1;i<=4;i++){            //for i = 1 to 4
            for(int j = 1;j<=4-i; j++){     //for j = 1 to 4
                System.out.print("*");
            }
            for(int j =1;j<=2*i-1;j++){     //for j =1 to 2i-1  
                System.out.print(" ");
            }
            System.out.println();
        }
        for(int i = 3;i>=1;i--){            //for i = n-1 to 1
            for(int j = 1;j<=4-i; j++){     //for j = 1 to 4
                System.out.print("*");
            }
            for(int j =1;j<=2*i-1;j++){     //for j =1 to 2i-1
                System.out.print(" ");
            }
            System.out.println();
        }
    }


        // **********
        // ****  ****
        // ***    ***
        // **      **
        // *        *
     static void pattern12() {
        for(int i =5;i>0;i--){              //for i = n to 1
            for(int j=0;j<i;j++){           //for j = 1 to i
                System.out.print("*");
            }
            for(int j =0;j<10-(2*i);j++){   //for j = 1 to 2n-2i
                System.out.print(" ");
            }
            for(int j = 0;j<i;j++){         //for j = 1 to i
                System.out.print("*");
            }
            System.out.println();
        }
    }   



        // *        *
        // **      **
        // ***    ***
        // ****  ****
        // **********
    static void pattern13(){
        for(int i = 1;i<=5;i++){            //for i = 1 to n
            for(int j = 1;j<=i;j++){        //for j = 1 to i
                System.out.print("*");
            }
            for(int j =1;j<=10-(2*i);j++){  //for j = 1 to 2n-2i
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){          //for j = 1 to i
                System.out.print("*");
            }
            System.out.println();
        }
    }


        // **********
        // ****  ****
        // ***    ***
        // **      **
        // *        *
        // *        *
        // **      **
        // ***    ***
        // ****  ****
        // **********
    static void pattern14(){
        for(int i =5;i>0;i--){                  //for i = n to 1
            for(int j=0;j<i;j++){               //for j = 1 to i
                System.out.print("*");
            }
            for(int j =0;j<10-(2*i);j++){       //for j = 1 to 2n-2i
                System.out.print(" ");
            }
            for(int j = 0;j<i;j++){             //for j = 1 to i
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = 1;i<=5;i++){                //for i = 1 to n
            for(int j = 1;j<=i;j++){            //for j = 1 to i
                System.out.print("*");
            }
            for(int j =1;j<=10-(2*i);j++){      //for j = 1 to 2n-2i
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){              //for j = 1 to i
                System.out.print("*");
            }
            System.out.println();
        }
        
    }


        //     *****
        //    *****
        //   *****
        //  *****
        // *****
    static void pattern15(){
        for(int i = 1;i<=5;i++){                //for i = 1 to n
            System.out.print(" ".repeat(5-i));  //for j = 1 to n-i
            System.out.print("*".repeat(i));    //for j = 1 to i
            System.out.print("*".repeat(5-i));  //for j = 1 to n-i
            System.out.println();
        }
    }


        //     *****
        //    *   *
        //   *   *
        //  *   *
        // *****
    static void pattern16(){
        for(int i = 1;i<=5;i++){                            //for i = 1 to n
            System.out.print(" ".repeat(5-i));              //for j = 1 to n-i
            if(i==1 || i==5){
                System.out.print("*".repeat(5));      //for j = 1 to n
            }
            else{
                System.out.print("*");
                System.out.print(" ".repeat(3));      //for j = 1 to n-2   
                System.out.print("*");
            }
            System.out.println();
        }
    }


        // *
        // **
        // * *
        // *  *
        // *****
    static void pattern17(){
        for(int i = 1;  i<=5;i++){              //for i = 1 to n
            for(int j =1; j<=i;j++){            //for j = 1 to i
                if(j==1 || j==i || i==5){
                    System.out.print("*");
                }
                else
                System.out.print(" ");
            }
            System.out.println();
        }
    }



        //     *
        //    * *
        //   *   *
        //  *     *
        // *********
    static void pattern18(){
        for(int i = 1;i<=5;i++){                    //for i = 1 to n
            for(int j = 1;j<=5-i; j++){             //for j = 1 to n-i
                System.out.print(" ");
            }
            for(int j =1;j<=2*i-1;j++){             //for j = 1 to 2i-1
                if(j==1 || j==2*i-1 || i == 5)      //if j ==1 or 2i-1 or i == n
                System.out.print("*");
                else
                System.out.print(" ");
            }
            System.out.println();
        }
    }


        //   *****     *****
        //  *******   *******
        // ********* *********
        // *******************
        //  *****************
        //   ***************
        //    *************
        //     ***********
        //      *********
        //       *******
        //        *****
        //         ***
        //          *
    static void pattern19(){
        int n =20;

        for(int i = n/2;i<=n;i+=2){                // for(int i = 3;i>=1;i--){
            for(int j = 1;j<n-i;j+=2){             //     for(int j = 1;j<i;j++){
                System.out.print(" ");        //         System.out.print(" ");
            }
            for(int j = 1;j<=i;j++){    //     for(int j = 1;j<=9-(2*i-2);j++){   
                System.out.print("*");        //         System.out.print("*");
            }
            for(int j = 1;j<=n-i;j++){        //     for(int j = 1;j<=2*i-1;j++){
                System.out.print(" ");        //         System.out.print(" ");
            }
            for(int j = 1;j<=i;j++){    //     for(int j = 1;j<=9-(2*i-2);j++){
                System.out.print("*");        //         System.out.print("*");
            }
            System.out.println();
        }
        

        for(int i =n ;i>=1;i--){                //  for(int i = 10;i>=1;i--){
            for(int j = 1;j<=n-i; j++){         //         for(int j = 1;j<=10-i; j++){
                System.out.print(" ");        //             System.out.print(" ");
            }                                    
            for(int j =1;j<=2*i-1;j++){         //         for(int j =1;j<=2*i-1;j++){
                System.out.print("*");        //             System.out.print("*");
            }                                    
            System.out.println();               //         System.out.println();
            }                                       
        }               
        
        

        // *****
        //   ****
        //     ***
        //       **
        //         *
        //       **
        //     ***
        //   ****
        // *****
        static void pattern20(){
            for(int i =5;i>=1;i--){                         //for i = n to 1
                for(int j = 1;j<=2*(5-i);j++){              //for j = 1 to 2(n-i)
                    System.out.print(" ");
                }
                for(int j = 1;j<=i;j++){                    //for j = 1 to i
                    System.out.print("*");
                }
                System.out.println();
            }
            for(int i = 2;i<=5;i++){                        //for i = 2 to n
                for(int j = 1;j<=2*(5-i);j++){              //for j = 1 to 2(n-i)
                    System.out.print(" ");
                }
                for(int j =1;j<=i;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }


        // *       *
        //  *     *
        //   *   *
        //    * *
        //     *
        //    * *
        //   *   *
        //  *     *
        // *       *
        static void pattern21(){
            for(int i = 5;i>=1;i--){               // i=n to i>=1
                for(int j = 1;j<=5-i;j++){         // j=1 to j<=n-i
                    System.out.print(" ");
                }
                for(int j =1;j<=2*i-1;j++){
                    if(j==1 || j==2*i-1)
                    System.out.print("*");
                    else
                    System.out.print(" ");
                }
                System.out.println();
            }
            for(int i = 1;i<=4;i++){            //i=1 to i<=n-1
                for(int j =1; j<=4-i;j++){      //j=1 to j<=n-1-i
                    System.out.print(" ");                
                }
                for(int j = 1;j<=2*i+1;j++){
                    if(j==1 || j==2*i+1){
                        System.out.print("*");
                    }
                    else
                    System.out.print(" ");
                }
                System.out.println();
                }
        }


        //  *** 
        // *   *
        // *   *
        // *   *
        //  ***
        // *   *
        // *   *
        // *   *
        //  ***
    static void pattern22(){
        for(int i =1; i<=5;i++){              //for i = 1 to i <= n
            for(int j =1; j<=5;j++){           //for j = 1 to j<=n
                if(i==1||i==5||j==1||j==5){
                    if(j+i == 2 || j+i == 6 ||j+i ==10)     //if i+j==2 or n+1 or 2n
                    System.out.print(" ");
                    else
                    System.out.print("*");
                }
                else
                System.out.print(" ");
            }
            System.out.println();
        }
        for(int i = 1;i<5;i++){                 //for i = 1 to n
                for(int j = 1;j<=5;j++){         //for j = 1 to n
                    if(i == 4 || j==1 ||j==5){
                        if(j+i==5 || j+i==9)        // if i+j == n+1 or 2n+1
                        System.out.print(" ");
                        else
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
    }



    public static void main(String[] args) {
        // pattern1();
        // System.out.println();

        // pattern2();
        // System.out.println();
        
        // pattern3();
        // System.out.println();

        // pattern4();
        // System.out.println();

        // pattern5();
        // System.out.println();

        // pattern6();
        // System.out.println();

        // pattern7();
        // System.out.println();

        // pattern8();
        // System.out.println();

        // pattern9();
        // System.out.println();

        // pattern10();
        // System.out.println();

        // pattern11();
        // System.out.println();

        // pattern12();
        // System.out.println();

        // pattern13();
        // System.out.println();

        // pattern14();
        // System.out.println();

        // pattern15();
        // System.out.println();      
        
        // pattern16();
        // System.out.println();

        // pattern17();
        // System.out.println();

        // pattern18();
        // System.out.println();
        
        // pattern19();
        // System.out.println();

        // pattern20();
        // System.out.println();

        // pattern21();
        // System.out.println();
    
        // pattern22();
        // System.out.println();


    }
}
