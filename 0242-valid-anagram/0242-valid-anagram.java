class Solution {
      public static boolean isAnagram(String s, String t) {
           if (s.length() != t.length()) {
            return false;
        }

        // Convert both strings to character arrays
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();

        // Sort both character arrays
        Arrays.sort(sArray);
        Arrays.sort(tArray);

        // Compare the sorted arrays
        return Arrays.equals(sArray, tArray);
    }
}
        