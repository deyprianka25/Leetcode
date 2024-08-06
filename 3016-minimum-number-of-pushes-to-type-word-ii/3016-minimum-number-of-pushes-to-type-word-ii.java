class Solution {
    public int minimumPushes(String word) {
        Map<Character, Integer> frequencyMap = new HashMap<>();
        for (char ch : word.toCharArray()) {
            frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
        }

        // Step 2: Create a list of characters sorted by frequency in descending order
        List<Map.Entry<Character, Integer>> sortedEntries = new ArrayList<>(frequencyMap.entrySet());
        sortedEntries.sort((a, b) -> b.getValue() - a.getValue());

        // Step 3: Calculate the minimum number of pushes needed
        int[] keyPresses = {1, 1, 1, 1, 1, 1, 1, 1}; // Initial key presses for keys 2 to 9
        int index = 0;
        int totalPushes = 0;

        for (Map.Entry<Character, Integer> entry : sortedEntries) {
            int frequency = entry.getValue();
            totalPushes += frequency * keyPresses[index];
            keyPresses[index]++;
            index = (index + 1) % 8; // Only use keys 2 to 9
        }

        return totalPushes;
    }
}