class Solution {

    public String encode(List<String> strs) {
       List<String> list = new ArrayList<>();
       StringBuilder encoded = new StringBuilder();
        for (String str : strs) {
            encoded.append(str.length()).append('#').append(str);
        }
        return encoded.toString();
    }

    public List<String> decode(String str) {
         List<String> result = new ArrayList<>();
        int i = 0;
        while (i < str.length()) {
            int delim = str.indexOf('#', i);
            int length = Integer.parseInt(str.substring(i, delim));
            i = delim + 1;
            result.add(str.substring(i, i + length));
            i += length;
        }
        return result;

    }
}
