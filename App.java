package levoAtributos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		
		LocalDate fechaAccesoApp = LocalDate.of(2022, 9, 19);

		//alta vehiculo (formulario)
		Vehiculo pgc1111a = new Vehiculo(LocalDate.of(2020, 9, 19), 0);

		//alta datos identificativos vehiculo (formulario)
		DatoIdentificativo dIpgc1111a = new DatoIdentificativo("PGC1111A", "nissan", "xtrail", "todoterreno", "comandancia de Madrid");
		pgc1111a.setDatosIdentificativos(dIpgc1111a);

		//alta datos tecnicos interes vehiculo (formulario)
		DatoTecnicoInteres dTpgc1111a = new DatoTecnicoInteres("bastidor", "bicolor", "gasolina", "manual", 80, "lubricante", 20, 5.4f, 3.7f, "240-R17", 2, 23.5f, 200.5f, 20.5f, "B");
		pgc1111a.setDatosTecnicosInteres(dTpgc1111a);

		//alta plan mantenimiento preventivo vehiculo (formulario)
		PlanPreventivo planMantPreventpgc1111a = new PlanPreventivo();
		pgc1111a.setPlanMantenimientoPreventivo(planMantPreventpgc1111a);
		planMantPreventpgc1111a.setCorreaDistribucionKm(60000);
		planMantPreventpgc1111a.setCorreaDistribucionMes(24);
		planMantPreventpgc1111a.setFiltroAireKm(50000);
		planMantPreventpgc1111a.setFiltroAireMes(24);
		planMantPreventpgc1111a.setFiltroCombustibleKm(50000);
		planMantPreventpgc1111a.setFiltroCombustibleMes(48);
		planMantPreventpgc1111a.setLiquidoFrenosKm(70000);
		planMantPreventpgc1111a.setLiquidoFrenosMes(36);
		
		//alta mantenimiento temporal (automatico)
		PlanPreventivo temporalPMPpgc1111a = new PlanPreventivo();
		pgc1111a.setTemporalPMP(temporalPMPpgc1111a);
		temporalPMPpgc1111a.setCorreaDistribucionKm(60000);
		temporalPMPpgc1111a.setCorreaDistribucionMes(24);
		temporalPMPpgc1111a.setFiltroAireKm(50000);
		temporalPMPpgc1111a.setFiltroAireMes(24);
		temporalPMPpgc1111a.setFiltroCombustibleKm(50000);
		temporalPMPpgc1111a.setFiltroCombustibleMes(48);
		temporalPMPpgc1111a.setLiquidoFrenosKm(70000);
		temporalPMPpgc1111a.setLiquidoFrenosMes(36);
		
		//avisos el dia de alta del vechiculo
		System.out.println("\nPGC1111A:");
		System.out.println(pgc1111a.toString());	
		System.out.println("\nAVISOS PGC1111A:");
		Utils.avisoKilometros(pgc1111a);
		Utils.avisoMeses(pgc1111a);

		//avisos si entro el 19/07/21 (10 meses despues del alta)
		pgc1111a.setKilometrosActuales(20000);
		pgc1111a.setMesesActuales(Utils.getMeses(pgc1111a.getFechaAlta(), fechaAccesoApp));
		System.out.println("---------------------------------------------------------------------------------------");
		System.out.println("\nPGC1111A (10 meses despues del alta):");
		System.out.println(pgc1111a.toString());	
		System.out.println("\nAVISOS PGC1111A (10 meses despues del alta):");
		Utils.avisoMeses(pgc1111a);
		Utils.avisoKilometros(pgc1111a);
		
		//creamos lista de mantenimientos en vehiculo
		List<MantenimientoRealizado> mantenimientosPGC1111a = new ArrayList<MantenimientoRealizado>();
		pgc1111a.setMantenimientosRealizados(mantenimientosPGC1111a);
		
		//se crea el primer mantenimiento
		MantenimientoRealizado mantenimiento1pgc1111a = new MantenimientoRealizado();
		mantenimientosPGC1111a.add(mantenimiento1pgc1111a);
		mantenimiento1pgc1111a.setFechaMantenimiento(LocalDate.of(2022, 9, 19));
		mantenimiento1pgc1111a.setKilometrosMantenimiento(35000);
		mantenimiento1pgc1111a.setFiltroAire(true);
		mantenimiento1pgc1111a.setCorreaDistribucion(true);
		
		//avisos despues del primer mantenimiento (19/09/2022)
		Utils.actualizaPeriodosRevisiones(pgc1111a, mantenimiento1pgc1111a);
		System.out.println("\nPGC1111A despues de PRIMER MANTENIMIENTO:");
		System.out.println(pgc1111a.toString());		
		System.out.println("\nAVISOS PGC1111A despues de PRIMER MANTENIMIENTO:");
		Utils.avisoMeses(pgc1111a);
		Utils.avisoKilometros(pgc1111a);
		
	}

}
