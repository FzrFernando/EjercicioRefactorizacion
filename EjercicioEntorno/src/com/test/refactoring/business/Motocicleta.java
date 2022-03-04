package com.test.refactoring.business;

public class Motocicleta extends Vehiculo implements MovimientoCoches{
	
	private Integer cilindrada;
	
	/**
	 * Constructor a vacío de la clase Padre
	 */
	public Motocicleta() {
		super();
	}

	/**
	 * 
	 * @param matricula
	 * @param color
	 * @param combustible
	 * @param nombreConductor
	 * @param dniConductor
	 * @param cilindrada
	 */
	public Motocicleta(String matricula, String color, String combustible, String nombreConductor,
			String dniConductor, Integer cilindrada) {
		super(matricula, color, combustible, nombreConductor, dniConductor);
		this.cilindrada = cilindrada;
	}

	/**
	 * 
	 * @return
	 */
	public Integer getCilindrada() {
		return cilindrada;
	}

	/**
	 * 
	 * @param cilindrada
	 */
	public void setCilindrada(Integer cilindrada) {
		this.cilindrada = cilindrada;
	}
	
	/**
	 * 
	 * @param velocidad
	 */
	public void acelerar(Integer velocidad) {
		//TO DO
	}
	
	/**
	 * Método detener
	 */
	public void detener() {
		//TO DO
	}

	/**
	 * Método toString
	 */
	@Override
	public String toString() {
		return super.toString() + ", cilindrada=" + cilindrada;
	}	

}
