import java.util.*;

public class Solution {
    public String frequencySort(String s) {
        // Step 1: Create a frequency map
        Map<Character, Integer> frequencyMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        // Step 2: Create a max heap with a custom comparator
        PriorityQueue<Map.Entry<Character, Integer>> maxHeap = new PriorityQueue<>(
            (entry1, entry2) -> entry2.getValue() - entry1.getValue()
        );

        // Step 3: Add character-frequency pairs to the max heap
        maxHeap.addAll(frequencyMap.entrySet());

        // Step 4: Build the sorted string
        StringBuilder sortedString = new StringBuilder();
        while (!maxHeap.isEmpty()) {
            Map.Entry<Character, Integer> entry = maxHeap.poll();
            char c = entry.getKey();
            int frequency = entry.getValue();
            for (int i = 0; i < frequency; i++) {
                sortedString.append(c);
            }
        }

        return sortedString.toString();
    }

}
