package com.adams.modelo;

public class Programador extends Empleado {

	private double bono;
	private final double SUELDO_BASE = 1250.0;

	public Programador(String nombre, double bono) {
		super(nombre);
		this.bono = bono;
	}

	public double getBono() {
		return bono;
	}

	public void setBono(double bono) {
		this.bono = bono;
	}

	@Override
	public String obtenerDetalles() {
		double sueldoTotal = SUELDO_BASE + bono;
		return "Programador: " + getNombre() + " | Sueldo: " + sueldoTotal + " €";
	}

}
