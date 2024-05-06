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
        if (givenArray.length >= index) return;

        System.out.print(givenArray[index] + " ");

        onlyEvenIndices(givenArray, index+2);
    }


    
        public static boolean onlyEvenIndices2(int[] givenArray, int index)
        {
            int printedNumber = 0;
            String numberToString = "";

            boolean a = (index < givenArray.length) && (printedNumber = givenArray[index]) == givenArray[index];

            boolean b = (index < givenArray.length) && (numberToString = "" + printedNumber).equals("" + printedNumber);
            System.out.print(numberToString + " ");

            boolean c = (index < givenArray.length) && onlyEvenIndices2(givenArray, index+2);

            return a;
        }

}










