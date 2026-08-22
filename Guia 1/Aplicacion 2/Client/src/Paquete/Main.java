package Paquete;

import java.util.Date;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        
        Lugar l1 = new Lugar("Mardel", "Arg", 100, 50);
        Lugar l2 = new Lugar("Rio", "Bra", 50, 150);
        Lugar l3 = new Lugar("Barilo", "Arg", 200, 10);

        Persona p1 = new Persona("Lucas", 20, l1);
        Persona p2 = new Persona("Santi", 19, l1);
        Persona p3 = new Persona("Jorge", 55, l3);
        
        Date date1 = new Date(5, 5, 2020);
        Date date2 = new Date(8, 5, 2022);
        Date date3 = new Date(12, 12, 2025);
        
        Imagen i1 = new Imagen();
        i1.setLugar(l1);
        Imagen i2 = new Imagen();
        i2.setLugar(l2);
        i2.setPropietario(p3);
        Imagen i3 = new Imagen();
        
        
        i1.etiquetarPersona(p1);
        i1.etiquetarPersona(p2);
        
        i3.agregarComentario("Que hermosa foto");
        
        int min = p1.getEdad();
        if (p2.getEdad() < min)
            min = p2.getEdad();
        if (p3.getEdad() < min)
            min = p3.getEdad();
        
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese propietario: (1,2,3)");
        int i = scanner.nextInt(); 
        Persona temp;
        if (i==1)
            temp = p1;
        else if (i==2)
            temp = p2;
        else
            temp = p3;
        
        System.out.println("P"+ i);
        if(i2.getPropietario() == temp){
            System.out.println(" es propietario.");
        } else {
            System.out.println(" NO es propietario.");
        }
        
        String cadena = i3.getComentarios();
        String paisauxiliar = i2.getLugar().getPais();
        System.out.println("Lugar de I2: " + paisauxiliar);
        
        i1.setLugar(l2);
        
        
    }
}
