// Autoboxing / unboxing occurs inside the expressions
public class AutoBox3 {
    public static void main(String args[]) {
        Integer iOb, iOb2;
        int i;

        iOb = 100;
        System.out.println("Original value of iOb " + iOb);
        
        // The following automatically unboxes iOb,
        // performs the increment , and then reboxes 
        // the result back into iOb

        ++iOb;
        System.out.println("After ++iO " + iOb);

        //Here, iOb is unboxed , the expression is 
        // evaluated , the result is reboxed  and assigned 
        // iOb2
        iOb2 = iOb + (iOb / 3);
        System.out.println("iOb2 after the expression " + iOb2);

        //The same expression is evaluated , but the 
        // result is not reboxed 
        i = iOb + (iOb/ 3);
        System.out.println("i after expression : " + i);
    }
}
