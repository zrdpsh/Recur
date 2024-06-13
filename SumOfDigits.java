public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(sumOfDigits(111));
        System.out.println(sumOfDigits(11));
        System.out.println(sumOfDigits(10000000000));
        System.out.println(sumOfDigits(10000000001));
        System.out.println(sumOfDigits(0));
        System.out.println(sumOfDigits(-1));
        System.out.println(sumOfDigits(171717));

    }

    public static int sumOfDigits(int exploredNumber) {
        int lastDigit = exploredNumber % 10;

        int dividedNumber = exploredNumber / 10;
        if (dividedNumber == 0) return lastDigit;

        return lastDigit + sumOfDigits(dividedNumber);
    }
}









