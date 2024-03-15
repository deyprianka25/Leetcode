class Solution:
    def reverseWords(self, s: str) -> str:
        s=s.split(" ")
        l=[]
        for word in s:
            l.append(word[::-1])
        return " ".join(l)    
            
        
        
                 
        
        
        