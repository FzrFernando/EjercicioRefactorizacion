package com.test.refactoring.business;

public class Coche extends Vehiculo implements MovimientoCoches{
	
	private Integer numPlazas;
	
	/**
	 * Constructor a vacío de la clase Padre
	 */
	public Coche() {
		super();
	}
	
	/**
	 * 
	 * @param matricula
	 * @param color
	 * @param combustible
	 * @param nombreConductor
	 * @param dniConductor
	 * @param numPlazas
	 */
	public Coche(String matricula, String color, String combustible, String nombreConductor, String dniConductor, Integer numPlazas) {
		super(matricula, color, combustible, nombreConductor, dniConductor);
		this.numPlazas = numPlazas;
	}

	/**
	 * 
	 * @return
	 */
	public Integer getNumPlazas() {
		return numPlazas;
	}

	/**
	 * 
	 * @param numPlazas
	 */
	public void setNumPlazas(Integer numPlazas) {
		this.numPlazas = numPlazas;
	}

	/**
	 * 
	 * @param velocidad
	 */
	public void acelerar(Integer velocidad) {
		if (velocidad > 0 && velocidad < 120) {
			System.out.println("El coche est� acelerando y llegar� la velocidad de " + velocidad.intValue() + " km/h");
		} else {
			System.out.println("La velocidad indicada no est� permitida en un coche seg�n la DGT");
		}
	}
	
	/**
	 * Método detener
	 */
	public void detener() {
		System.out.println("El coche se detendr� en breve, aseg�rese de buscar un lugar adecuado para estacionar");
	}

	/**
	 * Método toString
	 */
	@Override
	public String toString() {
		return super.toString() + ", numPlazas=" + numPlazas;
	}

}
