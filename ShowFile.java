/**
 * Display a text file.
 * To use this program, specify the name.
 * of the fike that you want to see.
 * for example, to see a file called TEST.TXT
 * use the following command line.
 * 
 * java ShowFile TEST.TXT
 */

import java.io.*;
public class ShowFile {
  public static void main(String args[]) {
    int i;
    FileInputStream fin;
    // first confirm that a filename has been specified 
    if (args.length != 1) {
      System.out.println("Usage: ShowFile filename");
      return;
    }
    // Attempt to open the file
    try {
      fin = new FileInputStream(args[0]);
    } catch (FileNotFoundException e) {
      System.out.println("Cannot Open File");
      return;
    }

    // At this point, the file is open and can be read 
    // The following read character until  EOF is encountered
    try {
      do {
        i = fin.read();
        if ( i != -1) System.out.print((char) i);
      } while (i != -1);
    } catch(IOException e) {
      System.out.println("Error Reading File");
    }
    // close the file
    try {
      fin.close()
    } catch(IOException e) {
      System.out.println("Error Closing File")
    }
  }
}
