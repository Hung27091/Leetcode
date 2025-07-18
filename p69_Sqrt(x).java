public class p69 {
    public int mySqrt(int x) {
        if(x == 0 || x == 1) {
            return x;
        }
        double s = (double) x / 2;
        double b = 1e-6;
        while (s * s - x > b || x - s * s > b) {
            s = (s + x / s) / 2;
        }
        return (int) s;
    }
}
