第一题，两数之和


class Solution {
public int[] twoSum(int[] array, int target) {
int[] temparry=new int[2] ;//存储结果的数组
			for(int temp=0;temp<array.length;temp++) {
				for (int i = temp+1; i <array.length; i++) {
					if (array[temp]+array[i]==target) {
						temparry[0]=temp;
						temparry[1]=i;
						// System.out.println(temparry[0]+"yu"+temparry[1]);
					}
					
				}
			}
			return temparry;
	    }
}
