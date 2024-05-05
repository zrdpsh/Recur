public class OnlyEvenNumbers {
    public static void main(String[] args) {
        onlyEvenNumbers(new int[]{1, 2, 3, 4, 5}, 0);
        System.out.println();
        onlyEvenNumbers(new int[]{2, 2, 2, 2, 2}, 0);
        System.out.println();
        onlyEvenNumbers(new int[]{1, 1, 1, 1, 1}, 0);
        System.out.println();
        onlyEvenNumbers(new int[]{1}, 0);
        System.out.println();
        onlyEvenNumbers(new int[]{},0);
        System.out.println();

    }

    public static void onlyEvenNumbers(int[] givenArray, int index) {
        if (givenArray.length == index) return;

        int givenNumber = givenArray[index];
        if (givenNumber % 2 == 0) System.out.print(givenNumber + " ");

        onlyEvenNumbers(givenArray, index+1);
    }

}
