package Strings.MEDIUM;

public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        for(int i = 0; i<ransomNote.length(); i++){
            char s = ransomNote.charAt(i);
            for(int j = 0; j<magazine.length(); j++){
                if(s == (magazine.charAt(i))){
                    continue;
                }else{
                    return false;
                }
            }
        }
        return true;
    }
}
