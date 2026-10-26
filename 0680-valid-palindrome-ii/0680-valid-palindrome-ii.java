class Solution {
    public boolean validPalindrome(String s) {
        int lp = 0;
        int rp = s.length() - 1;

        while (lp < rp) {
            if (s.charAt(lp) == s.charAt(rp)) {
                lp++;
                rp--;
            } else {
                return isPalindrome(s, lp + 1, rp) ||
                       isPalindrome(s, lp, rp - 1);
            }
        }

        return true;
    }

    public boolean isPalindrome(String s, int lp, int rp) {
        while (lp < rp) {
            if (s.charAt(lp) != s.charAt(rp)) {
                return false;
            }
            lp++;
            rp--;
        }

        return true;
    }
}