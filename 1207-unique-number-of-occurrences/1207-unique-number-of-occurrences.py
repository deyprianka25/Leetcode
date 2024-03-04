class Solution:
    def uniqueOccurrences(self, arr: List[int]) -> bool:
        d={}
        for i in arr:
            if i in d:
                d[i]+=1
            else:
                d[i]=1
        list_freq=list(d.values())
        check_freq={}
        for i in list_freq:
            if i in check_freq:
                return False
            check_freq[i]=1
        return True   
            
        
        
        
        
        