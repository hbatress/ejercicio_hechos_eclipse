package tablas;

public class Factura {

	private int IDFactura;
	private String TipoViajeFacturado;
	public Factura() {
	
	}
	public Factura(int IDFactura,String TipoViajeFacturado) {
		this.IDFactura=IDFactura;
		this.TipoViajeFacturado=TipoViajeFacturado;
	}
	public int getIDFactura() {
		return IDFactura;
	}
	public void setIDFactura(int iDFactura) {
		IDFactura = iDFactura;
	}
	public String getTipoViajeFacturado() {
		return TipoViajeFacturado;
	}
	public void setTipoViajeFacturado(String tipoViajeFacturado) {
		TipoViajeFacturado = tipoViajeFacturado;
	}
}
