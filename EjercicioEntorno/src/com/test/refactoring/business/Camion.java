package com.test.refactoring.business;

public class Camion extends Vehiculo implements MovimientoCoches{

	private String tipoCarnet;
	
	/**
	 * Constructor a vacío de la clase Padre
	 */
	public Camion() {
		super();
	}
	
	/**
	 * 
	 * @param matricula
	 * @param color
	 * @param combustible
	 * @param nombreConductor
	 * @param dniConductor
	 * @param tipoCarnet
	 */
	public Camion(String matricula, String color, String combustible, String nombreConductor, String dniConductor, String tipoCarnet) {
		super(matricula, color, combustible, nombreConductor, dniConductor);
		this.tipoCarnet = tipoCarnet;
	}	
	
	/**
	 * 
	 * @return
	 */
	public String getTipoCarnet() {
		return tipoCarnet;
	}
	
	/**
	 * 
	 * @param tipoCarnet
	 */
	public void setTipoCarnet(String tipoCarnet) {
		this.tipoCarnet = tipoCarnet;
	}

	/**
	 * 
	 * @param velocidad
	 */
	public void acelerar(Integer velocidad) {
		System.out.println("La aceleraci�n del cami�n se realizar� progresivamente para conservar sus neum�ticos");
		
		//TO DO
		//Incluir l�gica de movimiento
	}
	
	/**
	 * Método detener
	 */
	public void detener() {
		System.out.println("CUIDADO!! La detenci�n de un veh�culo de gran tama�o puede ocasionar accidentes de tr�fico");
	}

	/**
	 * Método toString
	 */
	@Override
	public String toString() {
		return super.toString() + ", tipoCarnet=" + tipoCarnet;
	}
	
}
