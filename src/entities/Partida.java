package entities;

// las partidas no se guardan en la base de datos
public class Partida {

	private int turno;

	public int getTurno() {
		return turno;
	}

	public void setTurno(int turno) {
		this.turno = turno;
	}

	public Partida(int turno) {
		super();
		this.turno = turno;
	}
	
	
	
}
