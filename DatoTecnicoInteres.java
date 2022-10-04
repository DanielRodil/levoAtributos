package levoAtributos;

public class DatoTecnicoInteres {
	
	private String bastidor;
	private String color;
	private String combustible;
	private String cambio;
	private float capacidadDeposito;
	private String lubricanteMotor;
	private float capacidadCarter;
	private float presionNeumatiosDelanteros;
	private float presionNeumatiosTraseros;
	private String tipoCubiertas;
	private int numeroBaterias;
	private float voltajeBaterias;
	private float amperiosHoraBaterias;
	private float amperajeBaterias;
	private String clasificacionMedioambiental;
	
	public String getBastidor() {
		return bastidor;
	}
	
	public void setBastidor(String bastidor) {
		this.bastidor = bastidor;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getCombustible() {
		return combustible;
	}
	
	public void setCombustible(String combustible) {
		this.combustible = combustible;
	}
	
	public String getCambio() {
		return cambio;
	}
	
	public void setCambio(String cambio) {
		this.cambio = cambio;
	}
	
	public float getCapacidadDeposito() {
		return capacidadDeposito;
	}
	
	public void setCapacidadDeposito(float capacidadDeposito) {
		this.capacidadDeposito = capacidadDeposito;
	}
	
	public String getLubricanteMotor() {
		return lubricanteMotor;
	}
	
	public void setLubricanteMotor(String lubricanteMotor) {
		this.lubricanteMotor = lubricanteMotor;
	}
	
	public float getCapacidadCarter() {
		return capacidadCarter;
	}
	
	public void setCapacidadCarter(float capacidadCarter) {
		this.capacidadCarter = capacidadCarter;
	}
	
	public float getPresionNeumatiosDelanteros() {
		return presionNeumatiosDelanteros;
	}
	
	public void setPresionNeumatiosDelanteros(float presionNeumatiosDelanteros) {
		this.presionNeumatiosDelanteros = presionNeumatiosDelanteros;
	}
	
	public float getPresionNeumatiosTraseros() {
		return presionNeumatiosTraseros;
	}
	
	public void setPresionNeumatiosTraseros(float presionNeumatiosTraseros) {
		this.presionNeumatiosTraseros = presionNeumatiosTraseros;
	}
	
	public String getTipoCubiertas() {
		return tipoCubiertas;
	}
	
	public void setTipoCubiertas(String tipoCubiertas) {
		this.tipoCubiertas = tipoCubiertas;
	}
	
	public int getNumeroBaterias() {
		return numeroBaterias;
	}
	
	public void setNumeroBaterias(int numeroBaterias) {
		this.numeroBaterias = numeroBaterias;
	}
	
	public float getVoltajeBaterias() {
		return voltajeBaterias;
	}
	
	public void setVoltajeBaterias(float voltajeBaterias) {
		this.voltajeBaterias = voltajeBaterias;
	}
	
	public float getAmperiosHoraBaterias() {
		return amperiosHoraBaterias;
	}
	
	public void setAmperiosHoraBaterias(float amperiosHoraBaterias) {
		this.amperiosHoraBaterias = amperiosHoraBaterias;
	}
	
	public float getAmperajeBaterias() {
		return amperajeBaterias;
	}
	
	public void setAmperajeBaterias(float amperajeBaterias) {
		this.amperajeBaterias = amperajeBaterias;
	}
	
	public String getClasificacionMedioambiental() {
		return clasificacionMedioambiental;
	}
	
	public void setClasificacionMedioambiental(String clasificacionMedioambiental) {
		this.clasificacionMedioambiental = clasificacionMedioambiental;
	}

	public DatoTecnicoInteres() {
		super();
	}

	public DatoTecnicoInteres(String bastidor, String color, String combustible, String cambio, float capacidadDeposito,
			String lubricanteMotor, float capacidadCarter, float presionNeumatiosDelanteros,
			float presionNeumatiosTraseros, String tipoCubiertas, int numeroBaterias, float voltajeBaterias,
			float amperiosHoraBaterias, float amperajeBaterias, String clasificacionMedioambiental) {
		super();
		this.bastidor = bastidor;
		this.color = color;
		this.combustible = combustible;
		this.cambio = cambio;
		this.capacidadDeposito = capacidadDeposito;
		this.lubricanteMotor = lubricanteMotor;
		this.capacidadCarter = capacidadCarter;
		this.presionNeumatiosDelanteros = presionNeumatiosDelanteros;
		this.presionNeumatiosTraseros = presionNeumatiosTraseros;
		this.tipoCubiertas = tipoCubiertas;
		this.numeroBaterias = numeroBaterias;
		this.voltajeBaterias = voltajeBaterias;
		this.amperiosHoraBaterias = amperiosHoraBaterias;
		this.amperajeBaterias = amperajeBaterias;
		this.clasificacionMedioambiental = clasificacionMedioambiental;
	}

	@Override
	public String toString() {
		return "DatoTecnicoInteres [bastidor=" + bastidor + ", color=" + color + ", combustible=" + combustible
				+ ", cambio=" + cambio + ", capacidadDeposito=" + capacidadDeposito + ", lubricanteMotor="
				+ lubricanteMotor + ", capacidadCarter=" + capacidadCarter + ", presionNeumatiosDelanteros="
				+ presionNeumatiosDelanteros + ", presionNeumatiosTraseros=" + presionNeumatiosTraseros
				+ ", tipoCubiertas=" + tipoCubiertas + ", numeroBaterias=" + numeroBaterias + ", voltajeBaterias="
				+ voltajeBaterias + ", amperiosHoraBaterias=" + amperiosHoraBaterias + ", amperajeBaterias="
				+ amperajeBaterias + ", clasificacionMedioambiental=" + clasificacionMedioambiental + "]";
	}

}
