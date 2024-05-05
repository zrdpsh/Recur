public class OnlyEvenIndices {
    public static void main(String[] args) {
        onlyEvenIndices(new int[]{1, 2, 3, 4, 5}, 0);
        System.out.println();
        onlyEvenIndices(new int[]{2, 4, 16, 32, 128}, 0);
        System.out.println();
        onlyEvenIndices(new int[]{1, 11, 1111, 111, 1}, 0);
        System.out.println();
        onlyEvenIndices(new int[]{1}, 0);
        System.out.println();
        onlyEvenIndices(new int[]{},0);
        System.out.println();

    }

    public static void onlyEvenIndices(int[] givenArray, int index) {
        if (givenArray.length == index) return;

        int givenNumber = givenArray[index];
        if (index % 2 == 0) System.out.print(givenNumber + " ");

        onlyEvenIndices(givenArray, index+1);
    }

}










