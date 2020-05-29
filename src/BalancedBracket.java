import java.util.Scanner;
import java.util.Stack;

public class BalancedBracket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(isBalanced(s));
        System.out.println(balancedString(s));
    }
    static boolean isBalanced(String s){
        Stack<Character> stack = new Stack<>();
        for (int i=0; i<s.length(); i++){
            if (s.charAt(i)=='{' || s.charAt(i)=='['|| s.charAt(i)=='('){
                stack.push(s.charAt(i));
            }else {
                if (stack.isEmpty()){
                    return false;
                }else {
                    char c = stack.pop();
                    if (s.charAt(i)=='{'&& c=='}')
                        return true;
                    if (s.charAt(i)=='['&& c==']')
                        return true;
                    if (s.charAt(i)=='('&& c==')')
                        return true;
                }

            }
        }
        if (stack.isEmpty()){
            return true;
        }else
            return false;
    }
    //another way
    private static boolean balancedString(String string){
        while(string.length() != (string = string.replaceAll("\\(\\)|\\[\\]|\\{\\}", "")).length());
        return (string.isEmpty());
    }
}
