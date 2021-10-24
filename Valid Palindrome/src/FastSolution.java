class FastSolution {
    public boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        while(i < j){
            char c = s.charAt(i);
            char d = s.charAt(j);

            if(c <= 90 && c >= 65 || c <= 122 && c >= 97|| c <= 57 && c >= 48){
                if(d <= 90 && d >= 65 || d <= 122 && d >= 97|| d <= 57 && d >= 48){
                    if((c+"").equalsIgnoreCase((d+""))){
                        i++;
                        j--;
                    }else{
                        return false;
                    }
                }else{
                    j--;
                }
            }else{
                i++;
            }
        }
        return true;
    }
}