/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prueba;

// Singleton que maneja los sueldos de los empleados
public class Sueldos {
    private static Sueldos instancia = null;
    private static final double APORTE_JUB = 0.11;
    private static final double OBRA_SOCIAL = 0.06;
    
    public static double getSueldoTemporal(EmpleadoTemporal emp){
        return emp.getSueldoHora() * emp.getHorasTrabajadas();
    }
    
    public static double getSueldoPermanente(EmpleadoPermanente emp){
        double total= emp.getSueldoBase();
        double descuentos = total * APORTE_JUB + total * OBRA_SOCIAL;
        double bonus=0;
        
        if (emp.getNivel() == EmpleadoPermanente.Niveles.PRINCIPIANTE){
            bonus = getBonusPrincipiante(emp.getAntiguedad());
        } else if (emp.getNivel() == EmpleadoPermanente.Niveles.INTERMEDIO) {
            bonus = getBonusIntermedio(emp.getAntiguedad());
        } else {
            bonus = getBonusExperto(emp.getAntiguedad());
        }
        total = total - descuentos + bonus;
        
        return total;
    }
    
    public static double getSueldoNeto(Empleado emp){
        double total = 0;
        if (emp.getClass() == EmpleadoTemporal.class){
            total = getSueldoTemporal((EmpleadoTemporal) emp);   
        } else{
            total = getSueldoPermanente((EmpleadoPermanente) emp);
        }
        
        return total;
    }
    
    public static double getBonusPrincipiante(int años){
        if(años < 2)
            return 0;
        else if (años < 5)
            return .05;
        else if (años < 10)
            return .07;
        else if (años < 15)
            return .1;
        else if (años < 20)
            return .15;
        else return .2;
    }
    
    public static double getBonusIntermedio(int años){
        return .25 + años * .01;
    }
    
    public static double getBonusExperto(int años){
        return .5 + años * .015;
    }
    
    
    private Sueldos(){
    }
    
    public static Sueldos getSueldos() {
        if (instancia == null)
            instancia =  new Sueldos();
            
        return instancia;
        
    }
    
    
}
