// 用空格把字符串分成一个一个单词，输出最后一个就完事儿了！什么叫Java啊（战术后仰）

class Solution {
    public  int lengthOfLastWord(String s) {
        String[] strings=s.split(" ");
        String val=strings[strings.length-1];
        return val.length();
    }
}
