public class OnlyEvenIndices {
    public static void main(String[] args) {
        onlyEvenIndices(new int[]{1, 2, 3, 4, 5});
        System.out.println();
        onlyEvenIndices(new int[]{2, 4, 16, 32, 128});
        System.out.println();
        onlyEvenIndices(new int[]{1, 11, 1111, 111, 1});
        System.out.println();
        onlyEvenIndices(new int[]{1});
        System.out.println();
        onlyEvenIndices(new int[]{});
        System.out.println();

    }

    public static void onlyEvenIndices(int[] givenArray) {
        recurOverArray(givenArray, 0);
    }

    private static void recurOverArray(int[] givenArray, int index) {
        if (givenArray.length <= index) return;

        System.out.print(givenArray[index] + " ");

        recurOverArray(givenArray, index+2);
    }










