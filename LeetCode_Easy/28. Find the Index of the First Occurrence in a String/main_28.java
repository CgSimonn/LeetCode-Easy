public class main_28 {
    public static int strStr(String haystack, String needle) {
        if (needle.isEmpty() || haystack.isEmpty()) {
            return -1;
        } else if (needle.isEmpty() && haystack.isEmpty()) {
            return 0;
        } else if (haystack.length() == 1) {
            for (int i = 0; i < needle.length(); i++) {
                if (needle.charAt(i) == haystack.charAt(0)) {
                    return i;
                }
            }
        }

        int index = -1;
        for (int i = 0; i < haystack.length(); i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                int isTrue = 1;
                int nIndex = i + 1;
                for (int j = 1; j < needle.length(); j++) {
                    if (nIndex >= haystack.length()) {
                        index = -1;
                        isTrue = 0;
                        break;
                    }
                    if (haystack.charAt(nIndex++) != needle.charAt(j)) {
                        isTrue = 0;
                        break;
                    }

                }
                if (isTrue == 1) {
                    index = i;
                    break;
                }
            }
        }
        return index;

    }

    public static void main(String[] args) {
        String a = "mississippi";
        String b = "issipi";

        System.out.println(strStr(a, b));
    }
}

// Solution:
// class Solution {
// public int strStr(String haystack, String needle) {
// if ("".equals(needle)) {
// return 0;
// }

// int len1 = haystack.length();
// int len2 = needle.length();
// int p = 0;
// int q = 0;
// while (p < len1) {
// if (haystack.charAt(p) == needle.charAt(q)) {
// if (len2 == 1) {
// return p;
// }
// ++p;
// ++q;
// } else {
// p -= q - 1;
// q = 0;
// }

// if (q == len2) {
// return p - q;
// }
// }
// return -1;
// }
// }