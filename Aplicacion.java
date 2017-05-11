
/**
 * Write a description of class Aplicacion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Aplicacion extends Producto
{
    protected String nombreApp;
    protected double pesoApp;
    protected Categoria categApp;
    protected int vendido;

    public Aplicacion(String nombreApp, double pesoApp, Categoria categApp)
    {
        this.nombreApp = nombreApp;
        this.pesoApp = pesoApp;
        this.categApp = categApp;
        vendido = 0;
    }

    public String getNombre()
    {
        return nombreApp;
    }

    public double getTamanoEnMB()
    {
        return pesoApp;
    }

    public void vendido()
    {
        vendido++;
    }

    public String getCategoria()
    {
        String textoAMostrar = null;
        switch(categApp){
            case JUEGOS: textoAMostrar = "Juegos";
            break;
            case COMUNICACIONES: textoAMostrar = "Comunicaciones";
            break;
            case PRODUCTIVIDAD: textoAMostrar = "Productividad";
            break;
            case MULTIMEDIA: textoAMostrar = "Multimedia";
            break;
        }
        return textoAMostrar;
    }

    public double getPrecio()
    {
        double precio = 0.99;
        if(vendido > 2){
            switch(categApp){
                case JUEGOS: precio = 5;
                break;
                case PRODUCTIVIDAD: precio = 10;
                break;
                default: precio = 2;
                break;
            }        
        }
        return precio;
    }

    public String toString()
    {
        String textoADevolver = "Nombre de la aplicación: " + nombreApp + "\nTamaño: " + pesoApp + " MB." + "\nCategoría: " + categApp + ".";
        return textoADevolver;
    }
}
