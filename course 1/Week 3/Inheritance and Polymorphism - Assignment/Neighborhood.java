package mooc.vandy.java4android.buildings.logic;

import java.io.FileNotFoundException;

import mooc.vandy.java4android.buildings.ui.OutputInterface;

/**
 * This Neighborhood utility class provides static helper methods the
 * print a Building List and calculate the area of a Building list.
 * A utility class in Java should always be final and have a private
 * constructor, as per https://en.wikipedia.org/wiki/Utility_class.
 */
public final class Neighborhood {

    // TODO - Put your code here.

    // print method
    public static void print(Building[] buildings, String header, OutputInterface out) {
        calcArea(buildings); // buildings object passed to calc area
        out.println(header); // print Houses or Offices
        out.println("-------");

        // print toString
        for(int i = 0; i < buildings.length; i++) {
            out.println(buildings[i].toString());
        }
    }

    // return total lot area
    public static int calcArea(Building[] buildings) {
        int total = 0;
        for(int i = 0; i < buildings.length; i++) {
            total += buildings[i].calcLotArea();
        }
        return total;
    }
    
}
