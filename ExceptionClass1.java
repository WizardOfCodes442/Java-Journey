import java.io.FileNotFoundException;

import sun.tools.tree.FinallyStatement;

public class ExceptionClass1 
{
    static int getNumber(boolean b)
    {
        try
        {
            System.out.print("A");
            compute();
            System.out.print("B");
            if (b) return 456;
        }
        catch (FileNotFoundException e)
        {
            System.out.print("C");
            return -123;
        }
        catch 
        {
            System.out.print("D");
            return -953;

        }
        finally
        {
            System.out.print("E");
        }
    }
}