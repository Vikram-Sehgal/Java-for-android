package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Divide operation.
 */
public class Divide implements CalculateInterface {
    // TODO -- start your code here

    // private fields
    private int valueOne;
    private int valueTwo;

    // constructor
    public Divide(int valueOne, int valueTwo) {
        this.valueOne = valueOne;
        this.valueTwo = valueTwo;
    }


    // return division
    public int calculate() {
        return (this.valueOne / this.valueTwo);
    }

    // return module % (remainder)
    public int remainder() {
        return (this.valueOne % this.valueTwo);
    }

}
