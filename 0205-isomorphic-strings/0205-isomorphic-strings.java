class Solution {
    public boolean isIsomorphic(String s, String t) {
        // Map<Character, Integer> charToIndex_s = new HashMap<>();
   // Map<Character, Integer> charToIndex_t = new HashMap<>();

   // for (Integer i = 0; i < s.length(); ++i)
     // if (charToIndex_s.put(s.charAt(i), i) != charToIndex_t.put(t.charAt(i), i))
       // return false;

   // return true;
 // }
//}


if (s.length() != t.length()) return false;
        int[] mapS = new int[256];
        int[] mapT = new int[256];
        for (int i = 0; i < s.length(); i++) {
            char charS = s.charAt(i);
            char charT = t.charAt(i);
            if (mapS[charS] != mapT[charT]) {
                return false;
            }
            mapS[charS] = i + 1;
            mapT[charT] = i + 1;
        }
        
        return true;
    }
}
            
        
            
    
        
    
