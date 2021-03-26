package Application;

import Employee.Empleado;
import Employee.Colaborador;
import Employee.Supervisor;

public class App {
    public static void main(String[] args) {
        Empleado e1 = new Empleado("21312","Gerson","Valencia","gersonva@gmail.com.mx",27);

        Supervisor s1 = new Supervisor("080289","Juan Carlos","Funez","jcfunez14@gmail.com",19);

        Colaborador c1 = new Colaborador("32132","Dennis David","Avila","ddavid213yahoo.com",30);

        //c1.AgregarLenguaje("PHP");
        //c1.AgregarLenguaje("PYTHON");
        //c1.AgregarLenguaje("JAVA");
        //c1.AgregarLenguaje("C++");

        //c1.ImprimirLenguajes();

        //PROBANDO LAS VALIDACIONES DEL CORREO
        System.out.println("Correo: " + s1.getCorreo());
        System.out.println("\n" + "Correo: "+c1.getCorreo() + "\n");

        //s1.AsignarEmpleado(c1);
        //s1.AsignarEmpleado(e1);
        //s1.ImprimirEmpleados();

    }
}
