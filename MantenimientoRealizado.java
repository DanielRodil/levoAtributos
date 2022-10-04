package levoAtributos;

import java.time.LocalDate;

public class MantenimientoRealizado {

	private LocalDate fechaMantenimiento;
	private int kilometrosMantenimiento;
	private int mesesMantenimiento;
	private String comentarios;
	private boolean liquidoFrenos;
	private boolean operacionesSistematicas;
	private boolean filtroAire;
	private boolean filtroAireHabitaculo;
	private boolean filtroCombustible;
	private boolean filtroAntipolen;
	private boolean correaDistribucion;
	private boolean kitDistribucion;
	private boolean reglajeProyectores;
	private boolean pHLiquidoRefrigeracion;
	private boolean liquidoRefrigeracion;
	private boolean correaArrastreAccesorios;
	private boolean kitCorreaArrastreAccesorios;
	private boolean anticongelante;
	private boolean aceiteTransimision;
	private boolean bujiasEncendido;
	
	public LocalDate getFechaMantenimiento() {
		return fechaMantenimiento;
	}
	
	public void setFechaMantenimiento(LocalDate fechaMantenimiento) {
		this.fechaMantenimiento = fechaMantenimiento;
	}
	
	public int getKilometrosMantenimiento() {
		return kilometrosMantenimiento;
	}
	
	public void setKilometrosMantenimiento(int kilometrosMantenimiento) {
		this.kilometrosMantenimiento = kilometrosMantenimiento;
	}
	
	public int getMesesMantenimiento() {
		return mesesMantenimiento;
	}
	
	public void setMesesMantenimiento(int mesesMantenimiento) {
		this.mesesMantenimiento = mesesMantenimiento;
	}
	
	public String getComentarios() {
		return comentarios;
	}
	
	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}
	
	public boolean isLiquidoFrenos() {
		return liquidoFrenos;
	}
	
	public void setLiquidoFrenos(boolean liquidoFrenos) {
		this.liquidoFrenos = liquidoFrenos;
	}
	
	public boolean isOperacionesSistematicas() {
		return operacionesSistematicas;
	}
	
	public void setOperacionesSistematicas(boolean operacionesSistematicas) {
		this.operacionesSistematicas = operacionesSistematicas;
	}
	
	public boolean isFiltroAire() {
		return filtroAire;
	}
	
	public void setFiltroAire(boolean filtroAire) {
		this.filtroAire = filtroAire;
	}
	
	public boolean isFiltroAireHabitaculo() {
		return filtroAireHabitaculo;
	}
	
	public void setFiltroAireHabitaculo(boolean filtroAireHabitaculo) {
		this.filtroAireHabitaculo = filtroAireHabitaculo;
	}
	
	public boolean isFiltroCombustible() {
		return filtroCombustible;
	}
	
	public void setFiltroCombustible(boolean filtroCombustible) {
		this.filtroCombustible = filtroCombustible;
	}
	
	public boolean isFiltroAntipolen() {
		return filtroAntipolen;
	}
	
	public void setFiltroAntipolen(boolean filtroAntipolen) {
		this.filtroAntipolen = filtroAntipolen;
	}
	
	public boolean isCorreaDistribucion() {
		return correaDistribucion;
	}
	
	public void setCorreaDistribucion(boolean correaDistribucion) {
		this.correaDistribucion = correaDistribucion;
	}
	
	public boolean isKitDistribucion() {
		return kitDistribucion;
	}
	
	public void setKitDistribucion(boolean kitDistribucion) {
		this.kitDistribucion = kitDistribucion;
	}
	
	public boolean isReglajeProyectores() {
		return reglajeProyectores;
	}
	
	public void setReglajeProyectores(boolean reglajeProyectores) {
		this.reglajeProyectores = reglajeProyectores;
	}
	
	public boolean ispHLiquidoRefrigeracion() {
		return pHLiquidoRefrigeracion;
	}
	
	public void setpHLiquidoRefrigeracion(boolean pHLiquidoRefrigeracion) {
		this.pHLiquidoRefrigeracion = pHLiquidoRefrigeracion;
	}
	
	public boolean isLiquidoRefrigeracion() {
		return liquidoRefrigeracion;
	}
	
	public void setLiquidoRefrigeracion(boolean liquidoRefrigeracion) {
		this.liquidoRefrigeracion = liquidoRefrigeracion;
	}
	
	public boolean isCorreaArrastreAccesorios() {
		return correaArrastreAccesorios;
	}
	
	public void setCorreaArrastreAccesorios(boolean correaArrastreAccesorios) {
		this.correaArrastreAccesorios = correaArrastreAccesorios;
	}
	
	public boolean isKitCorreaArrastreAccesorios() {
		return kitCorreaArrastreAccesorios;
	}
	
	public void setKitCorreaArrastreAccesorios(boolean kitCorreaArrastreAccesorios) {
		this.kitCorreaArrastreAccesorios = kitCorreaArrastreAccesorios;
	}
	
	public boolean isAnticongelante() {
		return anticongelante;
	}
	
	public void setAnticongelante(boolean anticongelante) {
		this.anticongelante = anticongelante;
	}
	
	public boolean isAceiteTransimision() {
		return aceiteTransimision;
	}
	
	public void setAceiteTransimision(boolean aceiteTransimision) {
		this.aceiteTransimision = aceiteTransimision;
	}
	
	public boolean isBujiasEncendido() {
		return bujiasEncendido;
	}
	
	public void setBujiasEncendido(boolean bujiasEncendido) {
		this.bujiasEncendido = bujiasEncendido;
	}

	public MantenimientoRealizado() {}

	public MantenimientoRealizado(LocalDate fechaMantenimiento, int kilometrosMantenimiento, int mesesMantenimiento,
			String comentarios, boolean liquidoFrenos, boolean operacionesSistematicas, boolean filtroAire,
			boolean filtroAireHabitaculo, boolean filtroCombustible, boolean filtroAntipolen,
			boolean correaDistribucion, boolean kitDistribucion, boolean reglajeProyectores,
			boolean pHLiquidoRefrigeracion, boolean liquidoRefrigeracion, boolean correaArrastreAccesorios,
			boolean kitCorreaArrastreAccesorios, boolean anticongelante, boolean aceiteTransimision,
			boolean bujiasEncendido) {
		super();
		this.fechaMantenimiento = fechaMantenimiento;
		this.kilometrosMantenimiento = kilometrosMantenimiento;
		this.mesesMantenimiento = mesesMantenimiento;
		this.comentarios = comentarios;
		this.liquidoFrenos = liquidoFrenos;
		this.operacionesSistematicas = operacionesSistematicas;
		this.filtroAire = filtroAire;
		this.filtroAireHabitaculo = filtroAireHabitaculo;
		this.filtroCombustible = filtroCombustible;
		this.filtroAntipolen = filtroAntipolen;
		this.correaDistribucion = correaDistribucion;
		this.kitDistribucion = kitDistribucion;
		this.reglajeProyectores = reglajeProyectores;
		this.pHLiquidoRefrigeracion = pHLiquidoRefrigeracion;
		this.liquidoRefrigeracion = liquidoRefrigeracion;
		this.correaArrastreAccesorios = correaArrastreAccesorios;
		this.kitCorreaArrastreAccesorios = kitCorreaArrastreAccesorios;
		this.anticongelante = anticongelante;
		this.aceiteTransimision = aceiteTransimision;
		this.bujiasEncendido = bujiasEncendido;
	}

	@Override
	public String toString() {
		return "MantenimientoRealizado [fechaMantenimiento=" + fechaMantenimiento + ", kilometrosMantenimiento="
				+ kilometrosMantenimiento + ", mesesMantenimiento=" + mesesMantenimiento + ", comentarios="
				+ comentarios + ", liquidoFrenos=" + liquidoFrenos + ", operacionesSistematicas="
				+ operacionesSistematicas + ", filtroAire=" + filtroAire + ", filtroAireHabitaculo="
				+ filtroAireHabitaculo + ", filtroCombustible=" + filtroCombustible + ", filtroAntipolen="
				+ filtroAntipolen + ", correaDistribucion=" + correaDistribucion + ", kitDistribucion="
				+ kitDistribucion + ", reglajeProyectores=" + reglajeProyectores + ", pHLiquidoRefrigeracion="
				+ pHLiquidoRefrigeracion + ", liquidoRefrigeracion=" + liquidoRefrigeracion
				+ ", correaArrastreAccesorios=" + correaArrastreAccesorios + ", kitCorreaArrastreAccesorios="
				+ kitCorreaArrastreAccesorios + ", anticongelante=" + anticongelante + ", aceiteTransimision="
				+ aceiteTransimision + ", bujiasEncendido=" + bujiasEncendido + "]";
	}
	
	
}
