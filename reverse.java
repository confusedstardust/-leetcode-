//很差劲的做法，先用栈来存放每一位，后出栈实现反转，最后做范围控制，超出范围返回0
class Solution {
    public  int reverse(int x) {
        int resultVal;
        int i=0;
        Stack<Integer> s=new Stack<>();
        resultVal=x;
        resultVal=Math.abs(resultVal);
        while (resultVal>0){
            resultVal=resultVal/10;
            int t=(int) (x%Math.pow(10,i+1)/Math.pow(10,i));
            if (t!=0||(t==0&i>0))
                s.push(t);
            i++;
        }
        i=0;
        resultVal=0;
        while (!s.isEmpty()){
            resultVal+=s.pop()*Math.pow(10,i++);
        }
        if((resultVal==2147483647)|(resultVal==-2147483648))
            return 0;
        else
            return resultVal;
    }
}
