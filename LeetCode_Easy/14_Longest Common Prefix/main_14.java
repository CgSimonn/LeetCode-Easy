class main_14 {
    public static String isPalindrome(String[] strs) {
        if (strs.length == 1) {
            return strs[0];
        }

        boolean isAllEqual = true;
        for (int i = 0; i < strs.length; i++) {
            if (!strs[i].equals(strs[0])) {
                isAllEqual = false;
            }
        }
        if (isAllEqual) {
            return strs[0];
        }

        int temp = strs[0].length();
        int index = 0;
        for (int i = 1; i < strs.length; i++) {
            if (temp > strs[i].length()) {
                temp = strs[i].length();
                index = i;
            }
        }
        String res = strs[index];
        String result = "";
        String sub;
        for (int i = 0; i < res.length(); i++) {
            if (res.length() == 1) {
                sub = res;
            } else {
                // if (i == 0) {
                // sub = res.substring(0, i + 1);
                // } else
                sub = res.substring(0, i + 1);
            }

            boolean isTrue = true;
            for (int j = 0; j < strs.length; j++) {
                if (j == index) {
                    continue;
                }
                String sub2;
                if (strs[j].length() == 1) {
                    sub2 = strs[j];
                } else {
                    // if (i == 0) {
                    // sub2 = strs[j].substring(0, i + 1);
                    // } else
                    sub2 = strs[j].substring(0, i + 1);
                }
                if (!sub.equals(sub2)) {
                    isTrue = false;
                    break;
                }
            }
            if (isTrue) {
                result = sub;
            }

        }

        return result;
    }

    public static void main(String[] args) {
        String[] b = { "aaa", "aa", "aaa" };
        String a = isPalindrome(b);
        System.out.println(a);
    }
}
