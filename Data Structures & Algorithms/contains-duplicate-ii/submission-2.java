class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer,Integer> m = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(m.containsKey(nums[i])){
                int p = m.get(nums[i]);
                int d = Math.abs(p-i);
                if(d<=k)return true;
            }
            m.put(nums[i],i);
        }
        return false;
    }
}