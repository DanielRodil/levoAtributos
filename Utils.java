package levoAtributos;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Utils {
	
	public static int getMeses(LocalDate localDate, LocalDate localdate2) {
		return (int) localDate.until(localdate2).toTotalMonths();
	}
	
//	public static void actualizaPeriodosRevisiones(Vehiculo vehiculo, MantenimientoRealizado mantenimientoRealizado) {
//		vehiculo.setKilometrosActuales(mantenimientoRealizado.getKilometrosMantenimiento());
//		
//		Period periodo = vehiculo.getFechaAlta().until(mantenimientoRealizado.getFechaMantenimiento());
//		int mesesDesdeAltaHastaMantenimiento = (int) periodo.toTotalMonths();
//		mantenimientoRealizado.setMesesMantenimiento(mesesDesdeAltaHastaMantenimiento);
//		
//		vehiculo.setMesesActuales(mantenimientoRealizado.getMesesMantenimiento());
//		
//		for (Pieza pieza : vehiculo.getTemporalPMP().getPiezas()) {
//			for (Pieza pieza2 : mantenimientoRealizado.getPiezas()) {
//				if (pieza.equals(pieza2)) {
//					pieza.setKilometros(pieza.getKilometros() + vehiculo.getKilometrosActuales());
//					pieza.setMeses(pieza.getMeses() + mesesDesdeAltaHastaMantenimiento);
//				}
//			}
//		}
//	}

	
//	public static void avisoMeses(Vehiculo vehiculo) {
//				
//		List<Pieza> piezasPMPpgc1111a = vehiculo.getTemporalPMP().getPiezas();		
//		
//		Comparator<Pieza> comparadorMeses = new Comparator<Pieza>() {
//			@Override
//			public int compare(Pieza pieza1, Pieza pieza2) {
//			return Integer.compare(pieza1.getMeses(), pieza2.getMeses());
//			}		
//		};
//		piezasPMPpgc1111a.sort(comparadorMeses);
//		
//		List<Pieza> menoresMeses = new ArrayList<Pieza>();
//		for (Pieza pieza : piezasPMPpgc1111a) {
//			if (pieza.getMeses() == piezasPMPpgc1111a.get(0).getMeses()) {
//				menoresMeses.add(pieza);
//			}
//		}
//		
//		int diferenciaMeses = piezasPMPpgc1111a.get(0).getMeses() - vehiculo.getMesesActuales();
//		
//		if (diferenciaMeses > 0) {
//			System.out.println("Dentro de " + diferenciaMeses + " meses, deben realizarse operaciones de mantenimiento de: ");
//		} else if (diferenciaMeses < 0){
//			System.out.println("Hace " + -diferenciaMeses +	" meses, deberían haberse realizado operaciones de mantenimiento de: ");
//		} else {
//			System.out.println("Este mes deben realizarse operaciones de mantenimiento de: ");
//		}
//		
//		for (Pieza pieza : menoresMeses) {
//			System.err.println(pieza.getTipoPieza());
//		}
//	}

	
	public static void avisoKilometros(Vehiculo vehiculo) {
		
		List<Integer> piezasKm = new ArrayList<>();
		
		if (vehiculo.getTemporalPMP().getLiquidoFrenosKm() > 0) {piezasKm.add(vehiculo.getTemporalPMP().getLiquidoFrenosKm());}
		if (vehiculo.getTemporalPMP().getOperacionesSistematicasKm() > 0) {piezasKm.add(vehiculo.getTemporalPMP().getOperacionesSistematicasKm());}
		if (vehiculo.getTemporalPMP().getFiltroAireKm() > 0) {piezasKm.add(vehiculo.getTemporalPMP().getFiltroAireKm());}
		if (vehiculo.getTemporalPMP().getFiltroAireHabitaculoKm() > 0) {piezasKm.add(vehiculo.getTemporalPMP().getFiltroAireHabitaculoKm());}
		if (vehiculo.getTemporalPMP().getFiltroCombustibleKm() > 0) {piezasKm.add(vehiculo.getTemporalPMP().getFiltroCombustibleKm());}
		if (vehiculo.getTemporalPMP().getFiltroAntipolenKm() > 0) {piezasKm.add(vehiculo.getTemporalPMP().getFiltroAntipolenKm());}
		if (vehiculo.getTemporalPMP().getCorreaDistribucionKm() > 0) {piezasKm.add(vehiculo.getTemporalPMP().getCorreaDistribucionKm());}
		if (vehiculo.getTemporalPMP().getKitDistribucionKm() > 0) {piezasKm.add(vehiculo.getTemporalPMP().getKitDistribucionKm());}
		if (vehiculo.getTemporalPMP().getReglajeProyectoresKm() > 0) {piezasKm.add(vehiculo.getTemporalPMP().getReglajeProyectoresKm());}
		if (vehiculo.getTemporalPMP().getpHLiquidoRefrigeracionKm() > 0) {piezasKm.add(vehiculo.getTemporalPMP().getpHLiquidoRefrigeracionKm());}
		if (vehiculo.getTemporalPMP().getLiquidoRefrigeracionKm() > 0) {piezasKm.add(vehiculo.getTemporalPMP().getLiquidoRefrigeracionKm());}
		if (vehiculo.getTemporalPMP().getCorreaArrastreAccesoriosKm() > 0) {piezasKm.add(vehiculo.getTemporalPMP().getCorreaArrastreAccesoriosKm());}
		if (vehiculo.getTemporalPMP().getKitCorreaArrastreAccesoriosKm() > 0) {piezasKm.add(vehiculo.getTemporalPMP().getKitCorreaArrastreAccesoriosKm());}
		if (vehiculo.getTemporalPMP().getAnticongelanteKm() > 0) {piezasKm.add(vehiculo.getTemporalPMP().getAnticongelanteKm());}
		if (vehiculo.getTemporalPMP().getAceiteTransimisionKm() > 0) {piezasKm.add(vehiculo.getTemporalPMP().getAceiteTransimisionKm());}
		if (vehiculo.getTemporalPMP().getBujiasEncendidoKm() > 0) {piezasKm.add(vehiculo.getTemporalPMP().getBujiasEncendidoKm());}

		Collections.sort(piezasKm);

		int menorKm = piezasKm.get(0);

		int kilometrosRestantes = menorKm - vehiculo.getKilometrosActuales();

		if (kilometrosRestantes >= 0) {
			System.out.println("Dentro de " + kilometrosRestantes +	" kilómetros, deben realizarse operaciones de mantenimiento de: ");
		} else {
			System.out.println("Hace " + -kilometrosRestantes +	" kilómetros, deberían haberse realizado operaciones de mantenimiento de: ");
		}
		
		if (vehiculo.getTemporalPMP().getLiquidoFrenosKm() == menorKm) {System.out.println("LIQUIDO FRENOS");}
		if (vehiculo.getTemporalPMP().getOperacionesSistematicasKm() == menorKm) {System.out.println("OPERACIONES SISTEMATICAS");}
		if (vehiculo.getTemporalPMP().getFiltroAireKm() == menorKm) {System.out.println("FILTRO AIRE");}
		if (vehiculo.getTemporalPMP().getFiltroAireHabitaculoKm() == menorKm) {System.out.println("FILTRO AIRE HABITACULO");}
		if (vehiculo.getTemporalPMP().getFiltroCombustibleKm() == menorKm) {System.out.println("FILTRO COMBUSTIBLE");}
		if (vehiculo.getTemporalPMP().getFiltroAntipolenKm() == menorKm) {System.out.println("FILTRO ANTIPOLEN");}
		if (vehiculo.getTemporalPMP().getCorreaDistribucionKm() == menorKm) {System.out.println("CORREA DISTRIBUCION");}
		if (vehiculo.getTemporalPMP().getKitDistribucionKm() == menorKm) {System.out.println("KIT DISTRIBUCION");}
		if (vehiculo.getTemporalPMP().getReglajeProyectoresKm() == menorKm) {System.out.println("REGLAJE PROYECTORES");}
		if (vehiculo.getTemporalPMP().getpHLiquidoRefrigeracionKm() == menorKm) {System.out.println("PH LIQUIDO REFRIGERACION");}
		if (vehiculo.getTemporalPMP().getLiquidoRefrigeracionKm() == menorKm) {System.out.println("LIQUIDO REFRIGERACION");}
		if (vehiculo.getTemporalPMP().getCorreaArrastreAccesoriosKm() == menorKm) {System.out.println("CORREA ARRASTRE ACCESORIOS");}
		if (vehiculo.getTemporalPMP().getKitCorreaArrastreAccesoriosKm() == menorKm) {System.out.println("KIT CORREA ARRASTRE ACCESORIOS");}
		if (vehiculo.getTemporalPMP().getAnticongelanteKm() == menorKm) {System.out.println("ANTICONGELANTE");}
		if (vehiculo.getTemporalPMP().getAceiteTransimisionKm() == menorKm) {System.out.println("ACEITE TRANSMISION");}
		if (vehiculo.getTemporalPMP().getBujiasEncendidoKm() == menorKm) {System.out.println("BUJIAS ENCENDIDO");}
		
	}
	
	public static void avisoMeses(Vehiculo vehiculo) {
		
		List<Integer> piezasMes = new ArrayList<>();
		
		if (vehiculo.getTemporalPMP().getLiquidoFrenosMes() > 0) {piezasMes.add(vehiculo.getTemporalPMP().getLiquidoFrenosMes());}
		if (vehiculo.getTemporalPMP().getOperacionesSistematicasMes() > 0) {piezasMes.add(vehiculo.getTemporalPMP().getOperacionesSistematicasMes());}
		if (vehiculo.getTemporalPMP().getFiltroAireMes() > 0) {piezasMes.add(vehiculo.getTemporalPMP().getFiltroAireMes());}
		if (vehiculo.getTemporalPMP().getFiltroAireHabitaculoMes() > 0) {piezasMes.add(vehiculo.getTemporalPMP().getFiltroAireHabitaculoMes());}
		if (vehiculo.getTemporalPMP().getFiltroCombustibleMes() > 0) {piezasMes.add(vehiculo.getTemporalPMP().getFiltroCombustibleMes());}
		if (vehiculo.getTemporalPMP().getFiltroAntipolenMes() > 0) {piezasMes.add(vehiculo.getTemporalPMP().getFiltroAntipolenMes());}
		if (vehiculo.getTemporalPMP().getCorreaDistribucionMes() > 0) {piezasMes.add(vehiculo.getTemporalPMP().getCorreaDistribucionMes());}
		if (vehiculo.getTemporalPMP().getKitDistribucionMes() > 0) {piezasMes.add(vehiculo.getTemporalPMP().getKitDistribucionMes());}
		if (vehiculo.getTemporalPMP().getReglajeProyectoresMes() > 0) {piezasMes.add(vehiculo.getTemporalPMP().getReglajeProyectoresMes());}
		if (vehiculo.getTemporalPMP().getpHLiquidoRefrigeracionMes() > 0) {piezasMes.add(vehiculo.getTemporalPMP().getpHLiquidoRefrigeracionMes());}
		if (vehiculo.getTemporalPMP().getLiquidoRefrigeracionMes() > 0) {piezasMes.add(vehiculo.getTemporalPMP().getLiquidoRefrigeracionMes());}
		if (vehiculo.getTemporalPMP().getCorreaArrastreAccesoriosMes() > 0) {piezasMes.add(vehiculo.getTemporalPMP().getCorreaArrastreAccesoriosMes());}
		if (vehiculo.getTemporalPMP().getKitCorreaArrastreAccesoriosMes() > 0) {piezasMes.add(vehiculo.getTemporalPMP().getKitCorreaArrastreAccesoriosMes());}
		if (vehiculo.getTemporalPMP().getAnticongelanteMes() > 0) {piezasMes.add(vehiculo.getTemporalPMP().getAnticongelanteMes());}
		if (vehiculo.getTemporalPMP().getAceiteTransimisionMes() > 0) {piezasMes.add(vehiculo.getTemporalPMP().getAceiteTransimisionMes());}
		if (vehiculo.getTemporalPMP().getBujiasEncendidoMes() > 0) {piezasMes.add(vehiculo.getTemporalPMP().getBujiasEncendidoMes());}

		Collections.sort(piezasMes);
		
		int menorMes = piezasMes.get(0);
		
		int diferenciaMeses = menorMes - vehiculo.getMesesActuales();
		
		if (diferenciaMeses > 0) {
			System.out.println("Dentro de " + diferenciaMeses + " meses, deben realizarse operaciones de mantenimiento de: ");
		} else if (diferenciaMeses < 0){
			System.out.println("Hace " + -diferenciaMeses +	" meses, deberían haberse realizado operaciones de mantenimiento de: ");
		} else {
			System.out.println("Este mes deben realizarse operaciones de mantenimiento de: ");
		}
		
		if (vehiculo.getTemporalPMP().getLiquidoFrenosMes() == menorMes) {System.out.println("LIQUIDO FRENOS");}
		if (vehiculo.getTemporalPMP().getOperacionesSistematicasMes() == menorMes) {System.out.println("OPERACIONES SISTEMATICAS");}
		if (vehiculo.getTemporalPMP().getFiltroAireMes() == menorMes) {System.out.println("FILTRO AIRE");}
		if (vehiculo.getTemporalPMP().getFiltroAireHabitaculoMes() == menorMes) {System.out.println("FILTRO AIRE HABITACULO");}
		if (vehiculo.getTemporalPMP().getFiltroCombustibleMes() == menorMes) {System.out.println("FILTRO COMBUSTIBLE");}
		if (vehiculo.getTemporalPMP().getFiltroAntipolenMes() == menorMes) {System.out.println("FILTRO ANTIPOLEN");}
		if (vehiculo.getTemporalPMP().getCorreaDistribucionMes() == menorMes) {System.out.println("CORREA DISTRIBUCION");}
		if (vehiculo.getTemporalPMP().getKitDistribucionMes() == menorMes) {System.out.println("KIT DISTRIBUCION");}
		if (vehiculo.getTemporalPMP().getReglajeProyectoresMes() == menorMes) {System.out.println("REGLAJE PROYECTORES");}
		if (vehiculo.getTemporalPMP().getpHLiquidoRefrigeracionMes() == menorMes) {System.out.println("PH LIQUIDO REFRIGERACION");}
		if (vehiculo.getTemporalPMP().getLiquidoRefrigeracionMes() == menorMes) {System.out.println("LIQUIDO REFRIGERACION");}
		if (vehiculo.getTemporalPMP().getCorreaArrastreAccesoriosMes() == menorMes) {System.out.println("CORREA ARRASTRE ACCESORIOS");}
		if (vehiculo.getTemporalPMP().getKitCorreaArrastreAccesoriosMes() == menorMes) {System.out.println("KIT CORREA ARRASTRE ACCESORIOS");}
		if (vehiculo.getTemporalPMP().getAnticongelanteMes() == menorMes) {System.out.println("ANTICONGELANTE");}
		if (vehiculo.getTemporalPMP().getAceiteTransimisionMes() == menorMes) {System.out.println("ACEITE TRANSMISION");}
		if (vehiculo.getTemporalPMP().getBujiasEncendidoMes() == menorMes) {System.out.println("BUJIAS ENCENDIDO");}
	
	}
	
	
	
//	piezasMespgc1111a.add(temporalPMPpgc1111a.getLiquidoFrenosMes());
//	piezasMespgc1111a.add(temporalPMPpgc1111a.getOperacionesSistematicasMes());
//	piezasMespgc1111a.add(temporalPMPpgc1111a.getFiltroAireMes());
//	piezasMespgc1111a.add(temporalPMPpgc1111a.getFiltroAireHabitaculoMes());
//	piezasMespgc1111a.add(temporalPMPpgc1111a.getFiltroCombustibleMes());
//	piezasMespgc1111a.add(temporalPMPpgc1111a.getFiltroAntipolenMes());
//	piezasMespgc1111a.add(temporalPMPpgc1111a.getCorreaDistribucionMes());
//	piezasMespgc1111a.add(temporalPMPpgc1111a.getKitDistribucionMes());
//	piezasMespgc1111a.add(temporalPMPpgc1111a.getReglajeProyectoresMes());
//	piezasMespgc1111a.add(temporalPMPpgc1111a.getpHLiquidoRefrigeracionMes());
//	piezasMespgc1111a.add(temporalPMPpgc1111a.getLiquidoRefrigeracionMes());
//	piezasMespgc1111a.add(temporalPMPpgc1111a.getCorreaArrastreAccesoriosMes());
//	piezasMespgc1111a.add(temporalPMPpgc1111a.getKitCorreaArrastreAccesoriosMes());
//	piezasMespgc1111a.add(temporalPMPpgc1111a.getAnticongelanteMes());
//	piezasMespgc1111a.add(temporalPMPpgc1111a.getAceiteTransimisionMes());
//	piezasMespgc1111a.add(temporalPMPpgc1111a.getBujiasEncendidoMes());

}
