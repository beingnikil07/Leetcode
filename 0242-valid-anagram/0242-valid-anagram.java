class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> map=new HashMap<>();
        HashMap<Character,Integer> map2=new HashMap<>();

        if(s.length()!=t.length()) return false;

        for(char x:s.toCharArray()){
            map.put(x,map.getOrDefault(x,0)+1);
        }    

        for(char x:t.toCharArray()){
            map2.put(x,map2.getOrDefault(x,0) +1);
        }

        return map.equals(map2);
    }
}
