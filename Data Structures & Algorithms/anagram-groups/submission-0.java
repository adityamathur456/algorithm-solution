class Solution {
    private String hashCode(String str) {
        int[] hashArray = new int[26];

        for (char ch : str.toCharArray()) 
            hashArray[ch - 'a']++;      

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 26; i++) 
            sb.append("$" + hashArray[i]);
        
        return sb.toString();
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hashString = new HashMap<>();
        for (String str : strs) {
            String hash = hashCode(str);
            hashString.computeIfAbsent(hash, K -> new ArrayList<>()).add(str);
        }

        return new ArrayList<>(hashString.values());
    }
}
