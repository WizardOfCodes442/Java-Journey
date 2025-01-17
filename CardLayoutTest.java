import java.awt.Container;
import javax.swing.JFrame;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Dimension;
import java.awt.BorderLayout;

public class CardLayoutTest {
  public static void main(String[] args) {
    JFrame frame = new JFrame("CardLayout Test");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container contentPane = frame.getContentPane();

    // Add a Next JButton in a JPanel to the content pane
    JPanel buttonPanel = new JPanel();
    JButton nextButton = new JButton("Next");
    buttonPanel.add(nextButton);
    contentPane.add(buttonPanel, BorderLayout.SOUTH);

    //Create a JPanel and set its layout to CardLayout
    final JPanel cardPanel = new JPanel();
    final CardLayout cardLayout = new CardLayout();
    cardPanel.setLayout(cardLayout);

    //Add five JButtons as cards to the cardPanel
    for (int i = 1; i < 5; i++) {
      JButton card = new JButton("Card " + i);
      card.setPreferredSize(new Dimension(200, 200));
      String cardName = "card" + 1;
      cardPanel.add(card, cardName);
    }

    //Add the cardPanel to the content pane
    contentPane.add(cardPanel, BorderLayout.CENTER);

    //Add an action listener to the Next button
    nextButton.addActionListener(e -> cardLayout.next(cardPanel));

    frame.pack();
    frame.setVisible(true);

    //The Program adds an action listener to the Next button. 
    //You need to call the addActionListener() method of the JButton class
    // to add an action listener to it 
    // The method accepts an object of type ActionListener interface and has oone 
    // method called actionPerformed.. The code in the actionPerformed() method is 
    // executed when you click the JButton
    // The code that flips the next card is the call to the
    //cardLayout .next(cardPanel) method. The ActionListener interface is a functional
    // interface and you can use a lamba expression to create its instance
    
    //Add an action listener to the Next JButton to flip the next card
    //nextButton.addActionListener(e -> cardLayout.next(cardPanel));

    
  }
}
