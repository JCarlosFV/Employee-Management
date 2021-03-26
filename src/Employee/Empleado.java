package Employee;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Empleado {
    private String id;
    private String nombre;
    private String apellido;
    private String correo;
    private int edad;


    public Empleado(String id, String nombre, String apellido, String correo, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.setCorreo(correo);
        this.setEdad(edad);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        Pattern pat = Pattern.compile("^[\\w-]+(\\.[\\w-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        Matcher mat = pat.matcher(correo);
        if(!mat.find()){
            System.out.println("El Correo " + correo +" No es Válido" + "\n");
            correo = "Incorrecto";
        }
        this.correo = correo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad <=1 || edad >=100){
            edad = 1;
            System.out.println("La edad ingresada de (" +this.nombre+ ") no esta dentro del rango especificado, por lo tanto Set fue 1" + "\n");
        }
        this.edad = edad;
    }

    public String Presentacion (){
        return this.id + " - " + this.nombre + " " + this.apellido + " (" + this.correo + ")";
    }
}
