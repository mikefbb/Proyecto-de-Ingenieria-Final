package ProductTracker;

public class Product {
	private String tipoProducto;
	private String informacionProducto;
	private String nombreProducto;
	private double precioProducto;
	private int codigoProducto;
	private int stock;
	
	//Constructor
	public Product(String tipoProducto, String informacionProducto, String nombreProducto, double precioProducto, int codigoProducto, int stock) {
		super();
		this.tipoProducto = tipoProducto;
		this.informacionProducto = informacionProducto;
		this.nombreProducto = nombreProducto;
		this.precioProducto = precioProducto;
		this.codigoProducto = codigoProducto;
		this.stock = stock;
	}

	//Getters and Setters
	public String getTipoProducto() {
		return tipoProducto;
	}

	public void setTipoProducto(String tipoProducto) {
		this.tipoProducto = tipoProducto;
	}

	public String getInformacionProducto() {
		return informacionProducto;
	}

	public void setInformacionProducto(String informacionProducto) {
		this.informacionProducto = informacionProducto;
	}

	public String getNombreProducto() {
		return nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	public double getPrecioProducto() {
		return precioProducto;
	}

	public void setPrecioProducto(double precioProducto) {
		this.precioProducto = precioProducto;
	}

	public int getCodigoProducto() {
		return codigoProducto;
	}

	public void setCodigoProducto(int codigoProducto) {
		this.codigoProducto = codigoProducto;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	@Override
	public String toString() {
		return "Product [tipoProducto=" + tipoProducto + ", informacionProducto=" + informacionProducto
				+ ", nombreProducto=" + nombreProducto + ", precioProducto=" + precioProducto + ", codigoProducto="
				+ codigoProducto + ", stock=" + stock + "]";
	}
}