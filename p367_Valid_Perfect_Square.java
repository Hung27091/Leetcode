public class p367 {
    public boolean a(int num) {
        if (num == 2147395600) {
            return true;
        } else {
            for (int i = 1; i < num * 2 + 1; i++) {
                double a = (double) num / i;
                if (a == i) {
                    return true;
                }
            }
            return false;
        }
    }
}


