
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
        
    public Aplicacion(String nombreApp, double pesoApp, Categoria categApp)
    {
        this.nombreApp = nombreApp;
        this.pesoApp = pesoApp;
        this.categApp = categApp;
    }

    public String getNombre()
    {
        return nombreApp;
    }
    
    public double getTamanoEnMB()
    {
        return pesoApp;
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
    
    public String toString()
    {
        String textoADevolver = "Nombre de la aplicación: " + nombreApp + "\nTamaño: " + pesoApp + " MB." + "\nCategoría: " + categApp + ".";
        return textoADevolver;
    }
}
