class Solution {
    public int countPrimes(int n) {
        if(n<2){
            return 0;
        }
        //sieve of eratosthenes
        List<Integer> prime = new ArrayList<>(n + 1);
        for(int i=0;i<=n;i++){
            prime.add(1);
        }
        prime.set(0,0);
        prime.set(1,0);
        for(int i=2;i<=Math.sqrt(n);i++){
            for(int j=i*i;j<n;j+=i){
                prime.set(j,0);
            }
        }
        int count=0;
        for(int i=2;i<n;i++){
            if(prime.get(i)==1){
                count++;
            }
        }
        return count;
        
    }
}