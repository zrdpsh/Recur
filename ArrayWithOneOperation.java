public class ArrayWithOneOperation {
    private int lengthCounter;
    private int[] innerContainer;

    public static void main(String[] args) {

    }

    ArrayWithOneOperation(int[] givenArray) {
        innerContainer = givenArray;
        lengthCounter = givenArray.length;
    }

    public void pop() {
        if (this.getLength() == 0) return;

        System.out.println(innerContainer[innerContainer.length - lengthCounter]);
        lengthCounter -= 1;
    }

    public int getLength() {
        return this.lengthCounter;
    }
}









