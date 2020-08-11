package mooc.vandy.java4android.buildings.logic;

import java.util.Objects;

/**
 * This is the office class file, it is a subclass of Building.
 */
public class Office extends Building {

    // TODO - Put your code here.

    // private fields
    private String mBusinessName;
    private int mParkingSpaces;
    private static int sTotalOffices;

    // constructors
    public Office(int length, int width, int lotLength, int lotWidth) {
        super(length, width, lotLength, lotWidth);
        sTotalOffices++; // increment by 1
    }

    public Office(int length, int width, int lotLength, int lotWidth, String businessName) {
        super(length, width, lotLength, lotWidth);
        this.mBusinessName = businessName;
        sTotalOffices++;
    }

    public Office(int length, int width, int lotLength, int lotWidth,
                  String businessName, int parkingSpaces) {
        super(length, width, lotLength, lotWidth);
        this.mBusinessName = businessName;
        this.mParkingSpaces = parkingSpaces;
        sTotalOffices++;
    }

    // Accessor methods
    public String getBusinessName() {
        return this.mBusinessName;
    }

    public int getParkingSpaces() {
        return this.mParkingSpaces;
    }

    // Mutator methods
    public void setBusinessName(String name) {
        this.mBusinessName = name;
    }

    public void setParkingSpaces(int space) {
        this.mParkingSpaces = space;
    }

    // overridden methods
    public String toString() {
        String name = "Business: ";
        if(getBusinessName() == null) {
            name += "unoccupied";
        } else
            name += getBusinessName();

        if(getParkingSpaces() > 0)
            name += "; has " + getParkingSpaces() + " parking spaces";

        return (name += " (total offices: " + sTotalOffices + ")");
    }

    public boolean equals(Object obj) {
        if(obj instanceof Office) {
            Office office = (Office) obj;
            return (office.calcBuildingArea() == this.calcBuildingArea() &&
                    office.getParkingSpaces() == this.getParkingSpaces());
        }
        return false;
    }
}
