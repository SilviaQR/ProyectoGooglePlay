
/**
 * Write a description of class Libro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Libro extends ProductoMultimedia
{
    // instance variables - replace the example below with your own
    protected int numPag;
    protected boolean esDeFiccion;

    /**
     * Constructor for objects of class Libro
     */
    public Libro(String nombreLibro, int anioEdicion, int numPag, boolean esDeFiccion)
    {
        super(nombreLibro, anioEdicion);
        this.numPag = numPag;
        this.esDeFiccion = esDeFiccion;
    }

    public int getNumeroPaginas()
    {
        return numPag;
    }
    
    public boolean getFiccion()
    {
        return esDeFiccion;
    }
    
    public String toString()
    {
        String textoADevolver = super.toString() + "\nNumero de paginas: " + numPag + ". \nEs de ficcion: " + esDeFiccion + ".";
        return textoADevolver;       
    }
    }
