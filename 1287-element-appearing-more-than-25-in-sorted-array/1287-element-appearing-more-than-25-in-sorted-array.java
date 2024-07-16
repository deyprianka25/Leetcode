class Solution {
    public int findSpecialInteger(int[] arr) {
        int n = arr.length;
        int threshold = n / 4; 

        for (int i = 0; i < n; i++) {
            if (i + threshold < n && arr[i] == arr[i + threshold]) {
                return arr[i];
            }
        }
        return -1;
    }
        
    }
