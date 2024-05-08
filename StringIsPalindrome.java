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
        return recurOverString(givenString, 0);
    }

    private static boolean recurOverString(String givenString, int beginIndex) {
        int leng = givenString.length()-beginIndex;

        if (leng == 0 || leng == 1) return true;
        if (givenString.charAt(beginIndex) != givenString.charAt(leng-1)) return false;

        return recurOverString(givenString, beginIndex+1);
    }
}










