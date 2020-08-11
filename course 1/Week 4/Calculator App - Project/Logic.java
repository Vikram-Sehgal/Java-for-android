package mooc.vandy.java4android.calculator.logic;

import mooc.vandy.java4android.calculator.logic.Add;
import mooc.vandy.java4android.calculator.logic.Divide;
import mooc.vandy.java4android.calculator.logic.Multiply;
import mooc.vandy.java4android.calculator.logic.Subtract;
import mooc.vandy.java4android.calculator.ui.ActivityInterface;

/**
 * Performs an operation selected by the user.
 */
public class Logic 
       implements LogicInterface {
    /**
     * Reference to the Activity output.
     */
    protected ActivityInterface mOut;

    /**
     * Constructor initializes the field.
     */
    public Logic(ActivityInterface out){
        mOut = out;
    }

    /**
     * Perform the @a operation on @a argumentOne and @a argumentTwo.
     */
    public void process(int argumentOne,
                        int argumentTwo,
                        int operation){
        // TODO -- start your code here

        // instanceof classes
        Add add = new Add(argumentOne, argumentTwo);
        Subtract subtract = new Subtract(argumentOne, argumentTwo);
        Multiply multiply = new Multiply(argumentOne, argumentTwo);
        Divide divide = new Divide(argumentOne, argumentTwo);

        // perform an operation according to condition add,sub,multiply,division
        switch (operation) {
            case 1:
                // addition
                // use String.valueOf() method to convert integer value to string
                mOut.print(String.valueOf(add.calculate()));
                break;
            case 2:
                // subtraction
                mOut.print(String.valueOf(subtract.calculate()));
                break;
            case 3:
                // multiply
                mOut.print(String.valueOf(multiply.calculate()));
                break;
            case 4:
                try {
                    // throw exception (error) if argument two is 0
                    if (argumentTwo == 0)
                        throw new IllegalArgumentException("Error : division by 0 is not valid");
                    else
                        // There is no need of String.valueOf() method
                        // because when integer plus string "R" automatic converted to string
                        mOut.print(divide.calculate() + " R: " + divide.remainder());
                } catch (Exception e) {
                    // catch error and print error message
                    mOut.print(e.getMessage());
                }
                break;

             // if operation not matched print default message
            default: mOut.print("Invalid operation");
        }
    }
}
