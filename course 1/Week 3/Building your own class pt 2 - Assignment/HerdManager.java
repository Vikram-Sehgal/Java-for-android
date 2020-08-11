package mooc.vandy.java4android.gate.logic;

import java.util.Random;

import mooc.vandy.java4android.gate.ui.OutputInterface;

/**
 * This class uses your Gate class to manage a herd of snails.  We
 * have supplied you will the code necessary to execute as an app.
 * You must fill in the missing logic below.
 */
public class HerdManager {
    /**
     * Reference to the output.
     */
    private OutputInterface mOut;

    /**
     * The input Gate object.
     */
    private Gate mEastGate;

    /**
     * The output Gate object.
     */
    private Gate mWestGate;

    /**
     * Maximum number of iterations to run the simulation.
     */
    private static final int MAX_ITERATIONS = 10;

    /**
     * Constructor initializes the fields.
     */
    public HerdManager(OutputInterface out,
                       Gate westGate,
                       Gate eastGate) {
        mOut = out;

        mWestGate = westGate;
        mWestGate.open(Gate.IN);

        mEastGate = eastGate;
        mEastGate.open(Gate.OUT);
    }

    // TODO -- Fill your code in here

    public static final int HERD = 24;

    public void simulateHerd(Random rand) {
        int snailsIn = HERD; // snails in pen
        int snailsOut = 0; // snails in pasture
        boolean bool;

        mOut.println("There are currently " + snailsIn +
                " snails in the pen and " + snailsOut + " snails in the pasture");

        for (int i = 0; i < MAX_ITERATIONS; i++) {

            // if pasture is empty
            // no snails in the pasture
            if (snailsOut == 0) {
                snailsOut = rand.nextInt(HERD) + 1;
                snailsIn += mEastGate.thru(snailsOut);
            }

            // if pen is empty
            // no snails in the pen
            else if(snailsIn == 0) {
                snailsOut = rand.nextInt(snailsOut) + 1;
                snailsIn += mWestGate.thru(snailsOut);
            } else {
                bool = rand.nextBoolean();
                // if bool is true then move them into the pasture
                if (bool) {
                    snailsOut = rand.nextInt(snailsIn) + 1;
                    snailsIn += mEastGate.thru(snailsOut);
                }
                // if bool is false then move them into the pen
                else {
                    snailsOut = rand.nextInt(snailsOut) + 1;
                    snailsIn += mWestGate.thru(snailsOut);
                }
            }

            snailsOut = HERD - snailsIn;
            mOut.println("There are currently " + snailsIn +
                    " snails in the pen and " + snailsOut + " snails in the pasture");
        }
    }
}
