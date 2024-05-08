public class SecondLargest {
    public static void main(String[] args) {

        System.out.println(secondLargest(new int[]{}));
        System.out.println(secondLargest(new int[]{1}));
        System.out.println(secondLargest(new int[]{1, 2}));
        System.out.println(secondLargest(new int[]{1, -2, 299}));
        System.out.println(secondLargest(new int[]{1, 2, 3, 4, 5}));
        System.out.println(secondLargest(new int[]{2, 2, 2, 2, 5}));
        System.out.println(secondLargest(new int[]{2, 2, 2, 5, 5}));

    }

    public static int secondLargest(int[] givenArray) {
        return recurOverArray(givenArray, 0, 0, 0);
    }

    private static int recurOverArray(int[] givenArray, int index, int a, int b) {

        if (givenArray.length == 0) return 0;
        if (givenArray.length == 1) return 0;
        if (index == givenArray.length) return b;

        int largest = a;
        int previousLargest = largest;
        int smaller = b;
        int firstGiven = givenArray[index];

        largest = firstGiven >= largest ? firstGiven : largest;
        smaller = (previousLargest > smaller && previousLargest <= largest) ? previousLargest : smaller;


        return recurOverArray(givenArray, index+1, largest, smaller);

    }
}









