class Solution {
    public void sortColors(int[] nums) {
        int f=0;
        int s=0;
        int z=0;
        for(int i:nums){
            if(i==1){
                f++;
            }
            if(i==2){
                s++;
            }
            if(i==0){
                z++;
            }

        }
        int k=0;
        while(z>0){
            nums[k++]=0;
            z--;
        }
        while(f>0){
            nums[k++]=1;
            f--;
        }
        while(s>0){
            nums[k++]=2;
            s--;
        }

    }
}