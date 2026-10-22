class Solution {
    public boolean isPalindrome(String s) {
         s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        int i=0;
        while(i<s.length()){
            if(s.charAt(i)!=s.charAt(s.length()-1-i)){
                return false;
            }
            i++;
        }
        return true;
    }
}