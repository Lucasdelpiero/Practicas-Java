package Paquete;

import java.util.Date;

public class Imagen {
    private int cantidadPersonas;
    private String comentarios = "";
    private Date fecha;
    private Lugar lugar;
    private Persona[] personasenfoto = new Persona[100];
    private Persona propietario;

    public Imagen() {
        super();
    }

    public void agregarComentario(String comentario){
        if (comentario != "")
            this.comentarios += "\n";
        this.comentarios += comentario;
    }
    
    public void etiquetarPersona(Persona participante){
        this.personasenfoto[getCantidadPersonas()] = participante;
        this.cantidadPersonas++;
        //this.personasenfoto[1] = participante;
    }


    public int getCantidadPersonas(){
        return cantidadPersonas;    
    }
    
    public String getComentarios(){
        return comentarios;
    }
    
    public Date getFecha(){
        return fecha;
    }
    
    public Lugar getLugar(){
        return this.lugar;        
    }
    
    public Persona[] getPersonasenfoto() {
        return personasenfoto;
    }

    
    
    public Persona getPropietario(){
        return this.propietario;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setLugar(Lugar lugar) {
        this.lugar = lugar;
    }

    public void setPropietario(Persona propietario) {
        this.propietario = propietario;
    }



}
