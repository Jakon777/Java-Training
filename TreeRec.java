public class TreeRec {
    static void tree(int n){
        if(n<=0){
            return;
        }
        System.out.println("n-1 "+n);
        tree(n-1);
        System.out.println("n-2 "+n);
        tree(n-2);
        System.out.println("n-3 "+n);
        tree(n-3);
        System.out.println("all BT  "+n);
    }
    public static void main(String[] args) {
        tree(5);
    }
}
