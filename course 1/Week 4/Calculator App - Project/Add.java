package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Add operation.
 */
public class Add implements CalculateInterface {
    // TODO -- start your code here

    // private fields
    private int valueOne;
    private int valueTwo;

    // constructor
    public Add(int valueOne, int valueTwo) {
        this.valueOne = valueOne;
        this.valueTwo = valueTwo;
    }


    // return addition of two values
    public int calculate() {
        return (this.valueOne + this.valueTwo);
    }

}
