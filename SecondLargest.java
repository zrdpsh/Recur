public class SecondLargest {
    public static void main(String[] args) {


        System.out.println(secondLargest(new int[]{}));
        System.out.println(secondLargest(new int[]{1}));
        System.out.println(secondLargest(new int[]{1, 2}));
        System.out.println(secondLargest(new int[]{2, 1}));
        System.out.println(secondLargest(new int[]{3, 4, 5}));
        System.out.println(secondLargest(new int[]{4, 4, 5}));
        System.out.println(secondLargest(new int[]{4, 5, 5}));
        System.out.println(secondLargest(new int[]{1, -2, 299}));
        System.out.println(secondLargest(new int[]{-1, -2, -299}));
        System.out.println(secondLargest(new int[]{-2, -1, -299}));
        System.out.println(secondLargest(new int[]{-3, -1, -299, -501, -10000000, -2}));



    }

    public static int secondLargest(int[] givenArray) {

        if (givenArray.length == 0) return 0;
        if (givenArray.length == 1) return givenArray[0];

        if (givenArray[0] >= givenArray[1])  return recurOverArray(givenArray, 2, givenArray[0], givenArray[1]);
        return recurOverArray(givenArray, 2, givenArray[1], givenArray[0]);
    }


    private static int recurOverArray(int[] givenArray, int index, int givenLargest, int givenSmaller) {

        if (index == givenArray.length) return givenSmaller;

        int largest = givenLargest;
        int previousLargest = givenLargest;
        int smaller = givenSmaller;
        int nextNumber = givenArray[index];

        if (nextNumber >= previousLargest) {
            largest = nextNumber;
            smaller = previousLargest;
        }

        if (nextNumber < previousLargest && nextNumber >= smaller) smaller = nextNumber;

        return recurOverArray(givenArray, index+1, largest, smaller);

    }
}









