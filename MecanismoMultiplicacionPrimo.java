
/**
 * Write a description of class MecanismoMultiplicacionPrimo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MecanismoMultiplicacionPrimo extends Mecanismo
{
    /**
     * Constructor for objects of class MecanismoMultiplicacionPrimo
     */
    public MecanismoMultiplicacionPrimo(int x)
    {
        super(x);
    }
    
    
    @Override
    public int encripta(int numeroAEncriptar){
        int resultado = -1;
        if (numeroAEncriptar > 10){
            resultado = getX() * numeroAEncriptar;
        }
        return resultado;
    }
    
    @Override
    public int desencripta(int numeroADesencriptar){
        int resultado = numeroADesencriptar / getX();
        if (resultado <= 10){
            resultado = -1;
        }
        return resultado;
    }
}
