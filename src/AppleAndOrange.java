import java.util.Arrays;

public class AppleAndOrange {
    public static void main(String[] args) {
       int s =7, t= 10;
       int a =4, b =12;
       // 3 2
        int[] ar = {2, 3, -4};
        int[] arr = {3,-2, -4};
        countApplesAndOranges(s,t,a,b,ar,arr);
    }
    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
     int count1= Math.toIntExact(Arrays.stream(apples)
             .filter(x -> x + a >= s && x + a <= t)
             .count());
        System.out.println(count1);

       int count2= Math.toIntExact(Arrays.stream(oranges)
               .filter(x -> x + b >= s && x + b <= t)
               .count());
        System.out.println(count2);
    }
}
