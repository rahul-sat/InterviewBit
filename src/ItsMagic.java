import java.util.ArrayList;
import java.util.Scanner;

public class ItsMagic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int num = scanner.nextInt();
        for(int i=0; i<num; i++){
            list.add(scanner.nextInt());
        }
        System.out.println(magicIndex(list));

    }
    static int magicIndex(ArrayList<Integer> list){
        int min = Integer.MAX_VALUE;
        for(int i=0; i<list.size(); i++){
            if(list.get(i)%7==0) {
                if (list.get(i) < min) {
                    min = list.get(i);
                }
            }
            return list.indexOf(list.contains(min));
        }
        return -1;
    }
}
