class Solution:
    def reverseVowels(self, s: str) -> str:
        vowels = "AaEeIiOoUu"
    
        i = 0
        j = len(s) - 1
    
        l = list(s)
    
        while i < j:
            if l[i] in vowels and l[j] in vowels:
                l[i], l[j] = l[j], l[i]
                i += 1
                j -= 1
            elif l[i] in vowels:
                j -= 1
            elif l[j] in vowels:
                i += 1
            else:
                i += 1
                j -= 1
    
        return "".join(l)
        