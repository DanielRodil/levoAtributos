package levoAtributos;

public class DatoIdentificativo {
	
	private String matricula;
	private String marca;
	private String modelo;
	private String tipo;
	private String unidadDestino;
	
	public String getMatricula() {
		return matricula;
	}
	
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public String getUnidadDestino() {
		return unidadDestino;
	}
	
	public void setUnidadDestino(String unidadDestino) {
		this.unidadDestino = unidadDestino;
	}
	
	public DatoIdentificativo() {
		super();
	}
	
	public DatoIdentificativo(String matricula, String marca, String modelo, String tipo, String unidadDestino) {
		super();
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.tipo = tipo;
		this.unidadDestino = unidadDestino;
	}
	
	@Override
	public String toString() {
		return "DatoIdentificativo [matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + ", tipo="
				+ tipo + ", unidadDestino=" + unidadDestino + "]";
	}
	

}
