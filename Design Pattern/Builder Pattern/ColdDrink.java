/**
STEP 3
Create abstract classes implementing the item interface providing default 
functionalities
*/
public abstract class ColdDrink implements Item {

    @Override 
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}