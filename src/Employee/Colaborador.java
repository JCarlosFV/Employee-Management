package Employee;

import java.util.ArrayList;
import java.util.List;

public class Colaborador extends Empleado{
    private List<String> Lenguajesprogramacion;

    public Colaborador(String id, String nombre, String apellido, String correo, int edad) {
        super(id, nombre, apellido, correo, edad);

        this.Lenguajesprogramacion = new ArrayList<String>();
    }

    public void AgregarLenguaje (String lenguaje){
        this.Lenguajesprogramacion.add(lenguaje);
    }

    public void ImprimirLenguajes (){

        System.out.println(super.getId()+"-"+super.getNombre() + " Conoce los siguientes lenguajes: ");

        for (String lenguajes: this.Lenguajesprogramacion) {
            System.out.println(lenguajes);
        }
    }
}
