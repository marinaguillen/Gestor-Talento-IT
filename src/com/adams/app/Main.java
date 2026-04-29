package com.adams.app;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import com.adams.modelo.Empleado;
import com.adams.modelo.Programador;

public class Main {

	public static void cargarPlantilla(ArrayList<Empleado> lista) {
		lista.add(new Programador("Marina Guillén", 500.0));
		lista.add(new Programador("Pepe Grillo", 400.0));
		lista.add(new Programador("Bill Gates", 1000.0));

	}

	public static void main(String[] args) {
		ArrayList<Empleado> listaEmpleados = new ArrayList<>();
		cargarPlantilla(listaEmpleados);

		try {
			FileWriter fw = new FileWriter("empleados_nomina.txt");
			for (Empleado emp : listaEmpleados) {
				System.out.println(emp.obtenerDetalles());
				fw.write(emp.obtenerDetalles() + "\n");
			}
			fw.close();
			System.out.println("-- LISTA GUARDADA CORRECTAMENTE. ");

		} catch (IOException e) {
			System.err.println("Error al escribir el archivo: " + e.getMessage());
		}

	}

}
