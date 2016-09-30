package entities;

public class jugador {
	
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
	
public jugador(){

}
public jugador(String nom, String ape){
	setNombre(nom);
	setApellido(ape);
}

}