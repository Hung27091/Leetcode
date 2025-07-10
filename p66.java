
public class p66 {
        public int[] plusOne(int[] digits) {
            String s = "";
            int count = 0;
            int tmp = 0;
            for (int i = 0; i < digits.length; i++) {
                if (digits[i] == 9) {
                    count++;
                }
            }
            if (count == digits.length) {
                int[] a = new int[digits.length + 1];
                a[0] = 1;
                return a;
            } else if (digits.length < 9) {
                for (int i = 0; i < digits.length; i++) {
                    s += digits[i];
                }
                String sum = String.valueOf(Integer.parseInt(s) + 1);
                for (int i = 0; i < digits.length; i++) {
                    digits[i] = Integer.parseInt(String.valueOf(sum.charAt(i)));
                }
                return digits;
            } else {
                int sum = digits[digits.length - 1] + 1;
                boolean b = true;
                if (sum < 10) {
                    digits[digits.length - 1] = sum;
                    return digits;
                } else {
                    for (int i = 1; i < 9; i++) {
                        if (b) {
                            sum -= 10;
                            ++tmp;
                            digits[digits.length - i] = sum;
                            b = false;
                        } else {
                            digits[digits.length - i] += sum + tmp;
                            tmp = 0;
                        }
                    }

                }
            }
            return digits;
        }
}



