//初步常规
class Solution {
    public  int searchInsert(int[] nums, int target) {
        int result=-1;
        for (int i=0;i<nums.length;i++){
            if (target==nums[i]){
                result=i;
            }
        }
        if (result==-1){
            if (target>nums[nums.length-1])
                result=nums.length;
            if (target<nums[0])
                result=0;
        }
        if (result==-1){
            for (int j=0;j<nums.length;j++){
                if (target<nums[j+1]){
                    result=j+1;
                    break;
                }
            }
        }
        return result;
    }
}


//优化常规
class Solution {
    int searchInsert(int[] nums, int target) {
        int len=nums.length;
        int pos=0;
        for(int i=0;i<len;i++){
            if(nums[i]==target) return i;
            if(nums[i]<target) pos++;
        }
        return pos;
    }
}
//二分法
class Solution {
    public static int searchInsert(int[] nums, int target) {
        int top=0;
        int bottom=nums.length;
        if (nums[0]==target) return 0;
        if (nums[nums.length-1]==target) return nums.length-1;
        while (top<bottom){
            int tem=(top+bottom)/2;
            if (target==nums[tem])
               return tem;
            if (target>nums[tem])
                top=tem+1;
            if (target<nums[tem])
                bottom=bottom-1;
        }
        return top;
    }
}
