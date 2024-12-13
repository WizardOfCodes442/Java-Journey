/** Class for object that can be sold selled and shipped */
public class BoxedItem implements Sellable, Transportable {
    private String descript;   // description of this item
    private int price;         // list price in cents
    private int weight;        // weight in grams
    private boolean haz;      // true if object is hazardous
    private int height = 0;
    private int width = 0;
    private int depth = 0;
    
    /** constructor */
    public BoxedItem(String desc, int p, int w, int h ){
        descript = desc;
        price = p;
        weight = w;
        haz = h;

    }

    public String description() { return descript; }
    public int listPrice() { return price; }
    public int lowestPrice() { return price/2; }
    public int weight()      { return weight; }
    public boolean isHazardous() { return haz; }
    public int insuredValue() { return price*2; }
    public void setBox(int h, int w, int d){
        height = h;
        width = w;
        depth = d;
    }
}   