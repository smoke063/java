import java.util.Stack;

public class ReverseWords {
    public String reverseWords(String str) {
        var stack = new Stack<Character>();
        var arr = str.trim().toCharArray();
        for (char s : arr) {
            stack.push(s);
        }
        String reversedWord = "";
        while (stack.isEmpty() == false) {
            reversedWord += stack.pop();
        }

        return reversedWord;
    }
}
