class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int n=citations.length;
        for (int i=0;i<n;i++){
            int hindex=n-i;
            if (citations[i]>=hindex){
                return hindex;
            }
        }
        return 0;
    }
}