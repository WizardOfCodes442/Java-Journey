public class GridLayout {
  // A GridLayout arranges components in  a rectangular grid of equally 
  // sized cells. Each component is placed in exactly one cell. 
  // It does not respect the preferred size of the component 
  // It divides the available space into equally sized cells and resizes 
  // each component to the cell's size

  //You can specify either the number of rows or the number of columns
  // in the grid. If you specify both, only the number of rows is used 
  // and the number of columns is computed
  //Suppose ncomponents is the number of components 
  // added to the container and nrows and ncols are the specified 
  // number of rows and columns
  // If nrows is greater than zero, the number of columns in the grid 
  // is computed using the formula 

  ncols = (ncomponents +nrows - 1) / nrows;

  //If nrows is zero, the number of rows in the grid is computed
  // using the following formula
  nrows = (ncomponents +ncols - 1) /ncols;
  
  // You can not specify a negative number for  nrows or ncols, and 
  // at least one of them must be greater than zero
  // Otherwise a runtime  exception is thrown
  //You can create a GridLayout using one of the following three constructors 
  // of the GridLayout  class
  // GridLayout()
  // GridLayout(int rows, int cols)
  // GridLayout(int rows, int cols, int hgap, int vgap)

  // You can specify the number of rows, the number of column, a horizontal gap
  // and a vertical gap between two cells in the grid 
  // you can also set these properties using the methods setRows(), setColumns(),
  //setHgap(), and setVgap()
  // The noargs constructor creates a grid of one row 
  // The number of columns is thesame as the number of 
  // components added to the container

  //create a grid layout of 5 rows. specify 0 as the number of columns
  //The number of columns will be computed
  GridLayout gridLayout = new GridLayout(5, 0);

  //Create the grid layout of 3 columns. Specify 0 as the number of rows.
  //The number of rows will be computed 
  GridLayout gridLayout = new GridLayout(0, 3);

  //Create a grid layout with 2 rows and 3 columns. 
  // You have specified a non-zero value for rows
  // so the value for column will be ignored
  // It will be computed based on the number of components 
  GridLayout gridLayout = new GridLayout(2,3);
  //The third constructor lets you specify the number of rows or the number 
  // of columns, and horizontal and vertical gaps between two cells 
  // You can create a GridLayout of three rows with a horizontal gap 
  // of 10 pixels and a vertical gap of 20 pixels between cells
  GridLayout gridLayout = new GridLayout(3, 0, 10, 20);
  
  // A GridLayout is a simple layout manager to code by hand
  // However, it is not very powerful for two reasons
  // First it forces each component to have thesame size 

  // and second you cannot specify the row column mumber(or exact location )
  // of a component in the grid. That is, you can only add a component to the
  // GridLayout. They will be laid out horizontally , and then vertically 
  // in the order you add them to the container
  //If the container's orientation is LEFT_TO_RIGHT, component are laid out 
  // from left-to-right, and then top-to-botttom
  // one good use of the GridLayout is to create a group of buttons
  // of thesame size 
  // For example suppose  you add two buttons with the OK and Cancel to a container
  // and want them to have thesame size  you can achieve this by adding the buttons 
  // to a Container managed by GridLayout layout manager

  
}
