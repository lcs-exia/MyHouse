

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
    private Tree tree1;
    private Square sky;
    private Bird bird1;
    private Bird bird2;
    private Bird bird3;
    private Bird bird4;
    private Bird bird5;
    private Bird bird6;
    private Circle hill4;
    private Circle hill5;
    private Tree tree2;
    private Tree tree3;
    private Tree tree4;
    


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
        hill4 = new Circle();
        hill5 = new Circle();
        door = new Square();
        window = new Square();
        window2 = new Square();
        //tree1 = new Tree(0,0);
        sky = new Square();
   
        
        // invoke the method to draw the house
        drawHouse();
        bird1 = new Bird(200,50);
        tree1 = new Tree(0,50);
        bird2 = new Bird(250,50);
        bird3 = new Bird(300,50);
        bird4 = new Bird(350,50);
        bird5 = new Bird(200,-25);
        bird6 = new Bird(225,-75);
        tree2 = new Tree(200,60);
        tree3 = new Tree(450,100);
        tree4 = new Tree(525,150);
    }

    /**
     * Draw the house for us.
     */
    public void drawHouse()
    {
        // Draw sky
        sky.changeColor("blue");
        sky.changeSize(600);
        sky.makeVisible();
        sky.moveVertical(-50);
        sky.moveHorizontal(-60);
        
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
        hill.changeSize(450);
        hill.moveVertical(125);
        hill.moveHorizontal(-150);
        hill.changeColor("green");
        hill.makeVisible();
        
        hill2.changeSize(450);
        hill2.changeColor("green");
        hill2.moveVertical(125);
        hill2.moveHorizontal(-75);
        hill2.makeVisible();
        
        hill3.changeSize(450);
        hill3.changeColor("green");
        hill3.moveVertical(125);
        hill3.makeVisible();
        
        hill4.changeSize(450);
        hill4.changeColor("green");
        hill4.makeVisible();
        hill4.moveVertical(150);
        hill4.moveHorizontal(100);
        
        hill5.changeSize(500);
        hill5.changeColor("green");
        hill5.makeVisible();
        hill5.moveVertical(175);
        hill5.moveHorizontal(150);
        
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
