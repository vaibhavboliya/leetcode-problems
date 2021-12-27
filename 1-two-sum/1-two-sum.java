class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int idx = 0; idx<nums.length;idx++){
            if(map.containsKey(target-nums[idx])){
                return new int[] {map.get(target-nums[idx]),idx};
            }else
                map.put(nums[idx],idx);
        }
        return null;
    }
}