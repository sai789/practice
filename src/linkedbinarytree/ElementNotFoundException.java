package linkedbinarytree;

public class ElementNotFoundException extends RuntimeException
{
    //------------------------------------------------------------------
    //  Sets up this exception with an appropriate message.
    //------------------------------------------------------------------
    public ElementNotFoundException (String message)
    {
        super (message);
    }
}