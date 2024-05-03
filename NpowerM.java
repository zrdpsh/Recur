public class NpowerM {
    public static void main(String[] args) {
        exponent(2, 8);
        exponent(3, 4);
    }

    public static int exponent(int number, int power) {
        if (power == 0) return 1;
        return number*exponent(number, power - 1);
    }
}











