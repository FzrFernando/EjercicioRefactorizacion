package com.test.refactoring.business;

public class Vehiculo {
	
	protected String matricula;
	protected String color;
	protected String combustible;
	protected String nombreConductor;
	protected String dniConductor;
	
	/**
	 * 
	 */
	public Vehiculo() {
		
	}
	
	/**
	 * 
	 * @param matricula
	 * @param color
	 * @param combustible
	 * @param nombreConductor
	 * @param dniConductor
	 */
	
	public Vehiculo(String matricula, String color, String combustible, String nombreConductor, String dniConductor) {
		this.matricula = matricula;
		this.color = color;
		this.combustible = combustible;
		this.nombreConductor = nombreConductor;
		this.dniConductor = dniConductor;
	}

	/**
	 * 
	 * @return
	 */
	public String getMatricula() {
		return matricula;
	}

	/**
	 * 
	 * @param matricula
	 */
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	/**
	 * 
	 * @return
	 */
	public String getColor() {
		return color;
	}

	/**
	 * 
	 * @param color
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * 
	 * @return
	 */
	public String getCombustible() {
		return combustible;
	}

	/**
	 * 
	 * @param combustible
	 */
	public void setCombustible(String combustible) {
		this.combustible = combustible;
	}
	
	/**
	 * 
	 * @return
	 */
	public String getNombreConductor() {
		return nombreConductor;
	}
	
	/**
	 * 
	 * @param nombreConductor
	 */
	public void setNombreConductor(String nombreConductor) {
		this.nombreConductor = nombreConductor;
	}
	
	/**
	 * 
	 * @return
	 */
	public String getDniConductor() {
		return dniConductor;
	}
	
	/**
	 * 
	 * @param dniConductor
	 */
	public void setDniConductor(String dniConductor) {
		this.dniConductor = dniConductor;
	}

	/**
	 * 
	 */
	@Override
	public String toString() {
		return "Vehiculo [matricula=" + matricula + ", color=" + color + ", combustible=" + combustible
				+ ", nombreConductor=" + nombreConductor + ", dniConductor=" + dniConductor + "]";
	}

	
	
	
}
