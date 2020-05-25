import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MouseTrap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] a = {4,-4,2}; //-4 2 4
        int[] b = {4,0,5}; //  0 4 5
        System.out.println(lastMouse(a,b));

    }
    static int lastMouse(int[] a, int[] b){
        Arrays.sort(a);
        Arrays.sort(b);
        int n = a.length;
        int max =0;
       for (int i=0; i<n; i++){
           int abs = Math.abs(a[i]-b[i]);
           if(abs >max)
               max =abs;
       }
       return max;
    }

}
