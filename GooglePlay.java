import java.util.ArrayList;
/**
 * Write a description of class GooglePlay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GooglePlay
{
    // instance variables - replace the example below with your own
    protected ArrayList<Usuario> usuarios;
    protected ArrayList<Producto> productos;
    protected int numUsuarios;
    protected int numProductos;

    /**
     * Constructor for objects of class GooglePlay
     */
    public GooglePlay()
    {
        usuarios = new ArrayList();
        productos = new ArrayList();
        numUsuarios = 0;
    }

    public void addUsuario(Usuario user)
    {
        usuarios.add(user);
        numUsuarios++;
    }

    public void addProducto(Producto producto)
    {
        productos.add(producto);
        numProductos++;
    }

    public int getNumeroProductos()
    {
        return numProductos;
    }
    
    public int getNumeroUsuarios()
    {
        return numUsuarios;
    }
}
