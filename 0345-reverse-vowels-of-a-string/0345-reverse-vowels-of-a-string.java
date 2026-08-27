class Solution {

    public static boolean isVowel(char ch) {

        if (ch == 'a' || ch == 'A')
            return true;
        else if (ch == 'e' || ch == 'E')
            return true;
        else if (ch == 'i' || ch == 'I')
            return true;
        else if (ch == 'o' || ch == 'O')
            return true;
        else if (ch == 'u' || ch == 'U')
            return true;
        else
            return false;

    }

    public String reverseVowels(String s) {

        char ch[] = s.toCharArray();
        int low = 0;
        int high = ch.length - 1;

        while (low < high) {
            if (isVowel(ch[low]) && isVowel(ch[high])) {
                //swap temp
                char temp = ch[low];
                ch[low] = ch[high];
                ch[high] = temp;
                low++;
                high--;
            } else if (isVowel(ch[low]) && !isVowel(ch[high])) {
                high--;
            } else if (!isVowel(ch[low]) && isVowel(ch[high])) {
                low++;
            } else {
                low++;
                high--;
            }
        }

        return new String(ch);
    }
}