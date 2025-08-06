public class NumberOccurrence {
    static int countOccurrence(int a[],int index, int val){
        if(index==a.length){
            return 0;
        }
        int occurrence = countOccurrence(a, index+1, val);
        if(a[index]==val){
            occurrence++;
        }
        return occurrence;
    }

    public static void main(String[] args) {
        int a[] = {90,100,30,88,555,88,100};
        int val = 88;
        int occurrence = countOccurrence(a, 0,val);
        System.out.println(occurrence);
        
    }
}
