class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        d = {}
        for letter in s:
            if letter not in d:
                d[letter]=1
            else:
                d[letter]+=1
        for letter in t:
            if letter not in d:
                return False
            else:
                d[letter]-=1
        for value in d.values():
            if value != 0:
                return False
        return True    
            
                
        
        