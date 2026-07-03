class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<strs.size();i++){
            String f = strs.get(i);
            int l = f.length();
            sb.append(l);
            sb.append("#");
            sb.append(f);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> ans = new ArrayList<>();
        int i=0;
        while(i<str.length()){
            int j=i;
            while(str.charAt(j)!='#'){
                j++;
            }
            int l = Integer.parseInt(str.substring(i,j));
            j++;
            String word = str.substring(j,j+l);
            ans.add(word);
            i=j+l;

        }
        return ans;
        

    }
}
