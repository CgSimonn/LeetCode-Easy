public class main_58 {
    public int lengthOfLastWord(String s) {
        if (s.length() == 0) {
            return 0;
        }
        int l_index = 0;
        int length = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (Character.isLetter(s.charAt(i))) {
                l_index = i;
                break;
            }
        }

        for (int j = l_index; j >= 0; j--) {
            length++;
            if (Character.isWhitespace(s.charAt(j))) {
                break;
            } else if (j == 0) {
                return length;
            }
        }

        return length - 1;
    }
}
