class Solution {
    public  List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> integerList=new ArrayList<>();
        for (;left<=right;left++){
            if (isDevideNum(left))
                integerList.add(left);
        }
        return integerList;
    }
    public  boolean isDevideNum(int val){
        int count=0;
        int temp=val;
        while (temp>0){
            temp=temp/10;
            count++;
        }
        for (int i=0;i<count;i++){
            int t=(val%(int) Math.pow(10,i+1))/(int)Math.pow(10,i);
            if (t==0)
                return false;
            if (val%t==0)
                continue;
            else return false;
        }
        return true;
    }
}
