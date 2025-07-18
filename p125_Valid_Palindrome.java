public class p125 {
    public boolean isPalindrome(String s) {
        String a = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                a = a + Character.toLowerCase(c);
            }
        }
        int left = 0, right = a.length() - 1;
        while (left < right) {
            if (a.charAt(left) != a.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
