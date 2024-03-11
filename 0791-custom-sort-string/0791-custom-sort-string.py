class Solution:
    def customSortString(self, order: str, s: str) -> str:
        char_count = Counter(s)
        sorted_characters = []
        for char in order:
            sorted_characters.append(char * char_count[char])
            char_count[char] = 0
        for char, count in char_count.items():
            sorted_characters.append(char * count)
        return ''.join(sorted_characters)
        