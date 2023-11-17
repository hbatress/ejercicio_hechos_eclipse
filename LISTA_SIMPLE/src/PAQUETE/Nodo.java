package PAQUETE;

public class Nodo {
	
	//variables de tipo privado
		private Nodo siguienteNodo;
		private String Nombre, Fecha_Nacimiento;
		private int ID;
		public Nodo( ){
			
			
		}
		
		//Recibe los datos y apunta a siguiente en el constructor
		public Nodo(String Nombre_persona,String Fecha_Nacimiento,int Identificacion, Nodo siguienteNodo) {
		
			this.Nombre=Nombre_persona;
			this.Fecha_Nacimiento=Fecha_Nacimiento;
			this.siguienteNodo=siguienteNodo;
			this.ID=Identificacion;
		}
		
		public Nodo(String Nombre_persona,String Fecha_Nacimiento,int Identificacion) {
			this.Nombre=Nombre_persona;
			this.Fecha_Nacimiento=Fecha_Nacimiento;
			this.ID=Identificacion;
		}

		public Nodo getSiguienteNodo() {
			return siguienteNodo;
		}

		public void setSiguienteNodo(Nodo siguienteNodo) {
			this.siguienteNodo = siguienteNodo;
		}

		public String getNombre() {
			return Nombre;
		}

		public void setNombre(String nombre) {
			Nombre = nombre;
		}

		public String getFecha_Nacimiento() {
			return Fecha_Nacimiento;
		}

		public void setFecha_Nacimiento(String fecha_Nacimiento) {
			Fecha_Nacimiento = fecha_Nacimiento;
		}

		public int getID() {
			return ID;
		}

		public void setID(int iD) {
			ID = iD;
		}

		
}