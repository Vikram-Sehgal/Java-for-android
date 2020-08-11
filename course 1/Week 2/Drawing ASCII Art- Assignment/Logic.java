package mooc.vandy.java4android.diamonds.logic;

import mooc.vandy.java4android.diamonds.ui.OutputInterface;

/**
 * This is where the logic of this App is centralized for this assignment.
 * <p>
 * The assignments are designed this way to simplify your early
 * Android interactions.  Designing the assignments this way allows
 * you to first learn key 'Java' features without having to beforehand
 * learn the complexities of Android.
 */
public class Logic
       implements LogicInterface {
    /**
     * This is a String to be used in Logging (if/when you decide you
     * need it for debugging).
     */
    public static final String TAG = Logic.class.getName();

    /**
     * This is the variable that stores our OutputInterface instance.
     * <p>
     * This is how we will interact with the User Interface [MainActivity.java].
     * <p>
     * It is called 'out' because it is where we 'out-put' our
     * results. (It is also the 'in-put' from where we get values
     * from, but it only needs 1 name, and 'out' is good enough).
     */
    private OutputInterface mOut;

    /**
     * This is the constructor of this class.
     * <p>
     * It assigns the passed in [MainActivity] instance (which
     * implements [OutputInterface]) to 'out'.
     */
    public Logic(OutputInterface out){
        mOut = out;
    }

    /**
     * This is the method that will (eventually) get called when the
     * on-screen button labeled 'Process...' is pressed.
     */
    public void process(int size) {
        int width = size * 2;
        int height = size * 2 - 1;
        int bottomPart = 0;

        for (int i = 1; i <= height; i++) {

            // box upper side
            if (i == 1) {
                box(i, size, width);
            }
            // print pipe symbol on upper left hand side
            printSymbol("|");

            if (i == size) { // center part
                // left hand side
                printSymbol("<");

                // print message based on line even or odd
                for (int j = 1; j <= (i - 1) * 2; j++) {
                    evenOdd(i);
                }
                // right hand side
                printSymbol(">|\n");

            } else if (i > size) { // bottom part

                // blank spaces bottom part left side
                bottomSpaces(i, size);

                // bottom part backward slash and forward slash
                printSymbol("\\");

                if (size == i - 1) {
                    bottomPart = (size - 2) * 2;
                }
                for (int v = bottomPart; v >= 1; v--) {
                    evenOdd(i);
                }
                bottomPart = bottomPart - 2;
                printSymbol("/");

                // blank spaces bottom part right side
                bottomSpaces(i, size);
                printSymbol("|\n");

            } else { // upper part

                // blank spaces upper part left side
                topSpaces(i, size);

                printSymbol("/");
                if (i != 1) {
                    for (int j = 1; j <= (i - 1) * 2; j++) {
                        evenOdd(i);
                    }
                }
                printSymbol("\\");

                // blank spaces upper part right side
                topSpaces(i, size);

                // box right side
                printSymbol("|\n");
            }

            // box bottom side
            if (i + 1 == size * 2) {
                box(i, size, width);
            }
        }
    }

    // print symbols
    public void printSymbol(String symbol) {
        mOut.print(symbol);
    }

    // diamond box
    public void box(int i, int size, int width) {
        printSymbol("+");
        for (int j = 1; j <= width; j++) {
            printSymbol("-");
        }
        printSymbol("+\n");
    }

    // ever or odd line printing message
    public void evenOdd(int i) {
        if (i % 2 == 0) {
            printSymbol("-");
        } else {
            printSymbol("=");
        }
    }

    // blank spaces top side
    public void topSpaces(int i, int size) {
        for (int j = size; j > i; j--) {
            mOut.print(" ");
        }
    }

    // blank spaces bottom side
    public void bottomSpaces(int i, int size) {
        for (int j = size; j < i; j++) {
            mOut.print(" ");
        }
    }
}
