package Strings.MEDIUM;

public class MaximumNumberofVowelsinaSubstringofGivenLength {
    public int maxVowels(String s, int k) {

        int maxi = 0;
        for(int i = 0; i<=s.length()-k; i++){
            int p = 0;
            for(int j = i; j<i+k; j++){
                if(s.charAt(j) == 'a' || s.charAt(j) == 'e' || s.charAt(j) == 'i' || s.charAt(j) == 'o' || s.charAt(j) == 'u'){
                    p++;
                }
                maxi =  Math.max(maxi,p);
            }
        }
        return maxi;
    }
}
}
