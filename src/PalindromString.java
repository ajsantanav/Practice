import java.util.Locale;

public class PalindromString {

    public static boolean isPalindrome(String s) {

//        s=((s.replaceAll("[^a-zA-Z0-9]","").trim()).toLowerCase());
        s = s;
        s = s.replaceAll("[^a-zA-Z0-9]","");
        s = s.trim();
        s = s.toLowerCase();

        String reverse = "";
        int lengthS = s.length();

        for (int i = lengthS; lengthS > 0; lengthS--) {
            reverse = reverse + s.charAt(lengthS - 1);
        }

        if (s.equals(reverse))
            return true;
        else
            return false;
    }


    public static void main(String[] args) {

        String s = "A man, a plan, a canal: Panama";

        System.out.println(isPalindrome(s));

    }
}
