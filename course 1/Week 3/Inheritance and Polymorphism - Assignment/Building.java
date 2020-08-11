package mooc.vandy.java4android.buildings.logic;

/**
 * This is the Building class file.
 */
public class Building {
    
    // TODO - Put your code here.

    // private fields
    private int mLength;
    private int mWidth;
    private int mLotLength;
    private int mLotWidth;

    // constructor
    public Building(int length, int width, int lotLength, int lotWidth) {
        this.mLength = length;
        this.mWidth = width;
        this.mLotLength = lotLength;
        this.mLotWidth = lotWidth;
    }

    // Accessor methods
    public int getLength() {
        return this.mLength;
    }

    public int getWidth() {
        return this.mWidth;
    }

    public int getLotLength() {
        return this.mLotLength;
    }

    public int getLotWidth() {
        return this.mLotWidth;
    }

    // Mutator methods
    public void setLength(int length) {
        this.mLength = length;
    }

    public void setWidth(int width) {
        this.mWidth = width;
    }

    public void setLotLength(int length) {
        this.mLotLength = length;
    }

    public void setLotWidth(int width) {
        this.mLotWidth = width;
    }

    // calculate area
    public int calcBuildingArea() {
       return this.mLength * this.mWidth;
    }

    public int calcLotArea() {
        return this.mLotLength * this.mLotWidth;
    }

    // overridden method
    public String toString() {
        return "";
    }

}
