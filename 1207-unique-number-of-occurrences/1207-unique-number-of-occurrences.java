class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        // Count occurrences of each element
        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        
        HashSet<Integer> set = new HashSet<>();
        
        // Check if all occurrence counts are unique
        for (int count : map.values()) {
            if (!set.add(count)) {  // add() returns false if the set already contains the element
                return false;
            }
        }
        
        return true;
    }
}