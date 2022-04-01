    /**
     * 
     * 字符          数值
     * I             1
     * V             5
     * X             10
     * L             50
     * C             100
     * D             500
     * M             1000
     *
     * I 可以放在 V (5) 和 X (10) 的左边，来表示 4 和 9。
     * X 可以放在 L (50) 和 C (100) 的左边，来表示 40 和 90。 
     * C 可以放在 D (500) 和 M (1000) 的左边，来表示 400 和 900。
     *
     *
     * map存其对应权值，列出特殊情况分别做判断
     *
     * 
     * */
class Solution {
public  int romanToInt(String s) {
        Map<Character,Integer> map=new HashMap<>();
            map.put('I',1);
            map.put('V',5);
            map.put('X',10);
            map.put('L',50);
            map.put('C',100);
            map.put('D',500);
            map.put('M',1000);
        int sum=0;
        char c=' ';
        for (int i=0;i<s.length();i++){
            c=s.charAt(i);
            if (c=='I'&&(i+1<s.length())&&((s.charAt(i+1)=='V')|(s.charAt(i+1)=='X'))) {
                if (s.charAt(i+1)=='V') {
                    sum += map.get('V') - map.get('I');
                }else {
                    sum+=map.get('X')-map.get('I');
                }
                i++;
                continue;
            }
            if (c=='X'&&i+1<s.length()&&((s.charAt(i+1)=='L')|(s.charAt(i+1)=='C'))) {
                if (s.charAt(i+1)=='L') {
                    sum += map.get('L') - map.get('X');
                }else {
                    sum+=map.get('C')-map.get('X');
                }
                i++;
                continue;
            }
            if (c=='C'&&i+1<s.length()&&((s.charAt(i+1)=='D')|(s.charAt(i+1)=='M'))) {
                if (s.charAt(i+1)=='D') {
                    sum += map.get('D') - map.get('C');
                }else {
                    sum+=map.get('M')-map.get('C');
                }
                i++;
                continue;
            }
            sum+=map.get(s.charAt(i));
        }
        return sum;
    }
}
