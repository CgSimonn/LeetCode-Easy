import java.util.Stack;

class main_20 {
    public static boolean isValid(String s) {
        Stack<Character> sta = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                sta.push(c);
            } else if (sta.empty() || !isMatch(sta.pop(), c))
                return false;
        }

        return sta.empty();
    }

    public static boolean isMatch(char l, char r) {
        return l == '(' && r == ')' || l == '[' && r == ']' || l == '{' && r == '}';
    }

    public static void main(String[] args) {
        String s = "()";
        boolean res = isValid(s);
        System.out.println(res);
    }
}
