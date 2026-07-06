class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        for(int p=0;p<k;p++){
            int l = nums[n-1];
            for(int i=n-1;i>0;i--){
                nums[i]=nums[i-1];
            }
            nums[0]=l;
        }
        
    }
}