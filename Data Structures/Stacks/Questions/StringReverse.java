import java.util.Stack;

//AMAZON MICROSOFT ADOBE PAYTM
public class StringReverse {
    public static String stringReverse(String str) {
        Stack<Character> s = new Stack<>();
        for (int idx = 0; idx < str.length(); idx++) {
            s.push(str.charAt(idx));
        }

        StringBuilder result = new StringBuilder();
        while (!s.isEmpty()) {
            char curr = s.pop();
            result.append(curr);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String s = stringReverse("abcd");
        System.out.println(s);
    }
}
