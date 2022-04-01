// 解法1 逐个写回nums，定义一个count为剩余元素个数用于返回
public static int removeElement(int[] nums, int val) {
    int count=0;
    for (int i=0;i<nums.length;i++){
        if (nums[i]!=val) {
            nums[count] = nums[i];
            count++;
        }
    }
    return count;
}


//解法2 定义一个arraylist存新值，再把list中元素批量写回nums
class Solution {
    public  int removeElement(int[] nums, int val) {
        ArrayList<Integer> arrayList=new ArrayList<Integer>();
        for (int i=0;i<nums.length;i++){
            if (nums[i]!=val)
                arrayList.add(nums[i]);
        }
        for (int i=0;i<arrayList.size();i++)
        nums[i]=arrayList.get(i);
        return arrayList.size();
    }
}
