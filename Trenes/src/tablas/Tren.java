package tablas;

public class Tren {

	private int ID_tren;
	private int ID_viaje;
	private String Nombre;
	private String TipoTren;
	private int ID_estacion;
	
	public Tren() {
		
	}
	public Tren(int ID_tren,int  ID_viaje,String Nombre,String TipoTren,int ID_Estacion) {
		this.ID_tren=ID_tren;
		this.ID_viaje=ID_viaje;
		this.Nombre=Nombre;
		this.TipoTren=TipoTren;
		this.ID_estacion=ID_Estacion;
	}
	public int getID_tren() {
		return ID_tren;
	}
	public void setID_tren(int iD_tren) {
		ID_tren = iD_tren;
	}
	public int getID_viaje() {
		return ID_viaje;
	}
	public void setID_viaje(int iD_viaje) {
		ID_viaje = iD_viaje;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getTipoTren() {
		return TipoTren;
	}
	public void setTipoTren(String tipoTren) {
		TipoTren = tipoTren;
	}
	public int getID_estacion() {
		return ID_estacion;
	}
	public void setID_estacion(int iD_estacion) {
		ID_estacion = iD_estacion;
	}
	
}
