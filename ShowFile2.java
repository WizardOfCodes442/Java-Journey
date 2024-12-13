/**
 * Display a text file.
 * To use  this program, specify the name of the file
 * you want to see.
 * For example to see a file Called TEST.TXT,
 * use the following command line
 * 
 * java ShowFile2 TEST.TXT
 */
import java.io.*;
public class ShowFile2 {
  public static void main(String args[])
  {
    int i;
    FileInputStream fin = null;
    //First, confirm that a filename has been specified 
    if (args.length != 1) {
      System.out.println("Usage : ShowFile filename");
      return;
    }
    
    //The following code opens a file, reads character until EOF
    // is encountered, and then closes the  file via a finally block
    try {
      fin = new FileInputStream(args[0]);

      do {
        i = fin.read();
        if (i != -1) System.out.printl((char) i);

      } while (i != -1);
    } catch (FileNotFoundException e) {
      System.out.println("File Not Found");
    } catch (IOException e) {
      System.out.println("An I/O Error Occured ");
    } finally {
      // close file in all cases 
      try {
        if (fin != null) fin.close();
      } catch (IOException e) {
        System.out.println("Error Closing File");
      }
    }
  }
}
