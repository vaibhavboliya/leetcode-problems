class Solution {
    public void nextPermutation(int[] nums) {
        int p = -1;
        for(int i =nums.length-2;i>=0;i--)
            if(nums[i]<nums[i+1]){
                p = i;
                break;  
            }       
        
        if(p ==-1){
           reverse(nums,0);
            return;
             
            }
        
        for(int i = nums.length-1;i>=0;i--)
            if(nums[p]<nums[i]){
                swap(nums,p,i);
                reverse(nums,p+1);
                break;
            }    
    }
    private void swap(int[] nums,int pos1,int pos2){
        int temp = nums[pos1];
        nums[pos1] = nums[pos2];
        nums[pos2] = temp;         
    }
    private void reverse(int[] nums,int start){
        int end = nums.length-1;      
        while(start<=end){
            swap(nums,start++,end--);
        }
    }
}