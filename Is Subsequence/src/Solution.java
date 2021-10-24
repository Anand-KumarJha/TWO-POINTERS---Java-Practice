class Solution {
    public boolean isSubsequence(String s, String t) {
        char c;
        if(s.equals(t)){
            return true;
        }
        for(int i = 0, j = 0; i < t.length(); i++){
            if(j < s.length()){
                c = s.charAt(j);
            }else{
                return true;
            }

            if(t.charAt(i) == c){
                if(j == s.length()-1){
                    return true;
                }
                j++;
            }
        }return false;
    }
}