import javax.swing.JFrame;
import java.awt.Container;
import javax.swing.JButton;


public class PackedFrame {
  public static void main(String[] args) {
    JFrame frame = new JFrame("Adding Components to JFrame");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // Add a close button 
    JButton closeButton = new JButton("Close");
    Container contentPane = frame.getContentPane();
    contentPane.add(closeButton);

    //calculates and sets appropriate size for the frame
    frame.pack();

    frame.setVisible(true);
  }  
}
