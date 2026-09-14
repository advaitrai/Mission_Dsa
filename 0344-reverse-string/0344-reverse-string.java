class Solution {
    public void reverseString(char[] s) {

        Stack<Character> stack = new Stack<>();

        int i = 0;

        while (i < s.length) {
            stack.push(s[i]);
            i++;
        }

        i = 0;

        while (!stack.isEmpty()) {
            s[i] = stack.pop();
            i++;
        }
    }
}