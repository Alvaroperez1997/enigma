
/**
 * Write a description of class MecanismoOffset here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MecanismoOffset extends Mecanismo
{
    /**
     * Constructor for objects of class MecanismoOffset
     */
    public MecanismoOffset(int x)
    {
        super(x);
    }

    @Override
    public int encripta(int numeroAEncriptar)
    {
        int numeroFinal = -1;
        if (numeroAEncriptar > 10){
            String numCadena = String.valueOf(numeroAEncriptar);
            char caracteres[] = numCadena.toCharArray();
            String cadenaFinal = "" + caracteres[0];
            int numero = 0;
            for(int i = 1; i < numCadena.length(); i++){
                numero = getX() + (caracteres[i]-48);
                if(numero >= 10){
                    numero = numero - 10;
                }
                cadenaFinal += String.valueOf(numero);
            }
            numeroFinal = Integer.parseInt(cadenaFinal);
        }
        return numeroFinal;
    }

    @Override
    public int desencripta(int numeroADesencriptar){
        int numeroFinal = 0;
        if (numeroFinal < 10) {
            String numCadena = String.valueOf(numeroADesencriptar);
            char caracteres[] = numCadena.toCharArray();
            String cadenaFinal = "" + caracteres[0];
            int numero = 0;
            for(int i = 1; i < numCadena.length(); i++){
                numero = (caracteres[i]-48) - getX();
                if(numero >= 10){
                    numero = numero - 10;
                }
                if(numero < 0){
                    numero = 10 + (numero);
                }
                cadenaFinal += String.valueOf(numero);
            }
            numeroFinal = Integer.parseInt(cadenaFinal);
            if (numeroFinal <= 10){
                numeroFinal = -1;
            }
        }
        return numeroFinal;
    }
}
