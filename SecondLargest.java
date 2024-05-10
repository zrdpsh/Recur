public class SecondLargest {
    public static void main(String[] args) {


        System.out.println(secondLargest(new int[]{}));
        System.out.println(secondLargest(new int[]{1}));
        System.out.println(secondLargest(new int[]{1, 2}));
        System.out.println(secondLargest(new int[]{2, 1}));
        System.out.println(secondLargest(new int[]{1, -2, 299}));
        System.out.println(secondLargest(new int[]{-1, -2, -299}));
        System.out.println(secondLargest(new int[]{-2, -1, -299}));
        System.out.println(secondLargest(new int[]{1, 2, 3, 4, 5}));
        System.out.println(secondLargest(new int[]{2, 2, 2, 2, 5}));
        System.out.println(secondLargest(new int[]{2, 2, 2, 5, 5}));

    }

    public static int secondLargest(int[] givenArray) {

        if (givenArray.length == 0) return 0;
        if (givenArray.length == 1) return givenArray[0];

        if (givenArray[0] > givenArray[1])  return recurOverArray(givenArray, 1, givenArray[0], givenArray[1]);
        return recurOverArray(givenArray, 1, givenArray[1], givenArray[0]);
    }


    private static int recurOverArray(int[] givenArray, int index, int givenLargest, int givenSmaller) {

        if (index == givenArray.length) return givenSmaller;

        int previousLargest = givenLargest;
        int smaller = givenSmaller;
        int nextNumber = givenArray[index];

        int largest = nextNumber > givenLargest ? nextNumber : givenLargest;
        smaller = (previousLargest > smaller && largest == nextNumber && index != 1) ? previousLargest : smaller;

        return recurOverArray(givenArray, index+1, largest, smaller);

    }
}









