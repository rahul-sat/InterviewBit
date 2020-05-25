
import java.util.*;

public class BirthdayCandle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];
        for (int i=0; i<size; i++){
            array[i] = sc.nextInt();
        }
        //System.out.println(birthdayCakeCandles(array));
      //  System.out.println(another(array));
      //  System.out.println(anotherSol(array));
        System.out.println(youTubeSol(array));
    }
    public static int birthdayCakeCandles(int[] array){
        int count=0;
        List<Integer> list = new ArrayList<>();
        for (int i : array) {
            list.add(i);
        }
        Collections.sort(list,Collections.reverseOrder());
        int i = list.get(0);
        for (int j =0; j<list.size()-1; j++){
            if (Objects.equals(list.get(j), i)) {
                count++;
            }
        }
      return count;
    }

    public static int another(int[] ar){
        Arrays.sort(ar);
        int result = 1;
        int decriment = 2;
        while((decriment <= ar.length) && (ar[ar.length-1] == ar[ar.length-decriment])){
            result++;
            decriment++;
        }
        return result;
    }
    public static int anotherSol(int[] ar){
        int max = Arrays.stream(ar).max().getAsInt();
        int count = 0;
        for (int i : ar) {
            if (max == i)
                count++;
        }
        return count;
    }
    public static int youTubeSol(int[] ar){
        int maxHeight = Integer.MIN_VALUE;
        int maxCandelFreq = 0;
        for (int i=0; i<ar.length-1; i++) {
            if (ar[i] == maxHeight) {
                maxCandelFreq++;
            }

            if (ar[i] > maxHeight) {
                maxHeight = ar[i];
                maxCandelFreq = 1;
            }
        }
        return maxCandelFreq;
    }
}
