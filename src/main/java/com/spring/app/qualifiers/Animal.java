package com.spring.app.qualifiers;

public abstract class Animal {

	private String edad;
	private String nombre;
	
	
	public Animal(String edad, String nombre) {
		this.edad = edad;
		this.nombre = nombre;
	}
	public String getEdad() {
		return edad;
	}
	public void setEdad(String edad) {
		this.edad = edad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
