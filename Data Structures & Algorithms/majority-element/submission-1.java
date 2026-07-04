class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int r = n/2;
        HashMap<Integer,Integer> m = new HashMap<>();
        for(int i:nums){
            m.put(i,m.getOrDefault(i,0)+1);

        }
        for(Map.Entry<Integer,Integer> e:m.entrySet()){
           if(e.getValue()>r){
                return e.getKey();
           }
        }
        return 0;

       
    }
}