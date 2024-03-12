class Solution {
    public String reverseVowels(String s) {
        int i = 0, j = s.length() - 1;
        char[] sarr = s.toCharArray();
        while(i < j) {
            if(!s.substring(i, i+1).matches("[aeiouAEIOU]")) {
                i++;
            } else if(!s.substring(j, j+1).matches("[aeiouAEIOU]")) {
                j--;
            } else {
                char temp = sarr[i];
                sarr[i] = sarr[j];
                sarr[j] = temp;
                i++;
                j--;
            }
        }
        return new String(sarr);
    }
        
    }
