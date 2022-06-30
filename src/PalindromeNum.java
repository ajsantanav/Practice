public class PalindromeNum {

    public static boolean isPalindrome(int x) {

//        int lengthX = String.valueOf(x).length();
        int remainder, reverseNum = 0, OgX = x;
//        for (int i = 0; i < lengthX-1; i++) {
//            remainder = x % 10;
//            reverseNum = reverseNum * 10 + remainder;
//            x = x / 10;
//        }
        if(x>=0)
        {
            while (x != 0) {
                remainder = x % 10;
                reverseNum = reverseNum * 10 + remainder;
                x = x / 10;
            }

            if (OgX == reverseNum)
                return true;
            else
                return false;
        }
        else
        {
            return false;
        }

    }


    public static void main(String[] args) {

        System.out.println(isPalindrome(-121));


    }
}
