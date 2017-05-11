
/**
 * Write a description of class ProductMultimedia here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ProductoMultimedia extends Producto
{
    protected String titulo;
    protected int anio;
    
    
    /**
     * Constructor for objects of class ProductMultimedia
     */
    public ProductoMultimedia(String titulo,int anio)
    {
        this.titulo = titulo;
        this.anio = anio;
       
    }

    public String getTitulo()
    {
        return titulo;
    }
    
    public int getAno()
    {
        return anio;
    }
    
    public String toString()
    {
        String textoADevolver = "Título: " + titulo + "\nAño de edición: " + anio;
        return textoADevolver;
    }
}
