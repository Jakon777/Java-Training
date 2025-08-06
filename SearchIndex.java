public class SearchIndex {
    static int search(int a[],int index, int val){
        if(index==a.length){
            return -1;
        }
        if(a[index]==val){
            return index;
        }
        return search(a, index+1, val);
    }

    public static void main(String[] args) {
        int a[] = {90,100,30,88,555,100};
        int val = 88;
        int index = search(a, 0,val);
        System.out.println(index>=0?"Found":"Not Found");
        System.out.println(index);
        
    }
}
