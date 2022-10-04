package levoAtributos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Vehiculo {
	
	private LocalDate fechaAlta;
	private int kilometrosActuales;
	private int mesesActuales;
	private DatoIdentificativo datosIdentificativos;
	private DatoTecnicoInteres datosTecnicosInteres;
	private PlanPreventivo planMantenimientoPreventivo;
	private PlanPreventivo temporalPMP;
	private List<MantenimientoRealizado> mantenimientosRealizados = new ArrayList<>();
	
	public LocalDate getFechaAlta() {
		return fechaAlta;
	}
	
	public void setFechaAlta(LocalDate fechaAlta) {
		this.fechaAlta = fechaAlta;
	}
	
	public int getKilometrosActuales() {
		return kilometrosActuales;
	}
	
	public void setKilometrosActuales(int kilometrosActuales) {
		this.kilometrosActuales = kilometrosActuales;
	}
	
	public int getMesesActuales() {
		return mesesActuales;
	}
	
	public void setMesesActuales(int mesesActuales) {
		this.mesesActuales = mesesActuales;
	}
	
	public DatoIdentificativo getDatosIdentificativos() {
		return datosIdentificativos;
	}
	
	public void setDatosIdentificativos(DatoIdentificativo datosIdentificativos) {
		this.datosIdentificativos = datosIdentificativos;
	}
	
	public DatoTecnicoInteres getDatosTecnicosInteres() {
		return datosTecnicosInteres;
	}
	
	public void setDatosTecnicosInteres(DatoTecnicoInteres datosTecnicosInteres) {
		this.datosTecnicosInteres = datosTecnicosInteres;
	}
	
	public PlanPreventivo getPlanMantenimientoPreventivo() {
		return planMantenimientoPreventivo;
	}
	
	public void setPlanMantenimientoPreventivo(PlanPreventivo planMantenimientoPreventivo) {
		this.planMantenimientoPreventivo = planMantenimientoPreventivo;
	}
	
	public PlanPreventivo getTemporalPMP() {
		return temporalPMP;
	}
	
	public void setTemporalPMP(PlanPreventivo temporalPMP) {
		this.temporalPMP = temporalPMP;
	}
	
	public List<MantenimientoRealizado> getMantenimientosRealizados() {
		return mantenimientosRealizados;
	}
	
	public void setMantenimientosRealizados(List<MantenimientoRealizado> mantenimientosRealizados) {
		this.mantenimientosRealizados = mantenimientosRealizados;
	}

	public Vehiculo() {}

	public Vehiculo(LocalDate fechaAlta, int kilometrosActuales, int mesesActuales,
			DatoIdentificativo datosIdentificativos, DatoTecnicoInteres datosTecnicosInteres,
			PlanPreventivo planMantenimientoPreventivo, PlanPreventivo temporalPMP,
			List<MantenimientoRealizado> mantenimientosRealizados) {
		super();
		this.fechaAlta = fechaAlta;
		this.kilometrosActuales = kilometrosActuales;
		this.mesesActuales = mesesActuales;
		this.datosIdentificativos = datosIdentificativos;
		this.datosTecnicosInteres = datosTecnicosInteres;
		this.planMantenimientoPreventivo = planMantenimientoPreventivo;
		this.temporalPMP = temporalPMP;
		this.mantenimientosRealizados = mantenimientosRealizados;
	}
	
	public Vehiculo(LocalDate fechaAlta, int kilometrosActuales) {
		super();
		this.fechaAlta = fechaAlta;
		this.kilometrosActuales = kilometrosActuales;
	}

	@Override
	public String toString() {
		return "Vehiculo [fechaAlta=" + fechaAlta + ", kilometrosActuales=" + kilometrosActuales + ", mesesActuales="
				+ mesesActuales + ", datosIdentificativos=" + datosIdentificativos + ", datosTecnicosInteres="
				+ datosTecnicosInteres + ", planMantenimientoPreventivo=" + planMantenimientoPreventivo
				+ ", temporalPMP=" + temporalPMP + ", mantenimientosRealizados=" + mantenimientosRealizados + "]";
	}
	
	
}
