package mooc.vandy.java4android.buildings.logic;

/**
 * This is the cottage class file.  It is a subclass of House.
 */
public class Cottage extends House {
       
    // TODO - Put your code here.

    // private field
    private boolean mSecondFloor;

    // constructors
    public Cottage(int dimension, int lotLength, int lotWidth) {
        super(dimension / 2, dimension / 2, lotLength, lotWidth);
    }

    public Cottage(int dimension, int lotLength, int lotWidth, String owner, boolean secondFloor) {
        super(dimension / 2, dimension / 2, lotLength, lotWidth, owner);
        this.mSecondFloor = secondFloor;
    }

    // Accessor method
    public boolean hasSecondFloor() {
        return this.mSecondFloor;
    }

    // overridden method
    public String toString() {
        String name = super.toString();

        if (hasSecondFloor()) {
           return name += "; is a two story cottage";
        } else
            return name += "; is a cottage";
    }
    
}
