public class GetArrayLength {
    public static void main(String[] args) {
        ArrayWithOneOperation a = new ArrayWithOneOperation(new int[] {1, 2, 3, 4});
        System.out.println("the length is " + getArrayLength(a));
        ArrayWithOneOperation b = new ArrayWithOneOperation(new int[] {1, 2, 3});
        System.out.println("the length is " + getArrayLength(b));
        ArrayWithOneOperation c = new ArrayWithOneOperation(new int[] {1});
        System.out.println("the length is " + getArrayLength(c));
        ArrayWithOneOperation d = new ArrayWithOneOperation(new int[] {});
        System.out.println("the length is " + getArrayLength(d));
    }

    private static int getArrayLength(ArrayWithOneOperation givenArray) {

        if (givenArray.getLength() == 0) return 0;
        givenArray.pop();

        return 1 + getArrayLength(givenArray);
    }
}









