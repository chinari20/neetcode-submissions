class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();
        for(String op:operations){
            if(op.equals("+")){
                int f = st.pop();
                int s = st.peek();
                st.push(f);
                int sum = f+s;
                st.add(sum);
            }
            else if(op.equals("C")){
                st.pop();
            }
            else if(op.equals("D")){
                int val = st.peek();
                st.add(2*val);
            }
            else{
                int n = Integer.parseInt(op);
                st.add(n);
            }
        }
        int sum=0;
        while(!st.isEmpty()){
            sum+=st.pop();
        }
        return sum;
    }
}