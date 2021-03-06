/*
* This class contains a set of constructors. Each constructor initializes some or all of 
* the rectangle's member variables. The constructors provide a default value for any 
* member variable whose initial value is not provided by an argument. For example, 
* the no-argument constructor creates a 1x1 Rectangle at coordinates 0,0. The 
* two-argument constructor calls the four-argument constructor, passing in the width 
* and height but always using the 0,0 coordinates. As before, the compiler determines 
* which constructor to call, based on the number and the type of arguments.
*/


public class RectangleThisWithConstructure {
    private int x, y;
    private int width, height;
        
    public Rectangle() {
        this(0, 0, 1, 1);
    }
    public Rectangle(int width, int height) {
        this(0, 0, width, height);
    }
    public Rectangle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
    ...
}