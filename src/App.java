import java.util.HashMap;

import controllers.Ejercicios;
import controllers.EmpleadoContoller;
import controllers.Mapa;

import models.Empleado;

public class App {
    public static void main(String[] args) throws Exception {

        runMapExamlpe();

        runEmpleadoExample();

        runEjerccios();
    }

    private static void runEmpleadoExample() {
        EmpleadoContoller empCtrl = new EmpleadoContoller();
        empCtrl.addEmpleado(new Empleado(1, "Juan", "Delantero"));
        empCtrl.addEmpleado(new Empleado(1, "Juan", "Delantero"));
        empCtrl.addEmpleado(new Empleado(1, "Juan", "Delantero"));
        empCtrl.addEmpleado(new Empleado(1, "Juan", "Delantero"));

        empCtrl.imprimirEmpleados();

    }

    private static void runMapExamlpe() {
        new Mapa();
    }

    private static void runEjerccios() {
        new Ejercicios();

    }
}
