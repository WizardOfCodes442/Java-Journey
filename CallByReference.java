public class CallByReference {
    public static void main(String[] args){
        Test2 ob = new Test2(15, 10);
        System.out.println("ob.a and ob.b before call: " + ob.a + " " + ob.b);
        ob.meth(ob);
        System.out.println("ob.a and ob.b after call: " + ob.a + " " + ob.b);
    }
}