// BoxLayoutGlueTest.java
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.Box;
import java.awt.BorderLayout;

public class BoxLayoutGlueTest {
  public static void  main(String args[]) {
    JFrame frame = new JFrame("BoxLayout with Glue");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    Container contentPane = frame.getContentPane();
    Box hBox = Box.createHorizontalBox();
    hBox.add(new JButton("<<First"));
    hBox.add(new JButton("<Previous"));
    hBox.add(new JButton("Next>"));
    hBox.add(new JButton("Last>>"));

    contentPane.add(hBox, BorderLayout.SOUTH);
    frame.pack();
    frame.setVisible(true);
  }  
}
