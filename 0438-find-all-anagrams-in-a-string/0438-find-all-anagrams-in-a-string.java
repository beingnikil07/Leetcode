class Solution {

    public static boolean compare(HashMap<Character, Integer> pMap,
                                  HashMap<Character, Integer> sMap) {

        if (pMap.size() != sMap.size()) {
            return false;
        }

        for (char ch : pMap.keySet()) {
            if (!pMap.get(ch).equals(sMap.get(ch))) {
                return false;
            }
        }

        return true;
    }

    public List<Integer> findAnagrams(String s, String p) {

        HashMap<Character, Integer> pMap = new HashMap<>();
        HashMap<Character, Integer> sMap = new HashMap<>();

        List<Integer> result = new ArrayList<>();

        if (p.length() > s.length()) {
            return result;
        }

        // Frequency of p
        for (int i = 0; i < p.length(); i++) {
            char ch = p.charAt(i);
            pMap.put(ch, pMap.getOrDefault(ch, 0) + 1);
        }

        // First window
        for (int i = 0; i < p.length(); i++) {
            char ch = s.charAt(i);
            sMap.put(ch, sMap.getOrDefault(ch, 0) + 1);
        }

        // Check first window
        if (compare(pMap, sMap)) {
            result.add(0);
        }

        // Sliding window
        for (int i = p.length(); i < s.length(); i++) {

            // Add new character
            char newChar = s.charAt(i);
            sMap.put(newChar, sMap.getOrDefault(newChar, 0) + 1);

            // Remove old character
            char oldChar = s.charAt(i - p.length());

            if (sMap.get(oldChar) == 1) {
                sMap.remove(oldChar);
            } else {
                sMap.put(oldChar, sMap.get(oldChar) - 1);
            }

            // Check current window
            if (compare(pMap, sMap)) {
                result.add(i - p.length() + 1);
            }
        }

        return result;
    }
}