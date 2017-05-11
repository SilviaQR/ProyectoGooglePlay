
/**
 * Write a description of class Pelicula here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pelicula extends ProductoMultimedia
{
    protected int duracion;
    protected int calidad;

    public Pelicula(String nombrePelicula, int anioEdicion, int duracion, int calidad)
    {
        super(nombrePelicula, anioEdicion);
        this.duracion = duracion;
        this.calidad = calidad;
    }

    public int getDuracion()
    {
        return duracion;
    }

    public String getCalidad()
    {
        String textoADevolver = "";
        switch(calidad){
            case 1080: textoADevolver = "FullHD";
            break;
            default: textoADevolver= "HD";
            break;
        }
        return textoADevolver;
    }
    
    public String toString()
    {
        String textoADevolver = super.toString() + "\nDuración: " + duracion + ". \nCalidad: " + calidad + ".";
        return textoADevolver;
    }
}
