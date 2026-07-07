class Solution {
    public String removeStars(String s) {
      char[] a = s.toCharArray();
        LinkedList<Character> l = new LinkedList<>();

        for (char x : a) {
            if (x == '*') {
                l.removeLast();
            } else {
                l.addLast(x);
            }
        }

        StringBuilder ans = new StringBuilder();

        for (char ch : l) {
            ans.append(ch);
        }

        return ans.toString();
    }
}