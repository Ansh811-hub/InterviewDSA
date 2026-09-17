package Strings.MEDIUM.OPTIMAL;

public class MaximumNumberofVowelsinaSubstringofGivenLength {
    public int maxVowels(String s, int k) {
        int maxi = 0;
        for (int i = 0; i <= s.length() - k; i++) {
            int p = 0;
            for (int j = i; j < i + k; j++) {
                if (isVowel(s.charAt(j))) {
                    p++;
                }
            }
            maxi = Math.max(maxi, p);
        }
        return maxi;
    }

    public boolean isVowel(char c) {
        return c == 'a' ||
                c == 'e' ||
                c == 'i' ||
                c == 'o' ||
                c == 'u';
    }
}
