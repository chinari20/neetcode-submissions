class MyHashSet {
    HashSet<Integer> s;

    public MyHashSet() {
        s = new HashSet<>();
        
    }
    
    public void add(int key) {
        s.add(key);
        
    }
    
    public void remove(int key) {
        s.remove(key);
        
    }
    
    public boolean contains(int key) {
        for(int i:s){
            if(i==key){
                return true;
            }


        }
        return false;
        
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */