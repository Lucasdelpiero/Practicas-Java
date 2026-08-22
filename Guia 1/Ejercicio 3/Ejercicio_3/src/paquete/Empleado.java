package paquete;

public class Empleado {
	private String nombre;
	private int antiguedad, hstrabajadas;
	private Categoria cat;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getAntiguedad() {
		return antiguedad;
	}
	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}
	public int getHstrabajadas() {
		return hstrabajadas;
	}
	public void setHstrabajadas(int hstrabajadas) {
		this.hstrabajadas = hstrabajadas;
	}
	public Categoria getCat() {
		return cat;
	}
	public void setCat(Categoria cat) {
		this.cat = cat;
	}
	public double getSueldo() {
		double aux;
		aux = this.cat.getSueldoporhora() * this.hstrabajadas;
		return aux;
	}
	public String detalle() {
		String retorno =
				"Nombre: " + this.nombre + "\nAntiguedad" + this.antiguedad +
				" años\nHoras trabajadas: " + this.hstrabajadas + 
				"\nTipo de categoria " + this.cat.getNombreCategoria() +
				"\nSueldo por hora: " + this.cat.getSueldoporhora() +
				"\nSueldo a cobrar: " + this.getSueldo() + "\n";
		return retorno;
	}
	
}
