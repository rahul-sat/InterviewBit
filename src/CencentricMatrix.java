import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CencentricMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        concentricMatrix(n);


    }

    public static void concentricMatrix(int n) {
        int arraySize = n * 2 - 1;
        int[][] result = new int[arraySize][arraySize];

        //Fill the values
        for (int i = 0; i < arraySize; i++) {
            for (int j = 0; j < arraySize; j++) {

                result[i][j] = Math.max(Math.abs(i - arraySize / 2),
                        Math.abs(j - arraySize / 2)) + 1;
            }
        }

        //Print the array
        for (int i = 0; i < arraySize; i++) {
            for (int j = 0; j < arraySize; j++) {
                System.out.print(result[i][j]);
            }
            System.out.println();
        }
    }
    public static void hackerCode() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] inputs=br.readLine().split(" ");
        int R=Integer.valueOf(inputs[0]);
        int C=Integer.valueOf(inputs[1]);
        int ci=Integer.valueOf(inputs[2]);
        int cj=Integer.valueOf(inputs[3]);
        StringBuilder a=new StringBuilder();
        for(int i=0;i<R;i++){
            for(int j=0;j<C;j++){
                a.append(Math.max(Math.abs((ci-i)),Math.abs((cj-j)))+" ");
            }
            a.append("\n");
        }
        System.out.println(a);
    }
}
