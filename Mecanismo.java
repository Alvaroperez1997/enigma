
/**
 * Write a description of class Mecanismo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Mecanismo
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Mecanismo
     */
    public Mecanismo(int x)
    {
        this.x = x;
    }
    
    public int getX(){
        return x;
    }
    
    public abstract int encripta(int y);
    
    public abstract int desencripta(int y);
}
