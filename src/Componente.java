
public class Componente {
	private int cantDisp;
	private String numSerie;
	private String marca;
	private double precio;
	
	public Componente(int cantDisp, String numSerie, String marca, double precio) {
		
		setCantDisp(cantDisp);
		setNumSerie(numSerie);
		setMarca(marca);
		setPrecio(precio);
	}

	public int getCantDisp() {
		return cantDisp;
	}

	public void setCantDisp(int cantDisp) {
		this.cantDisp = cantDisp;
	}

	public String getNumSerie() {
		return numSerie;
	}

	public void setNumSerie(String numSerie) {
		this.numSerie = numSerie;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	
	
	
}
