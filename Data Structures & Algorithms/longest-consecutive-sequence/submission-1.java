class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> st = new HashSet<>();
        for(int i:nums){
            st.add(i);
        }
        int len=0;
        for(int i:st){
            int curr=0;
            int l=0;
            if(!st.contains(i-1)){
                curr = i;
                l=1;
            }
            while(st.contains(curr+1)){
                curr++;
                l++;
            }
            len=Math.max(l,len);
        }
        return len;
    }
}
