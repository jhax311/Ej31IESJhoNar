package ej31iesjhonar;

/**
 * @author Jhoel Alexander Narváez Valarezo
 */
public class Alumno {
    //atributos tipo asignatura
    private Asignatura asigUno;
    private Asignatura asigDos;
    private Asignatura asigTres;
    //rellenar
     //con asigantura  y calificacion por defecto es un 0--> en alumno
    //PROFESOR
    //SOLO LLEVA METODOS
    //para poner nota hay que pasarle el alumno el cual tiene las asignaturas
    //GETTER AND 
    
    //constructores que inicalizan atributos de asignatura de alumno
    
    public Alumno (Asignatura as1, Asignatura as2,Asignatura as3){
        this.asigUno=  as1;
        this.asigDos=  as2;
        this.asigTres= as3;
        
         
    }
    //inicaliza las asignaturas con del identificador pasado por parametros
    public Alumno (int as1, int as2,int as3){
        this.asigUno=  new Asignatura(as1);
        this.asigDos=  new Asignatura(as2);
        this.asigTres= new Asignatura(as3);   
        
    }  
    
    //get and set

    public Asignatura getAsigUno() {
        return asigUno;
    }

    public Asignatura getAsigDos() {
        return asigDos;
    }

    public Asignatura getAsigTres() {
        return asigTres;
    }

    public void setAsigUno(Asignatura asUno) {
        this.asigUno = asUno;
    }

    public void setAsigDos(Asignatura asDos) {
        this.asigDos = asDos;
    }

    public void setAsigTres(Asignatura asTres) {
        this.asigTres = asTres;
    }
    
 
    @Override
    public String toString() {
        return "Alumno{" + "asigUno=" + asigUno + ", asigDos=" + asigDos + ", asigTres=" + asigTres + '}';
    }   
    
}
