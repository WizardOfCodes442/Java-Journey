public class Photograph implements Sellable {
    private String descript;       //Description of this photograph
    private int price;             // the price we are setting 
    private boolean color;        //true if photo is in color


    public Photograph(String desc, int p, boolean p) {  //constructor
        descript = desc;
        price = p;
        color = c;

    }
    public String description() {return descript; }
    public int listPrice() { return price; }
    public int lowestPrice() {return price/2;}
    public boolean isColor() { return color;}
    
    
}