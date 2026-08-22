package paquete;

public class Categoria {
	private String nombreCategoria;
	private double sueldoporhora;
	public String getNombreCategoria() {
		return nombreCategoria;
	}
	public double getSueldoporhora() {
		return sueldoporhora;
	}
	
	public Categoria(String nombrecategoria, double sueldoporhora) {
		this.nombreCategoria = nombrecategoria;
		this.sueldoporhora = sueldoporhora;
	}
}
