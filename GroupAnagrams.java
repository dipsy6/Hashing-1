

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<HashMap<Character, Integer>, List<String>> map = new HashMap<>();

        for (String str : strs) {
            HashMap<Character, Integer> wordMap = new HashMap<Character, Integer>();
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                wordMap.put(ch, wordMap.getOrDefault(ch, 0) + 1);
            }
            if (!map.containsKey(wordMap)) {
                ArrayList<String> list = new ArrayList<String>();
                list.add(str);
                map.put(wordMap, list);
            } else {
                List<String> list = map.get(wordMap);
                list.add(str);
                map.put(wordMap, list);
            }

        }
        List<List<String>> result = new ArrayList();
        for (List<String> list : map.values()) {
            result.add(list);
        }
        return result;

    }
}