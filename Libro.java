
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
    protected int vendido;

    /**
     * Constructor for objects of class Libro
     */
    public Libro(String nombreLibro, int anioEdicion, int numPag, boolean esDeFiccion)
    {
        super(nombreLibro, anioEdicion);
        this.numPag = numPag;
        this.esDeFiccion = esDeFiccion;
        vendido = 0;
    }

    public String getNombre()
    {
        return titulo;
    }
    
    public String getTitulo()
    {
        return titulo;
    }
    
    public int getNumeroPaginas()
    {
        return numPag;
    }
    
    public boolean getFiccion()
    {
        return esDeFiccion;
    }
    
    public void vendido()
    {
        vendido++;
    }
    
    public double getPrecio()
    {
        double precio = (numPag/100) * (2010 - anio);
        return precio;
    }
    
    public String toString()
    {
        String textoADevolver = super.toString() + "\nNumero de paginas: " + numPag + ". \nEs de ficcion: " + esDeFiccion + ".";
        return textoADevolver;       
    }
    }
