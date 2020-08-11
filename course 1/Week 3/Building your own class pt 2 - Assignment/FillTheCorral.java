package mooc.vandy.java4android.gate.logic;

import java.util.Random;

import mooc.vandy.java4android.gate.ui.OutputInterface;

/**
 * This class uses your Gate class to fill the corral with snails.  We
 * have supplied you will the code necessary to execute as an app.
 * You must fill in the missing logic below.
 */
public class FillTheCorral {
    /**
     * Reference to the OutputInterface.
     */
    private OutputInterface mOut;

    /**
     * Constructor initializes the field.
     */
    FillTheCorral(OutputInterface out) {
        mOut = out;
    }

    // TODO -- Fill your code in here

    public void setCorralGates(Gate[] gate, Random selectDirection) {
        // set gate directions enter and exit
        mOut.println("Initial gate setup:");
        for (int i = 0; i < gate.length; i++) {
            gate[i].setSwing(selectDirection.nextInt(3) - 1);
            mOut.println("Gate " + i + ": " + gate[i].toString());
        }
    }

    public boolean anyCorralAvailable(Gate[] corral) {
        // return true if any gate is set to swing in position otherwise false
        boolean available = false;
        for (int i = 0; i < corral.length; i++) {
            if(corral[i].getSwingDirection() == Gate.IN) {
             available = true;
            }
        }
        return available;
    }

    public int corralSnails(Gate[] corral, Random rand) {

        int snails = 5; // total snails
        int attempts = 0;

        do {
            // random gate
           int randomCorral = rand.nextInt(corral.length);
           int randomNumber = rand.nextInt(snails) + 1;
            Gate G = corral[randomCorral];
            mOut.println(randomNumber + " are trying to move through corral " + randomCorral);
            snails = snails - G.thru(randomNumber);
            attempts++;
        } while(snails > 0);

        mOut.println("It took " + attempts + " attempts to corral all of the snails.");
        return attempts;
    }
}
