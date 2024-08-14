public class main_66 {
    public int[] plusOne(int[] digits) {
        int lastDigit = digits[digits.length - 1];
        if (lastDigit < 9) {
            digits[digits.length - 1] += 1;
        } else if (lastDigit == 9) {
            if (digits.length == 1) {
                digits[digits.length - 1] = 1;
                int[] newDigits = new int[2];
                newDigits[0] = 1;
                newDigits[1] = 0;
                digits = newDigits;
            } else {
                int n = digits.length - 1;
                digits[n] = 0;
                while (digits[n] == 0) {
                    if (n == 0) {
                        int[] newDigits = new int[digits.length + 1];
                        newDigits[n++] = 1;
                        for (int i : digits) {
                            newDigits[n++] = i;
                        }
                        digits = newDigits;
                        return digits;
                    }
                    n -= 1;
                    digits[n] += 1;
                    if (digits[n] == 10) {
                        digits[n] = 0;
                    }
                }

            }

        }
        return digits;
    }

    public static void main(String[] args) {

    }
}
