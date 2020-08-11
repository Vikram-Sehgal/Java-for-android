package mooc.vandy.java4android.buildings.logic;

/**
 * This is the House class file that extends Building.
 */
public class House extends Building {
       
    // TODO - Put your code here.

    private String mOwner;
    private boolean mPool;

    // constructors
    public House(int length, int width, int lotLength, int lotWidth) {
        super(length, width, lotLength, lotWidth);
    }

    public House(int length, int width, int lotLength, int lotWidth, String owner) {
        super(length, width, lotLength, lotWidth);
        this.mOwner = owner;
    }

    public House(int length, int width, int lotLength, int lotWidth, String owner, boolean pool) {
        super(length, width, lotLength, lotWidth);
        this.mOwner = owner;
        this.mPool = pool;
    }

    // Accessor methods
    public String getOwner() {
        return this.mOwner;
    }

    public boolean hasPool() {
        return this.mPool;
    }

    // Mutator methods
    public void setOwner(String owner) {
        this.mOwner = owner;
    }

    public void setPool(boolean pool) {
        this.mPool = pool;
    }

    // overridden methods
    public String toString() {
        String name = "Owner: ";
        if(getOwner() == null)
            name += "n/a";
        else
            name += getOwner();

        if (hasPool())
            name += "; has a pool";

        if(calcLotArea() > calcBuildingArea())
            name += "; has a big open space";

        return name;
    }

    public boolean equals(Object obj) {
        if(obj instanceof House) {
           House other = (House) obj;
           return (other.calcBuildingArea() == this.calcBuildingArea() &&
                   other.hasPool() == this.hasPool());
        }
        return false;
    }

}
