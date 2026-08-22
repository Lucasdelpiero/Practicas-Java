package Paquete;

public class Lugar {
    private String ciudad = "<Sin nombre>";
    private double latitud, longitud;
    private String pais = "Ninguno";
    
    public Lugar(String ciudad, String pais, int latitud, int longitud) {
        super();
        this.ciudad = ciudad;
        this.pais = pais;
        this.latitud = latitud;
        this.longitud = longitud;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }

    public double getLatitud() {
        return latitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getPais() {
        return pais;
    }
}
