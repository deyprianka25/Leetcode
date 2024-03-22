class Solution:
    def reverseOnlyLetters(self, s: str) -> str:
        '''l,r = 0,len(s)-1
        s = list(s)
        while(l<r):
            while not s[l].isalpha and l<r:
                l+=1
            while not s[r].isalpha and l<r:
                r-=1
            s[l],s[r]=s[r],s[l]
            l+=1
            r-=1
        return " ".join(s)'''
        ans = list(s)
        i = 0
        j = len(s) - 1

        while i < j:
            while i < j and not s[i].isalpha():
                i += 1
            while i < j and not s[j].isalpha():
                j -= 1
            ans[i], ans[j] = ans[j], ans[i]
            i += 1
            j -= 1

        return ''.join(ans)
        