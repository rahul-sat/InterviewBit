import java.util.Arrays;
import java.util.Scanner;

public class TwoStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string1 = "sumit";//scanner.nextLine();
        char[] str1 = string1.toCharArray();
        String string2 = "mitsu";//scanner.nextLine();
        char[] str2 = string2.toCharArray();
        Arrays.sort(str1);
        Arrays.sort(str2);
        System.out.println(str1.equals(str2) ? "YES": "NO");
       }
    }

