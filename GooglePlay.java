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
        numProductos = 0;
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

    public double comprar(String usuario, String identificador)
    {
        double precio = -1;
        boolean buscandoUsuario = false;
        int contador1 = 0;
        int contador2 = 0;
        boolean buscandoProducto = false;
        while(contador1 < usuarios.size() && buscandoUsuario == false){
            if(usuarios.get(contador1) != null && usuarios.get(contador1).getNombreCuenta().equals(usuario)){
                while(contador2 < productos.size() && buscandoProducto == false){ 
                    if(productos.get(contador2) != null && productos.get(contador2).getNombre().equals(identificador)){
                        precio = productos.get(contador2).getPrecio();
                        productos.get(contador2).vendido();
                        buscandoProducto = true;
                    }
                    contador2++;
                }
                buscandoUsuario = true;
            }
            contador1++;
        }

        return precio;
    }

}
