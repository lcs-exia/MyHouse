
/**
 * Creates an instance of a Bird.
 *
 * @author R. Gordon
 * @version January 15, 2019
 */
public class Bird
{
    // instance variables - replace the example below with your own
    private Circle edge;
    private Circle edge2;
    private Circle cover;
    private Circle cover2;

    /**
     * Constructor for objects of class Bird
     * 
     * @param x     the horizontal position of the bird
     * @param y     the vertical position of the bird
     */
    public Bird(int x, int y)
    {
        // initialise instance variables
        edge = new Circle();
        edge2 = new Circle();
        cover = new Circle();
        cover2 = new Circle();
        
        // actually draw the bird
        drawBird(x, y);
    }

    /**
     * Draws the bird
     *
     * @param x     the horizontal position of the bird
     * @param y     the vertical position of the bird
     */
    public void drawBird(int x, int y)
    {
        // put your code here
        edge.changeColor("black");
        edge.makeVisible();
        edge.changeSize(40);
        // move horizontally and vertically by x and y
        edge.moveHorizontal(x);
        edge.moveVertical(y);
        
        edge2.changeColor("black");
        edge2.makeVisible();
        edge2.changeSize(40);
        edge2.moveHorizontal(20);
        // move horizontally and vertically by x and y
        edge2.moveHorizontal(x);
        edge2.moveVertical(y);
        
        cover.changeColor("blue");
        cover.makeVisible();
        cover.changeSize(45);
        cover.moveVertical(5);
        // move horizontally and vertically by x and y
        cover.moveHorizontal(x);
        cover.moveVertical(y);
        
        cover2.changeColor("blue");
        cover2.makeVisible();
        cover2.changeSize(45);
        cover2.moveHorizontal(15);
        cover2.moveVertical(5);
        // move horizontally and vertically by x and y
        cover2.moveHorizontal(x);
        cover2.moveVertical(y);
        
        
        
        // translate the tree to the specified location
        
        
    }
    
}