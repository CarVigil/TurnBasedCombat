package logic;

import entities.*;
import java.util.Random;
import util.ApplicationException;
import data.DataPersonaje;

public class controladorCombate {

	Personaje pers1;
	Personaje pers2;	
	Random nroAleatorio = new Random();		
	DataPersonaje dp = new DataPersonaje();
	Partida partidaActual;
	
	
	
	public void setPartidaActual(){
		
		
	}
	public Personaje getPers1() {
		return pers1;
	}
	public void setPers1(Personaje pers1) {
		this.pers1 = pers1;
	}
	public Personaje getPers2() {
		return pers2;
	}
	public void setPers2(Personaje pers2) {
		this.pers2 = pers2;
	}	
		
	public void agregarPersonaje(Personaje per) throws ApplicationException{
		//Le paso un objeto de la clase Personaje 
		
		dp.agregar(per);		
	}
	
	public Personaje buscarPersonaje(Personaje per) throws ApplicationException{
						
		dp.buscarPorId(per);
		return per;
	}
	
	public Personaje modificarPersonaje(Personaje per)throws ApplicationException{
		dp.modificar(per);
		return per;
	}
	
	public void borrarPersonaje(Personaje per) throws ApplicationException{
		dp.borrar(per);
	}

	public Personaje asignarPuntos(Personaje per){
		
		return per;
	}



}
