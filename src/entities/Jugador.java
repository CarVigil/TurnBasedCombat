package entities;

public class Jugador {
	
	String nombre;
	String apellido;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}	
	

// Constructores
	
public Jugador(){

}
public Jugador(String nom, String ape){
	setNombre(nom);
	setApellido(ape);
}

}