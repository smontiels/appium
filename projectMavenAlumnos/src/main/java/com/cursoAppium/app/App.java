package com.cursoAppium.app;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App {
	
	private static Alumno oMonica;
	private static Alumno oKaren;
	private static Alumno oUlises;
	private static Alumno oSandy;
	private static Alumno oJL;
	private static Alumno oAbi;
	private static Mascota oMascota;
	
	public static void main(String[] args) {
		oMonica = new Alumno();
		oMonica.setNombre("Mónica");
		oMascota = new Mascota();
		oMascota.setNombre("Ortiz");
		oMascota.setEdad("9");
		oMascota.setRaza("Chihuahueño");
		oMonica.setoMascota(oMascota);
		
		oKaren = new Alumno();
		oKaren.setNombre("Karen");
		oMascota = new Mascota();
		oMascota.setNombre("Mandilon");
		oMascota.setEdad("3");
		oMascota.setRaza("Schnauzer");
		oKaren.setoMascota(oMascota);
		
		oUlises = new Alumno();
		oUlises.setNombre("Ulises");
		oMascota = new Mascota();
		oMascota.setNombre("Canelo");
		oMascota.setEdad("5");
		oMascota.setRaza("Labrador");
		oUlises.setoMascota(oMascota);
		
		oSandy = new Alumno();
		oSandy.setNombre("Sandy");
		oMascota = new Mascota();
		oMascota.setNombre("Solovino");
		oMascota.setEdad("1");
		oMascota.setRaza("Pug");
		oSandy.setoMascota(oMascota);
		
		oJL = new Alumno();
		oJL.setNombre("JL");
		oMascota = new Mascota();
		oMascota.setNombre("Mujeriego");
		oMascota.setEdad("6");
		oMascota.setRaza("Boxer");
		oJL.setoMascota(oMascota);
		
		oAbi = new Alumno();
		oAbi.setNombre("Abi");
		oMascota = new Mascota();
		oMascota.setNombre("Raymundo");
		oMascota.setEdad("7");
		oMascota.setRaza("Pit Bull");
		oAbi.setoMascota(oMascota);
		
		
		System.out.println("Hola Mundo!\n");
		List<Alumno> alumnos = new ArrayList<Alumno>();
		alumnos.add(oMonica);
		alumnos.add(oKaren);
		alumnos.add(oUlises);
		alumnos.add(oSandy);
		alumnos.add(oJL);
		alumnos.add(oAbi);
		
		for (Alumno obj: alumnos) {
			System.out.println("Nombre Alumno: " + obj.getNombre());
			System.out.println("Nombre mascota: " + obj.getoMascota().getNombre());
			System.out.println("Raza mascota: " + obj.getoMascota().getRaza());
			System.out.println("Edad mascota: " + obj.getoMascota().getEdad() + "\n");
		}
		
	}
}
