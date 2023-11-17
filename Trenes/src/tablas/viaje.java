package tablas;

public class viaje {

	private int ID_viaje;
	private String rutaViaje;
	private String TiempoViaje;
	private String TipoViaje;
	private int ID_Pasajero;
	
	public viaje() {
	
	}
	public viaje(int ID_viaje,String ruta,String tiempo,String tipo,int ID_pasajero) {
		this.ID_viaje=ID_viaje;
		this.rutaViaje=ruta;
		this.TiempoViaje=tiempo;
		this.TipoViaje=tipo;
		this.ID_Pasajero=ID_pasajero;
	}
	public int getID_viaje() {
		return ID_viaje;
	}
	public void setID_viaje(int iD_viaje) {
		ID_viaje = iD_viaje;
	}
	public String getRutaViaje() {
		return rutaViaje;
	}
	public void setRutaViaje(String rutaViaje) {
		this.rutaViaje = rutaViaje;
	}
	public String getTiempoViaje() {
		return TiempoViaje;
	}
	public void setTiempoViaje(String tiempoViaje) {
		TiempoViaje = tiempoViaje;
	}
	public String getTipoViaje() {
		return TipoViaje;
	}
	public void setTipoViaje(String tipoViaje) {
		TipoViaje = tipoViaje;
	}
	public int getID_Pasajero() {
		return ID_Pasajero;
	}
	public void setID_Pasajero(int iD_Pasajero) {
		ID_Pasajero = iD_Pasajero;
	}

}
