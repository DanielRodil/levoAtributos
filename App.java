package levoAtributos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class App {

	public static void main(String[] args) {
		
		LocalDate fechaAccesoApp = LocalDate.of(2020, 9, 19);

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

		
		
	}

}
