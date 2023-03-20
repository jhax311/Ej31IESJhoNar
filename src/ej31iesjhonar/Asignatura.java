
package ej31iesjhonar;

/**
 * 
 * @author Jhoel Alexander Narváez Valarezo
 */
public class Asignatura {

    private int identificador;
    private double calificacion;
    
    //constructor de asignatura con identificador
    public Asignatura(int iden){
        this.identificador= iden;
        this.calificacion=0;
    }
    
    //GETTER AND SETTER
    public void setIdentififcador(int siden){
        this.identificador=siden;
    }
    public void setCalififcacion(double scali){
        this.calificacion=scali;
    }
    
    public int getIdentififcador(){
        return identificador;
    }
    public double getCalificacion(){
        return calificacion;
    }
    
    //override para herencia

    @Override
    public String toString() {
        return "Asignatura{" + "identificador=" + identificador + ", calificacion=" + calificacion + '}';
    }   
}
