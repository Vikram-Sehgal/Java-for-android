package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Multiply operation.
 */
public class Multiply implements CalculateInterface {
    // TODO -- start your code here

    // private fields
    private int valueOne;
    private int valueTwo;

    // constructor
    public Multiply(int valueOne, int valueTwo) {
        this.valueOne = valueOne;
        this.valueTwo = valueTwo;
    }


    // return multiplication of two values
    public int calculate() {
        return (this.valueOne * this.valueTwo);
    }
}
