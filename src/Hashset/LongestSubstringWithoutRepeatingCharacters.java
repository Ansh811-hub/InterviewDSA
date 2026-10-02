
import java.util.HashSet;

public static class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();

        int cnt = 0;
        int maxi = 0;

        for(int i = 0; i<s.length(); i++){
            if(set.contains(s.charAt(i))){
                set.remove(s.charAt(i));
                cnt = 0;
            }else{
                cnt++;
                set.add(s.charAt(i));
                maxi = Math.max(maxi,cnt);
            }
        }
        return maxi;
    }
}
public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the string");
    String s = in.nextLine();
    LongestSubstringWithoutRepeatingCharacters l = new LongestSubstringWithoutRepeatingCharacters();
    System.out.println(l.lengthOfLongestSubstring(s));
}
