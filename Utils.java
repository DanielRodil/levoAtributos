package levoAtributos;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Utils {
	
	public static int calculaMeses(LocalDate localDate, LocalDate localdate2) {
		return (int) localDate.until(localdate2).toTotalMonths();
	}
	
	
	public static void actualizaPeriodosRevisiones(Vehiculo vehiculo, MantenimientoRealizado mantenimientoRealizado) {
		
		Period periodo = vehiculo.getFechaAlta().until(mantenimientoRealizado.getFechaMantenimiento());
		int mesesDesdeAltaHastaMantenimiento = (int) periodo.toTotalMonths();
		mantenimientoRealizado.setMesesMantenimiento(mesesDesdeAltaHastaMantenimiento);
		
		vehiculo.setKilometrosActuales(mantenimientoRealizado.getKilometrosMantenimiento());
		vehiculo.setMesesActuales(mantenimientoRealizado.getMesesMantenimiento());
		
		if (mantenimientoRealizado.isLiquidoFrenos() == true) {
			vehiculo.getTemporalPMP().setLiquidoFrenosKm(vehiculo.getTemporalPMP().getLiquidoFrenosKm() + vehiculo.getKilometrosActuales());
			vehiculo.getTemporalPMP().setLiquidoFrenosMes(vehiculo.getTemporalPMP().getLiquidoFrenosMes() + mesesDesdeAltaHastaMantenimiento);
		}
		
		if (mantenimientoRealizado.isOperacionesSistematicas() == true) {
			vehiculo.getTemporalPMP().setOperacionesSistematicasKm(vehiculo.getTemporalPMP().getOperacionesSistematicasKm() + vehiculo.getKilometrosActuales());
			vehiculo.getTemporalPMP().setOperacionesSistematicasMes(vehiculo.getTemporalPMP().getOperacionesSistematicasMes() + mesesDesdeAltaHastaMantenimiento);
		}
		
		if (mantenimientoRealizado.isFiltroAire() == true) {
			vehiculo.getTemporalPMP().setFiltroAireKm(vehiculo.getTemporalPMP().getFiltroAireKm() + vehiculo.getKilometrosActuales());
			vehiculo.getTemporalPMP().setFiltroAireMes(vehiculo.getTemporalPMP().getFiltroAireMes() + mesesDesdeAltaHastaMantenimiento);
		}
		
		if (mantenimientoRealizado.isFiltroAireHabitaculo() == true) {
			vehiculo.getTemporalPMP().setFiltroAireHabitaculoKm(vehiculo.getTemporalPMP().getFiltroAireHabitaculoKm() + vehiculo.getKilometrosActuales());
			vehiculo.getTemporalPMP().setFiltroAireHabitaculoMes(vehiculo.getTemporalPMP().getFiltroAireHabitaculoMes() + mesesDesdeAltaHastaMantenimiento);
		}
		
		if (mantenimientoRealizado.isFiltroCombustible() == true) {
			vehiculo.getTemporalPMP().setFiltroCombustibleKm(vehiculo.getTemporalPMP().getFiltroCombustibleKm() + vehiculo.getKilometrosActuales());
			vehiculo.getTemporalPMP().setFiltroCombustibleMes(vehiculo.getTemporalPMP().getFiltroCombustibleMes() + mesesDesdeAltaHastaMantenimiento);
		}
		
		if (mantenimientoRealizado.isFiltroAntipolen() == true) {
			vehiculo.getTemporalPMP().setFiltroAntipolenKm(vehiculo.getTemporalPMP().getFiltroAntipolenKm() + vehiculo.getKilometrosActuales());
			vehiculo.getTemporalPMP().setFiltroAntipolenMes(vehiculo.getTemporalPMP().getFiltroAntipolenMes() + mesesDesdeAltaHastaMantenimiento);
		}
		
		if (mantenimientoRealizado.isCorreaDistribucion() == true) {
			vehiculo.getTemporalPMP().setCorreaDistribucionKm(vehiculo.getTemporalPMP().getCorreaDistribucionKm() + vehiculo.getKilometrosActuales());
			vehiculo.getTemporalPMP().setCorreaDistribucionMes(vehiculo.getTemporalPMP().getCorreaDistribucionMes() + mesesDesdeAltaHastaMantenimiento);
		}
		
		if (mantenimientoRealizado.isKitDistribucion() == true) {
			vehiculo.getTemporalPMP().setKitDistribucionKm(vehiculo.getTemporalPMP().getKitDistribucionKm() + vehiculo.getKilometrosActuales());
			vehiculo.getTemporalPMP().setKitDistribucionMes(vehiculo.getTemporalPMP().getKitDistribucionMes() + mesesDesdeAltaHastaMantenimiento);
		}
		
		if (mantenimientoRealizado.isReglajeProyectores() == true) {
			vehiculo.getTemporalPMP().setReglajeProyectoresKm(vehiculo.getTemporalPMP().getReglajeProyectoresKm() + vehiculo.getKilometrosActuales());
			vehiculo.getTemporalPMP().setReglajeProyectoresMes(vehiculo.getTemporalPMP().getReglajeProyectoresMes() + mesesDesdeAltaHastaMantenimiento);
		}
		
		if (mantenimientoRealizado.ispHLiquidoRefrigeracion() == true) {
			vehiculo.getTemporalPMP().setpHLiquidoRefrigeracionKm(vehiculo.getTemporalPMP().getpHLiquidoRefrigeracionKm() + vehiculo.getKilometrosActuales());
			vehiculo.getTemporalPMP().setpHLiquidoRefrigeracionMes(vehiculo.getTemporalPMP().getpHLiquidoRefrigeracionMes() + mesesDesdeAltaHastaMantenimiento);
		}
		
		if (mantenimientoRealizado.isLiquidoRefrigeracion() == true) {
			vehiculo.getTemporalPMP().setLiquidoRefrigeracionKm(vehiculo.getTemporalPMP().getLiquidoRefrigeracionKm() + vehiculo.getKilometrosActuales());
			vehiculo.getTemporalPMP().setLiquidoRefrigeracionMes(vehiculo.getTemporalPMP().getLiquidoRefrigeracionMes() + mesesDesdeAltaHastaMantenimiento);
		}
		
		if (mantenimientoRealizado.isCorreaArrastreAccesorios() == true) {
			vehiculo.getTemporalPMP().setCorreaArrastreAccesoriosKm(vehiculo.getTemporalPMP().getCorreaArrastreAccesoriosKm() + vehiculo.getKilometrosActuales());
			vehiculo.getTemporalPMP().setCorreaArrastreAccesoriosMes(vehiculo.getTemporalPMP().getCorreaArrastreAccesoriosMes() + mesesDesdeAltaHastaMantenimiento);
		}
		
		if (mantenimientoRealizado.isKitCorreaArrastreAccesorios() == true) {
			vehiculo.getTemporalPMP().setKitCorreaArrastreAccesoriosKm(vehiculo.getTemporalPMP().getKitCorreaArrastreAccesoriosKm() + vehiculo.getKilometrosActuales());
			vehiculo.getTemporalPMP().setKitCorreaArrastreAccesoriosMes(vehiculo.getTemporalPMP().getKitCorreaArrastreAccesoriosMes() + mesesDesdeAltaHastaMantenimiento);
		}
		
		if (mantenimientoRealizado.isAnticongelante() == true) {
			vehiculo.getTemporalPMP().setAnticongelanteKm(vehiculo.getTemporalPMP().getAnticongelanteKm() + vehiculo.getKilometrosActuales());
			vehiculo.getTemporalPMP().setAnticongelanteMes(vehiculo.getTemporalPMP().getAnticongelanteMes() + mesesDesdeAltaHastaMantenimiento);
		}
		
		if (mantenimientoRealizado.isAceiteTransimision() == true) {
			vehiculo.getTemporalPMP().setAceiteTransimisionKm(vehiculo.getTemporalPMP().getAceiteTransimisionKm() + vehiculo.getKilometrosActuales());
			vehiculo.getTemporalPMP().setAceiteTransimisionMes(vehiculo.getTemporalPMP().getAceiteTransimisionMes() + mesesDesdeAltaHastaMantenimiento);
		}
		
		if (mantenimientoRealizado.isBujiasEncendido() == true) {
			vehiculo.getTemporalPMP().setBujiasEncendidoKm(vehiculo.getTemporalPMP().getBujiasEncendidoKm() + vehiculo.getKilometrosActuales());
			vehiculo.getTemporalPMP().setBujiasEncendidoMes(vehiculo.getTemporalPMP().getBujiasEncendidoMes() + mesesDesdeAltaHastaMantenimiento);
		}	
			
	}

	
	public static List<AvisoKm> avisoKilometros(Vehiculo vehiculo) {
		
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
		
		List<AvisoKm> avisosKm = new ArrayList<AvisoKm>();
		
		if (vehiculo.getTemporalPMP().getLiquidoFrenosKm() == menorKm) {
			AvisoKm avisoLiquidoFrenosKm = new AvisoKm("LIQUIDO FRENOS", kilometrosRestantes);
			avisosKm.add(avisoLiquidoFrenosKm);
			}
		if (vehiculo.getTemporalPMP().getOperacionesSistematicasKm() == menorKm) {
			AvisoKm avisoOperacionesSistematicasKm = new AvisoKm("OPERACIONES SISTEMATICAS", kilometrosRestantes);
			avisosKm.add(avisoOperacionesSistematicasKm);
			}
		if (vehiculo.getTemporalPMP().getFiltroAireKm() == menorKm) {
			AvisoKm avisoFiltroAireKm = new AvisoKm("FILTRO AIRE", kilometrosRestantes);
			avisosKm.add(avisoFiltroAireKm);
			}
		if (vehiculo.getTemporalPMP().getFiltroAireHabitaculoKm() == menorKm) {
			AvisoKm avisoFiltroAireHabitaculoKm = new AvisoKm("FILTRO AIRE HABITACULO", kilometrosRestantes);
			avisosKm.add(avisoFiltroAireHabitaculoKm);
			}
		if (vehiculo.getTemporalPMP().getFiltroCombustibleKm() == menorKm) {
			AvisoKm avisoFiltroCombustibleKm = new AvisoKm("FILTRO COMBUSTIBLE", kilometrosRestantes);
			avisosKm.add(avisoFiltroCombustibleKm);
			}
		if (vehiculo.getTemporalPMP().getFiltroAntipolenKm() == menorKm) {
			AvisoKm avisoFiltroAntipolenKm = new AvisoKm("FILTRO ANTIPOLEN", kilometrosRestantes);
			avisosKm.add(avisoFiltroAntipolenKm);
			}
		if (vehiculo.getTemporalPMP().getCorreaDistribucionKm() == menorKm) {
			AvisoKm avisoCorreaDistribucionKm = new AvisoKm("CORREA DISTRIBUCION", kilometrosRestantes);
			avisosKm.add(avisoCorreaDistribucionKm);
			}
		if (vehiculo.getTemporalPMP().getKitDistribucionKm() == menorKm) {
			AvisoKm avisoKitDistribucionKm = new AvisoKm("KIT DISTRIBUCION", kilometrosRestantes);
			avisosKm.add(avisoKitDistribucionKm);
			}
		if (vehiculo.getTemporalPMP().getReglajeProyectoresKm() == menorKm) {
			AvisoKm avisoReglajeProyectoresKm = new AvisoKm("REGLAJE PROYECTORES", kilometrosRestantes);
			avisosKm.add(avisoReglajeProyectoresKm);
			}
		if (vehiculo.getTemporalPMP().getpHLiquidoRefrigeracionKm() == menorKm) {
			AvisoKm avisoPhLiquidoRefrigeracionKm = new AvisoKm("PH LIQUIDO REFRIGERACION", kilometrosRestantes);
			avisosKm.add(avisoPhLiquidoRefrigeracionKm);
			}
		if (vehiculo.getTemporalPMP().getLiquidoRefrigeracionKm() == menorKm) {
			AvisoKm avisoLiquidoRefrigeracionKm = new AvisoKm("LIQUIDO REFRIGERACION", kilometrosRestantes);
			avisosKm.add(avisoLiquidoRefrigeracionKm);
			}
		if (vehiculo.getTemporalPMP().getCorreaArrastreAccesoriosKm() == menorKm) {
			AvisoKm avisoCorreaArrastreAccesoriosKm = new AvisoKm("CORREA ARRASTRE ACCESORIOS", kilometrosRestantes);
			avisosKm.add(avisoCorreaArrastreAccesoriosKm);
			}
		if (vehiculo.getTemporalPMP().getKitCorreaArrastreAccesoriosKm() == menorKm) {
			AvisoKm avisokitCorreaArrastreAccesoriosKm = new AvisoKm("KIT CORREA ARRASTRE ACCESORIOS", kilometrosRestantes);
			avisosKm.add(avisokitCorreaArrastreAccesoriosKm);
			}
		if (vehiculo.getTemporalPMP().getAnticongelanteKm() == menorKm) {
			AvisoKm avisoAnticongelanteKm = new AvisoKm("ANTICONGELANTE", kilometrosRestantes);
			avisosKm.add(avisoAnticongelanteKm);
			}
		if (vehiculo.getTemporalPMP().getAceiteTransimisionKm() == menorKm) {
			AvisoKm avisoAceiteTransmisionKm = new AvisoKm("ACEITE TRANSMISION", kilometrosRestantes);
			avisosKm.add(avisoAceiteTransmisionKm);
			}
		if (vehiculo.getTemporalPMP().getBujiasEncendidoKm() == menorKm) {
			AvisoKm avisoBujiasEncendidoKm = new AvisoKm("BUJIAS ENCENDIDO", kilometrosRestantes);
			avisosKm.add(avisoBujiasEncendidoKm);
			}
		
		return avisosKm;
		
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

}
