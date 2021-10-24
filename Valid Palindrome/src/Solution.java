class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder t = new StringBuilder();
        StringBuilder u = new StringBuilder();

        for(int i = 0, j = s.length() - 1;i < s.length(); i++){
            char c = s.charAt(i);
            if(c <= 90 && c >= 65 || c <= 122 && c >= 97|| c <= 57 && c >= 48){
                t.append(c+"");
            }

            c = s.charAt(j);
            if(c <= 90 && c >= 65 || c <= 122 && c >= 97|| c <= 57 && c >= 48){
                u.append(c+"");
            }j--;

        }

        return t.toString().toLowerCase().equals(u.toString().toLowerCase());
    }
}