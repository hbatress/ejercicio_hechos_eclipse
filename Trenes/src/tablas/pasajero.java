package tablas;

public class pasajero {

	private int IDPasajero;
	private String Nombre;
	private int telefono;
	private String Email;
	private int IDFactura;
	
	public pasajero() {
		
	}
	public pasajero(int ID_Pasajero,String NombrePasajero,int telefono,String Email,int IDFactura) {
		this.IDPasajero=ID_Pasajero;
		this.Nombre=NombrePasajero;
		this.telefono=telefono;
		this.Email=Email;
		this.IDFactura=IDFactura;
	}
	public int getIDPasajero() {
		return IDPasajero;
	}
	public void setIDPasajero(int iDPasajero) {
		IDPasajero = iDPasajero;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public int getIDFactura() {
		return IDFactura;
	}
	public void setIDFactura(int iDFactura) {
		IDFactura = iDFactura;
	}

}
