//AddingComponentToJFrame.java

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Container;
public class AddingComponentToJFrame {
  public static void main(String[] args) {
    JFrame frame = new JFrame("Adding Component to JFrame");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container contentPane = frame.getContentPane();

    //Add a close button
    JButton closeButton = new JButton("Close");
    contentPane.add(closeButton);

    //Set the size of the frame300 * 200\
    frame.setBounds(50, 50, 300, 200);
    frame.setVisible(true);
  }
}
