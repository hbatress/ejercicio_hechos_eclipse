package tablas;

public class Trayectoria {

	private int ID_Trayectoria;
	private int ID_estacion;
	private String Distancia;
	private String Tiempo;
	
	public Trayectoria() {

	}
	public Trayectoria(int ID_Trayectoria,int ID_estacion,String Distancia,String Tiempo) {
	this.ID_Trayectoria=ID_Trayectoria;
	this.ID_estacion=ID_estacion;
	this.Distancia=Distancia;
	this.Tiempo=Tiempo;
	}


	public int getID_Trayectoria() {
		return ID_Trayectoria;
	}


	public void setID_Trayectoria(int iD_Trayectoria) {
		ID_Trayectoria = iD_Trayectoria;
	}


	public int getID_estacion() {
		return ID_estacion;
	}


	public void setID_estacion(int iD_estacion) {
		ID_estacion = iD_estacion;
	}


	public String getDistancia() {
		return Distancia;
	}


	public void setDistancia(String distancia) {
		Distancia = distancia;
	}


	public String getTiempo() {
		return Tiempo;
	}


	public void setTiempo(String tiempo) {
		Tiempo = tiempo;
	}

}
