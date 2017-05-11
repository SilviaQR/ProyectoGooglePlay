
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
    protected String titulo;
    protected int vendido;
    
    public Pelicula(String nombrePelicula, int anioEdicion, int duracion, int calidad)
    {
        super(nombrePelicula, anioEdicion);
        this.duracion = duracion;
        this.calidad = calidad;
        vendido = 0;
    }

    public int getDuracion()
    {
        return duracion;
    }

    public String getTitulo()
    {
        return titulo;
    }

    public String getNombre()
    {
        return titulo;
    }

    public void vendido()
    {
        vendido++;
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

    public double getPrecio()
    {
        double precio = 0;
        if(calidad == 1080){
            precio = 10;
            if(anio < 2000)
            {
                double descuento = (precio*5)/100;
                precio = precio - descuento; 
            }
        }
        else{
            precio = 5;
            if(anio < 2000)
            {
                double descuento = (precio*5)/100;
                precio = precio - descuento; 
            }
        }
        return precio;
    }

    public String toString()
    {
        String textoADevolver = super.toString() + "\nDuración: " + duracion + ". \nCalidad: " + calidad + ".";
        return textoADevolver;
    }
}
