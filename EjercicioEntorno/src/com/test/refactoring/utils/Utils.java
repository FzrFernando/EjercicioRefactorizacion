package com.test.refactoring.utils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Utils {
	/**
	 * 
	 * @return
	 */
	public static String horaActual() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
        //System.out.println("HH:mm:ss-> "+dtf.format(LocalDateTime.now()));
        
        return dtf.format(LocalDateTime.now());
	}
	
	/**
	 * 
	 * @return
	 */
	public static String fechaActual() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        //System.out.println("yyyy/MM/dd-> "+dtf.format(LocalDateTime.now()));
        
        return dtf.format(LocalDateTime.now());
	}
	
	/**
	 * 
	 * @param dias
	 * @return
	 */
	public static float calcularPrecioAlquiler (Integer dias) {
		float result = 0;
		//El coste de un d�a de alquiler son 50� + 21% de IVA
		result = dias * 50 * 1.21f;
		return result;
	}
	
	/**
	 * 
	 * @param meses
	 * @return
	 */
	public static float calcularPrecioRenting (Integer meses) {
		//El coste de un mes de renting son 750� + 21% IVA
		return meses * 750 * 1.21f;
	}

}
