package Strings.MEDIUM;

import java.util.HashMap;
import java.util.PriorityQueue;

public class sortbyfrequency {
        public String frequencySort(String s) {

            HashMap<Character, Integer> freq = new HashMap<>();

            // Count frequency
            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);

                if (freq.containsKey(ch)) {
                    freq.put(ch, freq.get(ch) + 1);
                } else {
                    freq.put(ch, 1);
                }
            }

            // Max Heap
            PriorityQueue<Character> pq = new PriorityQueue<>(
                    (a, b) -> freq.get(b) - freq.get(a)
            );

            pq.addAll(freq.keySet());

            // Build answer
            StringBuilder ans = new StringBuilder();

            while (!pq.isEmpty()) {
                char ch = pq.poll();

                for (int i = 0; i < freq.get(ch); i++) {
                    ans.append(ch);
                }
            }
            return ans.toString();
        }
    }
