
/**
 * Write a description of class Producto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Producto
{
    // instance variables - replace the example below with your own
    protected int productosVendidos;
    /**
     * Constructor for objects of class Producto
     */
    public Producto()
    {
        // initialise instance variables
        productosVendidos = 0;
    }

    public void setVendido()
    {
        productosVendidos++;
    }
    
    public int getVendidos()
    {
        return productosVendidos;
    }

    public abstract String getNombre();
    
    public abstract double getPrecio();
    
    public abstract void vendido();
}
