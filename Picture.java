/**
 * Two people throwing a triangle. 
 *
 * @author: Omar Malik
 *
 * @version 2023.09.08
 */
public class Picture
{
    private Circle sun;
    private Square grass;
    private Square sky;
    private Person person1;
    private Person person2;
    private Triangle triangle; // Add a Triangle object
    private Circle cloud1; // First circle for the cloud
    private Circle cloud2; // Second circle for the cloud
    private Circle cloud3; // Third circle for the cloud
    private boolean drawn;

    public Picture()
    { 
        sun = new Circle();
        grass = new Square();
        sky = new Square();
        person1 = new Person();
        person2 = new Person();
        triangle = new Triangle(); // Initialize the triangle
        cloud1 = new Circle(); // Initialize the first circle for the cloud
        cloud2 = new Circle(); // Initialize the second circle for the cloud
        cloud3 = new Circle(); // Initialize the third circle for the cloud
        drawn = false;
    }

    public void draw()
    {
        if (!drawn) {
            // Draw the sky 
            sky.changeColor("blue");
            sky.moveHorizontal(-320);
            sky.moveVertical(-140);
            sky.changeSize(1000);
            sky.makeVisible();

            // Draw the grass 
            grass.changeColor("green");
            grass.moveHorizontal(-320);
            grass.moveVertical(140);
            grass.changeSize(1000);
            grass.makeVisible();

            // Move the sun 
            sun.changeColor("yellow");
            sun.moveHorizontal(200);
            sun.moveVertical(-40);
            sun.changeSize(80);
            sun.makeVisible();
            
            // Draw the first person 
            person1.moveHorizontal(-120);
            person1.moveVertical(30);
            person1.makeVisible();

            // Draw the triangle 
            triangle.changeColor("red"); // Set the color of the triangle
            triangle.changeSize(20, 20); // Set the size of the triangle
            triangle.moveHorizontal(10); // Adjust horizontal position between persons
            triangle.moveVertical(25); // Adjust position between persons
            triangle.makeVisible();

            // Draw the second person 
            person2.moveHorizontal(50);
            person2.moveVertical(30);
            person2.makeVisible();

            // Draws the clouds
            cloud1.changeColor("white"); // Set the color of the cloud
            cloud1.changeSize(40); // Set the size of the first circle
            cloud1.moveHorizontal(-100); // Adjust horizontal position for the first circle
            cloud1.moveVertical(-50); // Adjust vertical position for the first circle
            cloud1.makeVisible();

            cloud2.changeColor("white");
            cloud2.changeSize(40);
            cloud2.moveHorizontal(-80); // Adjust horizontal position for the second circle
            cloud2.moveVertical(-50); // Adjust vertical position for the second circle
            cloud2.makeVisible();

            cloud3.changeColor("white");
            cloud3.changeSize(40);
            cloud3.moveHorizontal(-60); // Adjust horizontal position for the third circle
            cloud3.moveVertical(-50); // Adjust vertical position for the third circle
            cloud3.makeVisible();

            drawn = true;
        }
    }

    public void setBlackAndWhite()
    {
        sun.changeColor("black");
        grass.changeColor("black");
        sky.changeColor("black");
        person1.changeColor("black");
        person2.changeColor("black");
        triangle.changeColor("black"); // Set the triangle color to black
        cloud1.changeColor("black"); // Set the cloud color to black
        cloud2.changeColor("black");
        cloud3.changeColor("black");
    }

    public void setColor()
    {
        sun.changeColor("yellow");
        grass.changeColor("green");
        sky.changeColor("blue");
        person1.changeColor("black");
        person2.changeColor("black");
        triangle.changeColor("red");
        cloud1.changeColor("white"); // Set the cloud color to white
        cloud2.changeColor("white");
        cloud3.changeColor("white");
    }
}
