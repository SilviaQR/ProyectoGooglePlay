
/**
 * Write a description of class ProductMultimedia here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class ProductoMultimedia extends Producto
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

    public abstract String getTitulo();
    
    public abstract void vendido();

    @Override
    public abstract String getNombre();

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
