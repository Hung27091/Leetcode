public class p9 {
    public boolean a(int x){
        String s = Integer.toString(x);
        String a = "";
        for (int  j = s.length() -1; 0 <= j  ;j--) {
            a+=s.charAt(j);
        }
        System.out.println(a);
        return a.equals(s);
    }
}
