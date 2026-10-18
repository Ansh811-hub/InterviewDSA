package Heaps;

import java.util.HashMap;
import java.util.PriorityQueue;

public class SortCharacterbyFrequency1 {
        public String frequencySort(String s) {

                    HashMap<Character, Integer> map = new HashMap<>();

                    // Frequency count
                    for (char ch : s.toCharArray()) {
                        map.put(ch, map.getOrDefault(ch, 0) + 1);
                    }

                    // Min Heap
                    PriorityQueue<Character> minHeap = new PriorityQueue<>((a, b) -> {

                        if (!map.get(a).equals(map.get(b))) {
                            return Integer.compare(map.get(a), map.get(b));
                        }

                        return Character.compare(a, b);
                    });

                    // Add unique characters
                    minHeap.addAll(map.keySet());

                    StringBuilder ans = new StringBuilder();

                    while (!minHeap.isEmpty()) {

                        char ch = minHeap.poll();

                        int freq = map.get(ch);

                        for (int i = 0; i < freq; i++) {
                            ans.append(ch);
                        }
                    }

                    return ans.toString();
                }
            }
