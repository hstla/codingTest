class Solution {
       static public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '(' || arr[i] == '[' || arr[i] == '{') {
                stack.push(arr[i]);
            } else if (arr[i] == ')') {
                if (stack.size() == 0 || stack.pop() != '(' ) {
                    return false;
                }
            } else if (arr[i] == ']') {
                if (stack.size() == 0 || stack.pop() != '[') {
                    return false;
                }
            } else if (arr[i] == '}') {
                if (stack.size() == 0 || stack.pop() != '{') {
                    return false;
                }
            }
        }
        if (stack.size() != 0) {
            return false;
        }
        return true;
    }
}