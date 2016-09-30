package entities;


public class Personaje {

	private String idPersonaje;
	private String nombre;
	private int puntosVida;
	private int puntosEnergia;
	private int puntosDefensa;
	private int puntosEvasion;
	private int puntosTotales;
	private int puntosSinAsignar;
	
	
	public Personaje(String idPersonaje, String nombre, int puntosVida,
			int puntosEnergia, int puntosDefensa, int puntosEvasion,
			int puntosTotales, int puntosSinAsignar) {
		super();
		this.idPersonaje = idPersonaje;
		this.nombre = nombre;
		this.puntosVida = puntosVida;
		this.puntosEnergia = puntosEnergia;
		this.puntosDefensa = puntosDefensa;
		this.puntosEvasion = puntosEvasion;
		this.puntosTotales = puntosTotales;
		this.puntosSinAsignar = puntosSinAsignar;
	}
	
	public Personaje() {
		super();
	}
	
	public String getIdPersonaje() {
		return idPersonaje;
	}
	public void setCodigoPersonaje(String codigoPersonaje) {
		this.idPersonaje = codigoPersonaje;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getPuntosVida() {
		return puntosVida;
	}
	public void setPuntosVida(int puntosVida) {
		this.puntosVida = puntosVida;
	}
	public int getPuntosEnergia() {
		return puntosEnergia;
	}
	public void setPuntosEnergia(int puntosEnergia) {
		this.puntosEnergia = puntosEnergia;
	}
	public int getPuntosDefensa() {
		return puntosDefensa;
	}
	public void setPuntosDefensa(int puntosDefensa) {
		this.puntosDefensa = puntosDefensa;
	}
	public int getPuntosEvasion() {
		return puntosEvasion;
	}
	public void setPuntosEvasion(int puntosEvasion) {
		this.puntosEvasion = puntosEvasion;
	}
	public int getPuntosTotales() {
		return puntosTotales;
	}
	public void setPuntosTotales(int puntosTotales) {
		this.puntosTotales = puntosTotales;
	}
	public int getPuntosSinAsignar() {
		return puntosSinAsignar;
	}
	public void setPuntosSinAsignar(int puntosSinAsignar) {
		this.puntosSinAsignar = puntosSinAsignar;
	}
	
	
	public void CargarPersonaje()
	{
		try
		{
			Personaje personajeActual = new Personaje();
			personajeActual.puntosTotales = 200;
			int ptVida = personajeActual.puntosVida;
			int ptEnergia = personajeActual.puntosEnergia;
			int ptDefensa =  personajeActual.puntosDefensa;
			int ptEvasion = personajeActual.puntosEvasion;
			personajeActual.CargarPuntos(ptVida, ptEnergia, ptDefensa, ptEvasion);
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}
	
	public void CargarPuntos(int puntosVida, int puntosEnergia, int puntosDefensa, int puntosEvasion)
	{
		
	}
	
	public boolean Atacar(int puntosAtaque, Personaje PersActual)
	{
		boolean rta;
		if (puntosAtaque > PersActual.puntosEnergia)
		{
			PersActual.puntosEnergia -= puntosAtaque;
			rta = true;
		}
		else {
			rta = false;
		}
		return rta;		
	}
	
	public void Evadir()
	{
		
	}
	public void Defenderse(int puntosDefensa, Personaje persActual)
	{
		if(puntosDefensa<20){
			int energiaOriginal = persActual.getPuntosEnergia();
			int energiaARecuperar = energiaOriginal * puntosDefensa / 100;
			persActual.puntosEnergia += energiaARecuperar;
		}
	}
	
}