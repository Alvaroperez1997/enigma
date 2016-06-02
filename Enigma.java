
/**
 * Write a description of class Enigma here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enigma
{
    /**
     * Constructor for objects of class Enigma
     */
    public Enigma()
    {
        
    }

    /**
     * 
     */
    public int encripta(Mecanismo mecanismo,int num){
        return mecanismo.encripta(num);
    }
    
    public int desencripta(Mecanismo mecanismo, int num){
        return mecanismo.desencripta(num);
    }
}
