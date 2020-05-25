public class Kangaroo {
    public static void main(String[] args) {
        System.out.println(kangaroo(0, 3 ,4, 2));
    }
    static String kangaroo(int x1, int v1, int x2, int v2) {
        if (v1 > v2){
            int rem = (x1-x2) % (v2 -v1);
            if (rem == 0){
                return "YES";
            }
        }
        return "NO";
    }

}
