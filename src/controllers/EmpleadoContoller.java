package controllers;

import java.util.HashMap;
import java.util.Map;

import models.Empleado;

public class EmpleadoContoller {
    HashMap<Integer, Empleado> listaEmpleados;

    public EmpleadoContoller() {
        listaEmpleados = new HashMap<>();
    }

    public void addEmpleado (Empleado empleado){
        listaEmpleados.put(listaEmpleados.size()+1,empleado);
    }


    public void imprimirEmpleados(){
        System.out.println(this.listaEmpleados);
    }

    public Empleado getEmpleado(Integer id){
        return listaEmpleados.get(id);

    }
}