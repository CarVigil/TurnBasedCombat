package entities;


public class Personaje {

	private int idPersonaje;
	private String nombre;
	private int vida;
	private int energia;
	private int defensa;
	private int evasion;
	private int puntosTotales;
	private int consumoEnergia;
	private int danio;


	/*	
	public Personaje(String idPersonaje, String nombre, int puntosVida,
			int puntosEnergia, int puntosDefensa, int puntosEvasion,
			int puntosTotales, int consumoEnergia) {
		super();
		this.idPersonaje = idPersonaje;
		this.nombre = nombre;
		this.vida = puntosVida;
		this.energia = puntosEnergia;
		this.defensa = puntosDefensa;
		this.evasion = puntosEvasion;
		this.puntosTotales = puntosTotales;
		this.consumoEnergia= consumoEnergia;
	}
*/	
	public Personaje() {
		super();
	}
	
	public int getIdPersonaje() {
		return idPersonaje;
	}
	public void setIdPersonaje(int codigoPersonaje) {
		this.idPersonaje = codigoPersonaje;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getVida() {
		return vida;
	}
	public void setVida(int puntosVida) {
		this.vida = puntosVida;
	}
	public int getEnergia() {
		return energia;
	}
	public void setEnergia(int puntosEnergia) {
		this.energia = puntosEnergia;
	}
	public int getDefensa() {
		return defensa;
	}
	public void setDefensa(int puntosDefensa) {
		this.defensa = puntosDefensa;
	}
	public int getEvasion() {
		return evasion;
	}
	public void setEvasion(int puntosEvasion) {
		this.evasion = puntosEvasion;
	}
	public int getPuntosTotales() {
		return puntosTotales;
	}
	public void setPuntosTotales(int puntosTotales) {
		this.puntosTotales = puntosTotales;
	}
	public int getconsumoEnergia() {
		return consumoEnergia;
	}
	public void setConsumoEnergia(int consumoEnergia) {
		this.consumoEnergia = consumoEnergia;
	}
	
	public int getDanio() {
		return danio;
	}

	public void setDanio(int danio) {
		this.danio = danio;
	}
	
	public void CargarPersonaje()
	{
		try
		{
			Personaje personajeActual = new Personaje();
			personajeActual.puntosTotales = 200;
			int ptVida = personajeActual.vida;
			int ptEnergia = personajeActual.energia;
			int ptDefensa =  personajeActual.defensa;
			int ptEvasion = personajeActual.evasion;
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
	
	public boolean Atacar(int energiaAtaque)
	{
		boolean rta;
		if (energiaAtaque >= this.energia)
		{
			this.energia -= energiaAtaque;
			rta = true;
		}
		else 
		{
			rta = false;
		}
		return rta;		
	}
	
	public void recibirAtaque(int energia){
		
	}
	
	public void defensa(){
		
	}
	
/*
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
*/
	
}