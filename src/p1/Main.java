package p1;

public class Main
{

    public static void main(String[] args)
    {

        Balloon[] things = new Balloon[5];

        // Create the first balloon
        things[0] = new Balloon();

        // Create the second balloon
        things[1] = new Balloon(12, "Red");

        // Create the third balloon
        things[4] = new Balloon(8, "Orange");

        // Print the quantity of balloons
        System.out.println("Quantity produced = " + Balloon.getQuantity());

        // Destroy a balloon
        Balloon.destruct(1, things);

        // Print the quantity of balloons remaining
        System.out.println("Quantity remaining = " + Balloon.getQuantity());

        // Print the properties of the balloons
        for(int i = 0; i < things.length; i++)
        {
            if(things[i] != null)
            {
                System.out.printf("color = " + things[i].getColor() + " ");
                System.out.println("size = " + things[i].getSize() + " ");
            }// End if
        }// End for
    }
}

class Balloon {
    private int size;
    private String color;
    private static int quantity;

    // Constructor
    Balloon(int arg1, String arg2)
    {
        size = arg1;
        color = arg2;
        quantity ++;
    }

    // Default constructor
    Balloon()
    {
        size = 10;
        color = "Blue";
        quantity++;
    }

    // Get the size
    int getSize()
    {
        return size;
    }

    // Get the color
    String getColor()
    {
        return color;
    }

    // Get the quantity
    static int getQuantity()
    {
        return quantity;
    }

    // Destruct a balloon
    static void destruct(int i, Balloon[] arg)
    {
        arg[i] = null;
        quantity --;
    }


}
