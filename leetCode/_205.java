package leetCode;

public class _205 {
    public static void main(String[] args) {
        System.out.println(isIsomorphic("egg", "add"));
    }

    public static boolean isIsomorphic(String s, String t) {
        if (s.substring(0,1).equals(t.substring(0,1))) {
            return false;
        }
        String copy = new String(s);
        for (int i = 0; i < s.length(); i++) {

            if (copy.charAt(i) != s.charAt(i)) {
                continue;
            }
            s = s.replaceAll(Character.toString(s.charAt(i)), Character.toString(t.charAt(i)));
            System.out.println(s);
        }
        return s.equals(t);
    }
}
