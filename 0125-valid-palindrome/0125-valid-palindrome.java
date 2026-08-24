class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int low = 0;
        int high = s.length() - 1;

        while (low < high) {
            char ch1 = s.charAt(low);
            char ch2 = s.charAt(high);

            if (!(ch1 >= 'A' && ch1 <= 'Z' || ch1 >= 'a' && ch1 <= 'z' || ch1 >= '0' && ch1 <= '9')) {
                low++;
                continue;
            }
            if (!(ch2 >= 'A' && ch2 <= 'Z' || ch2 >= 'a' && ch2 <= 'z' || ch2 >= '0' && ch2 <= '9')) {
                high--;
                continue;
            }

            if (ch1 != ch2) {
                return false;
            }

            low++;
            high--;
        }

        return true;
    }
}