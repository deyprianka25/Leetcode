class Solution {
    public int longestPalindrome(String s) {
        if(s==null)
return 0;
Map<Character,Integer> hm=new HashMap<>();
for(int i=0;i<s.length();i++){
char d=s.charAt(i);
if(hm.containsKey(d))
hm.put(d,hm.get(d)+1);
else
hm.put(d,1);
}
int count=0;
for(Integer i : hm.values()){ //count odd no. of characters
if(i%2!=0)
count++;
}
if(count==0) //means string is of even length and full string can be a palindrome
return s.length();
else
return s.length()-count+1; //remove odd elements and add 1 for middle character of palindrome
}
}