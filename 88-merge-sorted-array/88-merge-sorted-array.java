class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int nums1Idx = m-1,nums2Idx = n-1,commnIdx = m+n-1;
        while(nums1Idx>=0 && nums2Idx>=0){
            nums1[commnIdx--] = (nums1[nums1Idx]>nums2[nums2Idx])?nums1[nums1Idx--]: nums2[nums2Idx--];
        }
        while(nums2Idx>=0){
            nums1[commnIdx--] = nums2[nums2Idx--];
        }
    }
}