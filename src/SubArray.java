import java.util.Scanner;

public class SubArray {
    public static void main(String[] args) {
        int[] arr = {-2,3,2,-1};
        System.out.println(getMaxSum(arr));
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ar =new int[n];
        int res= 0;
        for (int i=0; i<n; i++){
            ar[i]=sc.nextInt();
            int s =ar[i];
            if (s < 0)
                res++;
            for (int j=i-1; j>=0; j--){
                s+=ar[j];
                if (s<0)
                    res++;
            }
        }
        System.out.println(res);

    }
    static int getMaxSum(int[] a){  // Kadane's Alogorithm
        int maxCount, maxGlobal;
        maxCount = maxGlobal=a[0];
        for (int i=0; i<a.length-1; i++){
            maxCount = Math.max(a[i],maxCount+a[i]);
            maxGlobal = Math.max(maxCount,maxGlobal);
        }
        return maxGlobal;
    }

}
