package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Subtract operation.
 */
public class Subtract implements CalculateInterface {
    // TODO -- start your code here

    // private fields
    private int valueOne;
    private int valueTwo;

    //constructor
    public Subtract(int valueOne, int valueTwo) {
        this.valueOne = valueOne;
        this.valueTwo = valueTwo;
    }


    // return subtraction of two values
    public int calculate() {
        return (this.valueOne - this.valueTwo);
    }
}
