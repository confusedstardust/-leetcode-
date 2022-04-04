// 借鉴评论区思路写下来

class Solution {
    public  int findRepeatNumber(int[] nums) {
        int[] count=new int[nums.length];
        for (int i=0;i<nums.length;i++){
            count[nums[i]]++;
        }
        for (int i=0;i<count.length;i++){
            if (count[i]>=2)
                return i;
        }
        return 1;
}
}
