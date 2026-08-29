class Solution {
    public List<Integer> findAnagrams(String s, String p) {

        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i <= s.length() - p.length(); i++) {

            int[] freqP = new int[26];
            int[] freqS = new int[26];

            // frequency of p
            for (int j = 0; j < p.length(); j++) {
                freqP[p.charAt(j) - 'a']++;
            }

            // frequency of current substring
            for (int j = i; j < i + p.length(); j++) {
                freqS[s.charAt(j) - 'a']++;
            }

            // compare frequencies
            if (Arrays.equals(freqP, freqS)) {
                ans.add(i);
            }
        }

        return ans;
    }
}