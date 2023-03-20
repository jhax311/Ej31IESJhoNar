package ej31iesjhonar;

import java.util.Random;

/**
 *
 * @author Jhoel Alexander Narv?ez Valarezo
 */

public class Ejercicio31 {

    public static void main(String[] args) {
        // asiganturas
        Asignatura LVM = new Asignatura(0);
        Asignatura ISO = new Asignatura(1);
        Asignatura PAR = new Asignatura(2);

        //alumno
        Alumno alex = new Alumno(LVM, ISO, PAR);
        Alumno flor = new Alumno(5, 7, 8);
        //profesor
        Profesor jorge= new Profesor();
        Profesor jhoel = new Profesor();
        //poner notas
        jorge.ponerNotas(alex);
        jhoel.ponerNotas(flor);
        
        System.out.println(alex.toString());
        System.out.printf("La media de alex es: %1$.1f",jorge.calcularMedia(alex));
        System.out.println("");
        System.out.println(flor.toString());
        System.out.printf("La media de flor es: %1$.1f",jhoel.calcularMedia(flor));
       
        
    }

}
