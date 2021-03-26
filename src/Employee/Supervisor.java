package Employee;

import java.util.ArrayList;
import java.util.List;

public class Supervisor extends Empleado{
    private List<Empleado> empleados;

    public Supervisor(String id, String nombre, String apellido, String correo, int edad) {
        super(id, nombre, apellido, correo, edad);
        this.empleados = new ArrayList<Empleado>();
    }

    public void AsignarEmpleado (Empleado e){
        this.empleados.add(e);
    }

    public void ImprimirEmpleados(){
        System.out.println("Empleados del Supervisor " + super.getNombre() + ":" );
        for (Empleado e:this.empleados) {
            System.out.println(e.Presentacion());
        }
    }
}
