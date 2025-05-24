
public class Disco extends Componente{
	private String Modelo;
	private double capacidad;
	private String tipoConex;
	
	public Disco(int cantDisp, String numSerie, String marca, double precio,
			String modelo, double capacidad, String tipoConex) {
		super(cantDisp, numSerie, marca, precio);
		setModelo(modelo);
		setCapacidad(capacidad);
		setTipoConex(tipoConex);
	}

	public String getModelo() {
		return Modelo;
	}

	public void setModelo(String modelo) {
		Modelo = modelo;
	}

	public double getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(double capacidad) {
		this.capacidad = capacidad;
	}

	public String getTipoConex() {
		return tipoConex;
	}

	public void setTipoConex(String tipoConex) {
		this.tipoConex = tipoConex;
	}
	
	
	
	
	
}
