class Solution {
public  boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
        for (int i=0;i<s.length();i++){
            if (stack.isEmpty()){
                if (s.charAt(i)=='}'||s.charAt(i)==')'||s.charAt(i)==']') return false;
            }else{
                if ((stack.peek()=='{'&&s.charAt(i)=='}')){
                    stack.pop();
                    continue;
                }
                if ((stack.peek()=='['&&s.charAt(i)==']')) {
                    stack.pop();
                    continue;
                }
                if ((stack.peek()=='('&&s.charAt(i)==')')) {
                    stack.pop();
                    continue;
                } 
            }
            stack.push(s.charAt(i));
        }
        return stack.isEmpty();
    }
}
