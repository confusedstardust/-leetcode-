//解法一与解法二，分别使用hashmap和数组将1-26与A-Z对应，前者用key-value形式，后者内容-下标形式，之后设定26进制规则后计算所需值
//两者时间空间复杂度差不多，无显著区别
class Solution {
    public  int  titleToNumber(String columnTitle) {
        Map<Character, Integer> map=new HashMap<>();
        for (int i=0;i<26;i++){
            map.put((char)(65+i),i+1);
        }
        int x=0;
        int length=columnTitle.length()-1;
        for (int i=0;i<length+1;i++){
            x+=map.get(columnTitle.charAt(i))*(int)Math.pow(26,length-i);
        }
        return x;
    }
}





//解法二

class Solution {
    public  int  titleToNumber(String columnTitle) {
        char[] c=new char[26];
        for (int i=0;i<26;i++){
            c[i]=(char) (65+i);
        }
        int x=0;
        for (int i=0;i<columnTitle.length();i++){
            x+=findVal(columnTitle.charAt(i),c)*(int) Math.pow(26,columnTitle.length()-1-i);
        }
        return x;
    }
    public  int findVal(char c,char[] chars){
        int val=0;
        for (int x=0;x<chars.length;x++){
            if (c==chars[x]){
                val=x;
            }
        }
        return val+1;
    }
}
