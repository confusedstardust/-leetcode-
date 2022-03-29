class Solution {

    public  int[] plusOne(int[] digits) {
                Stack stack=new Stack();
        for (int i=0;i<digits.length;i++){
            stack.push(digits[i]);
        }
                stack=pls(stack);
        int[] aa=new int[stack.size()];
        int i=0;
        while (!stack.isEmpty()){
            aa[aa.length-(i++)-1]= (int) stack.pop();
        }
        return aa;
    }
public   Stack pls(Stack stack){
        if (stack.isEmpty()){
            stack.push(1);
        }else {
            int l1= (int) stack.pop();
            if (l1<9){
                stack.push(++l1);
            }else {
                stack=pls(stack);
                stack.push(0);
            }
            return stack;
        }
        return stack;
    }

    
    }
