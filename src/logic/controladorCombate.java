package logic;
import entities.*;

import java.util.Random;

import util.ApplicationException;
import data.DataPersonaje;

public class controladorCombate {

	Personaje pers1;
	Personaje pers2;	
	private Partida partidaActual;
	
	DataPersonaje dp = new DataPersonaje();
	
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
	
	
	public void agregarPersonaje(Personaje personajeActual) throws ApplicationException{
		//Le paso un objeto de la clase Personaje 
		
		dp.add(personajeActual);		
	}
	
	public Personaje buscarPersonaje(int id) throws ApplicationException{
		
		Personaje per = new Personaje();
		per.setIdPersonaje(id);
		dp.getById(per);
		return per;
	}
	
	public Personaje modificarPersonaje(Personaje per)throws ApplicationException{
		dp.update(per);
		return per;
	}


}
