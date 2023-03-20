package ej31iesjhonar;
import java.util.*;

/**
 *
 * @author Jhoel Alexander Narváez Valarezo
 */
public class Profesor {

    //metodo poner notas
    public void ponerNotas(Alumno alum) {
        Random aleatorio = new Random();
        alum.getAsigUno().setCalififcacion(aleatorio.nextInt(11));
        alum.getAsigDos().setCalififcacion(aleatorio.nextInt(11));
        alum.getAsigTres().setCalififcacion(aleatorio.nextInt(11));
    }
    
    public double calcularMedia(Alumno alumMedia) {
        double media;
        media=((alumMedia.getAsigUno().getCalificacion())+
                (alumMedia.getAsigDos().getCalificacion())+
                (alumMedia.getAsigTres().getCalificacion()))/3;
        return media;
    }

}
