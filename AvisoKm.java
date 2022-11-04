package levoAtributos;

public class AvisoKm {

	private String pieza;
	private int kilometrosRestantes;
	
	public String getPieza() {
		return pieza;
	}

	public void setPieza(String pieza) {
		this.pieza = pieza;
	}

	public int getKilometrosRestantes() {
		return kilometrosRestantes;
	}

	public void setKilometrosRestantes(int kilometrosRestantes) {
		this.kilometrosRestantes = kilometrosRestantes;
	}

	public AvisoKm(String pieza, int kilometrosRestantes) {
		super();
		this.pieza = pieza;
		this.kilometrosRestantes = kilometrosRestantes;
	}
	
	public AvisoKm() {}

	@Override
	public String toString() {
		if (this.kilometrosRestantes >= 0) {
			return "Dentro de " + getKilometrosRestantes() + 
					" kilómetros, deben realizarse operaciones de mantenimiento de " + getPieza() + "\n";
		} else {
			return "Hace " + -getKilometrosRestantes() + 
					" kilómetros, deberían haberse realizado operaciones de mantenimiento de " + getPieza() + "\n";
		}

	}

}
