import java.util.Arrays;
import java.util.Scanner;

public class TwoStrings {
     static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
       int test = scanner.nextInt();
       for (int i=0; i<test; i++){
          String str = scanner.next();
          String str1 = scanner.next();
          char[] chars = str.toCharArray();
          char[] ch = str1.toCharArray();
          Arrays.sort(chars);
          Arrays.sort(ch);
           System.out.println( Arrays.equals(chars,ch) ? "YES" : "NO");

       }

    }

}
