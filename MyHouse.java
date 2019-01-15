

/**
 * Write a description of class MyHouse here.
 *
 * @author Eric Xia
 * @version January 11, 2019
 */
public class MyHouse
{
    // instance variables - replace the example below with your own
    // ACCESS_MODIFIER TYPE NAME
    private Circle sun;
    private Triangle roof;
    private Square base;
    private Circle hill;
    private Circle hill2;
    private Circle hill3;
    private Square door;
    private Square window;
    private Square window2;


    /**
     * The job of a constructor is to initialize all the instance variables
     */
    public MyHouse()
    {
        // initialise instance variables
        sun = new Circle();
        roof = new Triangle();
        base = new Square(); 
        hill = new Circle();
        hill2 = new Circle();
        hill3 = new Circle();
        door = new Square();
        window = new Square();
        window2 = new Square();
        
        // invoke the method to draw the house
        drawHouse();
        
    }

    /**
     * Draw the house for us.
     */
    public void drawHouse()
    {
        // Put the sun in position 
        sun.changeColor("yellow");
        sun.moveHorizontal(-50);
        sun.moveVertical(-100);
        sun.changeSize(100);
        sun.makeVisible();
        
        // Draw roof
        roof.changeSize(75 , 150);
        roof.moveHorizontal(100);
        roof.changeColor("black");
        roof.makeVisible();
        
        // Draw hill
        hill.changeSize(400);
        hill.moveVertical(125);
        hill.moveHorizontal(-150);
        hill.changeColor("green");
        hill.makeVisible();
        
        hill2.changeSize(400);
        hill2.changeColor("green");
        hill2.moveVertical(125);
        hill2.moveHorizontal(-75);
        hill2.makeVisible();
        
        hill3.changeSize(400);
        hill3.changeColor("green");
        hill3.moveVertical(125);
        hill3.makeVisible();
        
        // Draw base
        base.changeColor("red");
        base.moveVertical(40);
        base.moveHorizontal(35);
        base.changeSize(100);
        base.makeVisible();
        
        // Draw door
        door.changeColor("black");
        door.changeSize(50);
        door.moveVertical(90);
        door.moveHorizontal(60);
        door.makeVisible();
        
        // Draw window
        window.changeColor("white");
        window.moveHorizontal(100);
        window.moveVertical(50);
        window.makeVisible();
        
        // Draw second window
        window2.changeColor("white");
        window2.moveVertical(50);
        window2.moveHorizontal(50);
        window2.makeVisible();
        
    }
}
