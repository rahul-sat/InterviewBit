public class MSort {
    public static void main(String[] args) {

    }
    public static void mergeSort(int[] A, int p, int r){
        int q = 0;
        if(p < r) {
            q =(p+r)/2;
            mergeSort(A, p, q);
            mergeSort(A, q+1, r);
            merge(A, p, q, r);
        }

    }
    public static void merge(int[] A, int p, int q, int r){

    }
}
