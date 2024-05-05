public class StringIsPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(""));
        System.out.println(isPalindrome("H"));
        System.out.println(isPalindrome("aba"));
        System.out.println(isPalindrome("google"));
        System.out.println(isPalindrome("abba"));
        System.out.println(isPalindrome("loooooooooool"));

    }

    public static boolean isPalindrome(String givenString) {
        int leng = givenString.length();

        if (leng == 0 || leng == 1) return true;
        if (givenString.charAt(0) != givenString.charAt(leng-1)) return false;

        String ss = givenString.substring(1,leng-1);
        return isPalindrome(ss);
    }
}










