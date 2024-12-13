public class GridBagLayout {
  //The gridBagLayout lays out the component in a grid of rectangular 
  // cells arranged in rows and column similar to the gridLayout
  //There are so many things you can customize in the GridBagLayout that
  // it becomes hard to learn and use all of its features quickly

  // It lets you cutomize many properties of the components, such as size,
  // alignment, expandability. Unlike the the GridLayout, all cells  
  // of do not have to be same size 
  // A component does not have to be placed exactly in one cell.
  // A component does not have to be placed exactly in one cell
  // A component can span multiple cells horizontally
  // as well as vertically
  // You can specify how a component inside its cell should be aligned
  // The GridBagLayout and GridBagConstraints classe are used while 
  // working with a GridBagLayout layout manager
  // Both classes are in the java.awt package. An object of the GridBagLayout 
  // class defines a GridBagLayout layout manager 
  // An object of the GridBagConstraints class define constraints for 
  // a component in a GridBagLayout. The constraints of a component
  //are used to lay out the component. 
  // Some of The constraint include the component's position in the grid, 
  // width, height, alingment  inside the cell, etc
  // The following snippet of code creates an object of the GridBagLayout class and sets it 
  // as the layout for a JPanel
  // create a JPanel container  
  JPanel panel = new JPanel();

  //Set GridBagLayout as the layout manager for the JPanel
  GridBagLayout gridBagLayout = new GridBagLayout();
  panel.setLayout(gridBagLayout);

  //Let's use the GridBagLayout in the simplest form:
  // create a frame, set the layout for its content pane
  //to GridBagLayout, and add nine buttons to the content pane


  //You can specify the cell in which a component in a GridBagLayout should 
  // be placed.
  //To specify the cell for a component, you need to call
  // the add (Component c, Object constraints) method, where the 
  // argument is an object of the GridBagConstraints class 
  // If you do not specify the constraint object for a component in a GridBagLayout
  // it places the component in the next cell.
  // The next cell is the cell after the cell that was used to place the previous component
  // If you do not use constraints for any components in a GridBagLayout, all the 
  // Component are placed in one row 
  // GridBagLayout, all components are placed in one row , as sho
}
