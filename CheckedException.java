import java.io.*;
public class CheckedException {
    public static void main(String args) throws IOException {
        FileReader file = new FileReader("C:\\test\a.txt");
        BufferedReader fileInput = new BufferedReader(file);

        // print first 3 lines of the file C:\\test\a.txt
        for (int i = 0; i < 3; i++) {
            System.out.println(fileInput.readline());
        }

        fileInput.close();
    }
}
