public class StringIsPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("", 0));
        System.out.println(isPalindrome("H", 0));
        System.out.println(isPalindrome("aba", 0));
        System.out.println(isPalindrome("google", 0));
        System.out.println(isPalindrome("abba", 0));
        System.out.println(isPalindrome("loooooooooool", 0));

    }

    public static boolean isPalindrome(String givenString, int beginIndex) {
        int leng = givenString.length()-beginIndex;

        if (leng == 0 || leng == 1) return true;
        if (givenString.charAt(beginIndex) != givenString.charAt(leng-1)) return false;

        return isPalindrome(givenString, beginIndex+1);
    }
}










