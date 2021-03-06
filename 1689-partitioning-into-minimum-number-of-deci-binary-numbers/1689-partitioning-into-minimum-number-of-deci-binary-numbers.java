class Solution {
    public int minPartitions(String n) {
        int min = 0;
        
        for (int i = 0; i < n.length(); i++) 
            min = Math.max(min,Integer.parseInt(n.substring(i,i+1)));
        
        return min;
    } //minPartitions
} //Sol