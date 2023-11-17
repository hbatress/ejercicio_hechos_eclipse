package tablas;

public class estacion {
	
	private int ID_estacion;
	private String Nombre;
	private String Ciudad;
	private int ID_tren;
	
	public estacion() {	
	}
	public estacion(int ID_estacion,String Nombre,String Ciudad,int ID_tren) {	
		this.ID_estacion=ID_estacion;
		this.Nombre=Nombre;
		this.Ciudad=Ciudad;
		this.ID_tren=ID_tren;
	}
	public int getID_estacion() {
		return ID_estacion;
	}
	public void setID_estacion(int iD_estacion) {
		ID_estacion = iD_estacion;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getCiudad() {
		return Ciudad;
	}
	public void setCiudad(String ciudad) {
		Ciudad = ciudad;
	}
	public int getID_tren() {
		return ID_tren;
	}
	public void setID_tren(int iD_tren) {
		ID_tren = iD_tren;
	}

}
