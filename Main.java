import java.util.Stack;

class Solution {
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

    /*
        Пример ввода: 1 2 1 2 -1 1 3 1 3 -1 0
        Логика расчета:
        2 -1 переход -> 2 в сумму
        3 -1 переход -> 3 в сумму
        Пример вывода: 5
    */
    public Integer Sum(Integer[] arr) {
        Integer res = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                res += arr[i - 1];
            }
        }
        return res;
    }
}

public class Main {
    public static void main(String[] args) {

        String s = "  hello world  ";

        var sol = new Solution();
        var reversed = sol.reverseWords(s);

        System.out.println(reversed);

        Integer[] arr = {1, 2, 1, 2, -1, 1, 3, 1, 3, -1, 0};
        System.out.println(
                sol.Sum(arr)
        );
    }
}