public class TableRecursion {

    static void printTable(int n,int i){
        if(i==0){
            return;
        }
        printTable(n, i-1);
        System.out.println(n+" X "+i+" = "+n*i);
    }
    static String printTable2(int n,int i){
        if(i==11){
            return "";
        }
        String result = printTable2(n, i+1);
         return n+" X "+i+" = "+(n*i)+"\n"+result;
    }
    public static void main(String[] args) {
        printTable(5, 10);
        String r = printTable2(5,1);
        System.out.println(r);
        
    }
}
