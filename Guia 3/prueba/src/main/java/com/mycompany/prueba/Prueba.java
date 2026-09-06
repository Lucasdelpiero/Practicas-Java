/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prueba;

/**
 *
 * @author Lucas
 */
public class Prueba {
    public static void main(String[] args) {
        Empresa empresa = new Empresa();
        Departamento dep = new Departamento("Mantenimiento");
        Empleado emp = new EmpleadoPermanente("Juan Perez", 1234 , "Matheu 2343", 7, 12000, 1);
     
        dep.agregarEmpleado(emp);
        emp = new EmpleadoTemporal("Julio Garcia", 3209, "Colon 5561", 80, 160);
        dep.agregarEmpleado(emp);
        emp = new EmpleadoTemporal("Martin Rodriguez", 3210, "Mitre 3451", 70, 100);
        dep.agregarEmpleado(emp);
        empresa.añadirDepartamento(dep);
        
        dep = new Departamento("Contabilidad");
        emp = new EmpleadoPermanente("Mara Anchorena",  9876, "Luro 3489", 18, 13000, 2);
        dep.agregarEmpleado(emp);
        emp = new EmpleadoPermanente("Sandra Fernandez", 1276, "Córdoba 3843", 6, 11500, 0);
        dep.agregarEmpleado(emp);
        emp = new EmpleadoPermanente("Luis Gomez", 1544, "Formosa 2354", 2, 10500, 0);
        dep.agregarEmpleado(emp);
        emp = new EmpleadoPermanente("Lucas Benitez", 1634, "Castelli 4563", 12, 10000, 1);
        dep.agregarEmpleado(emp);
        empresa.añadirDepartamento(dep);
        
        empresa.imprimePlanillas();
        
    }
}
