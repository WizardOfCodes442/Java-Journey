public class IFTest2 {
    public static void main (String args[]) {
        DynamicStack mystack1 = new DynamicStack(5);
        DynamicStack mystack2 = new DyanmicStack(8);

        // these loops cause each stack to grow
        for (int i=0; i <12; i++) mystack1.push(i);
        for (int i = 0; i < 20; i++) mystack2.push(i);

        System.out.println("Stack in mystack1");
        for (int i = 0; i < 12; i++)
            System.out.println(mystack1.pop());
        
        System.out.println("Stack in mystack2: ");
        for (int i =0; i < 20; i++)
            System.out.println(mystack2.pop());
    }
}
