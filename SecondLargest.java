public class SecondLargest {
    public static void main(String[] args) {

        System.out.println(secondLargest(new int[]{1, 2, 3, 4, 5}, 0, 0, 0));
        System.out.println(secondLargest(new int[]{2, 2, 2, 2, 5}, 0, 0, 0));
        System.out.println(secondLargest(new int[]{2, 2, 2, 5, 5}, 0, 0, 0));
        System.out.println(secondLargest(new int[]{}, 0, 0, 0));
        System.out.println(secondLargest(new int[]{1}, 0, 0, 0));
        System.out.println(secondLargest(new int[]{1, 2}, 0, 0, 0));
        System.out.println(secondLargest(new int[]{1, -2, 299}, 0, 0, 0));
    }

  

    public static int secondLargest(int[] givenArray, int index, int a, int b) {

        if (givenArray.length == 0) return 0;
        if (givenArray.length == 1) return 0;
        if (index == givenArray.length) return b;

        int largest = a;
        int previousLargest = largest;
        int smaller = b;
        int givenElement = givenArray[index];

        largest = givenElement >= largest ? givenElement : largest;
        smaller = (previousLargest > smaller && previousLargest <= largest) ? previousLargest : smaller;

        return secondLargest(givenArray, index+1, largest, smaller);
    }
}









