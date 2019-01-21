
/**
 * Creates an instance of a Tree.
 *
 * @author Eric Xia
 * @version January 15, 2019
 */
public class Tree
{
    // instance variables - replace the example below with your own
    private Triangle top;
    private Triangle middle;
    private Triangle bottom;
    private Square trunk;

    /**
     * Constructor for objects of class Tree
     * 
     * @param x     the horizontal position of the tree
     * @param y     the vertical position of the tree
     */
    public Tree(int x, int y)
    {
        // initialise instance variables
        top = new Triangle();
        middle = new Triangle();
        bottom = new Triangle();
        trunk = new Square();
        
        // actually draw the tree
        drawTree(x, y);
    }

    /**
     * Draws the tree
     *
     * @param x     the horizontal position of the tree
     * @param y     the vertical position of the tree
     */
    public void drawTree(int x, int y)
    {
        // draw tree
        top.changeColor("green");
        top.changeSize(50,100);
        top.makeVisible();
        // translate horizontally and vertically by x and y
        top.moveHorizontal(x);
        top.moveVertical(y);
        
        middle.changeColor("green");
        middle.changeSize(70, 120);
        middle.moveVertical(20);
        middle.makeVisible();
        // translate horizontally and vertically by x and y
        middle.moveHorizontal(x);
        middle.moveVertical(y);
        
        bottom.changeColor("green");
        bottom.changeSize(90, 140);
        bottom.moveVertical(40);
        bottom.makeVisible();
        // translate horizontally and vertically by x and y
        bottom.moveHorizontal(x);
        bottom.moveVertical(y);
        
        // Draw trunk
        trunk.changeColor("brown");
        trunk.changeSize(40);
        trunk.moveVertical(95);
        trunk.moveHorizontal(-30);
        trunk.makeVisible();
        // translate horizontally and vertically by x and y
        trunk.moveHorizontal(x);
        trunk.moveVertical(y);
        
        // translate the tree to the specified location
        
    }
    
}