class Solution {
    public boolean isValidSudoku(char[][] board) {
        int n = board.length;
        int m = board[0].length;
        for(int i=0;i<n;i++){
            HashSet<Character> r = new HashSet<>();
            for(int j=0;j<m;j++){
                char ch = board[i][j];
                if(ch=='.')continue;
                if(r.contains(ch))return false;
            r.add(ch);
            }
        }
        for(int i=0;i<m;i++){
            HashSet<Character> c = new HashSet<>();
            for(int j=0;j<n;j++){
                char ch = board[j][i];
                if(ch=='.')continue;
                if(c.contains(ch))return false;
            c.add(ch);
            }
        }
        for(int r=0;r<9;r+=3){
            for(int c=0;c<9;c+=3){
                HashSet<Character> st = new HashSet<>();
                for(int i=r;i<r+3;i++){
                    for(int j=c;j<c+3;j++){
                        char ch = board[i][j];
                        if(ch=='.'){
                            continue;
                        }
                        if(st.contains(ch))return false;
                        st.add(ch);
                    }
                }
            }
        }
        return true;
    }
}
