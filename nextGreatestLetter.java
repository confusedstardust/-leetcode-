// 可以用二分，但我就不用，欧耶！！！
public static char nextGreatestLetter(char[] letters, char target) {
        Map<Character,Integer> map=new HashMap<>();
        int i=0;
        while (i<26){
            map.put((char)((i++)+97) ,i+1);
        }
        i=0;
        for (;i<letters.length;i++){
            if (map.get(target)<map.get(letters[i]))
                return letters[i];
        }
        return letters[0];
    }
