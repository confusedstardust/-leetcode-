class Solution {
public  void merge(int[] nums1, int m, int[] nums2, int n) {
        int[]newarray=new int[m+n];
        int s1=0;
        int s2=0;
        for (int i=0;i<newarray.length;i++){
            if (s1<m&&s2<n){
                if (nums1[s1]<nums2[s2]){
                    newarray[i]=nums1[s1++];
                    continue;
                }
                if (nums1[s1]==nums2[s2]){
                    newarray[i++]=nums1[s1++];
                    newarray[i]=nums2[s2++];
                    continue;
                }else {
                    newarray[i]=nums2[s2++];
                    continue;
                }
            }else {
                if (s1<m){
                    newarray[i]=nums1[s1++];
                    continue;
                }
                if (s2<n){
                    newarray[i]=nums2[s2++];
                    continue;
                }
            }
        }
        for(int i=0;i<nums1.length;i++)
        nums1[i]=newarray[i];

    }
}
