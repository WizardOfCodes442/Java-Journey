/** interface for object that can be transported */
public interface Transportable {
    /** Returns the weight in grams  */
    public int weight();

    /** Returns whether the object is hazardous */
    public boolean isHazardous();
    
}