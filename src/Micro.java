
public class Micro extends Componente {
	private String modelo;
	private String tipoConex;
	private double velProcesamiento;
	
	public Micro(int cantDisp, String numSerie, String marca, double precio,
			String modelo, String tipoConex, double velProcesamiento) {
		
		super(cantDisp, numSerie, marca, precio);
		
		setModelo(modelo);
		setTipoConex(tipoConex);
		setVelProcesamiento(velProcesamiento);
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getTipoConex() {
		return tipoConex;
	}

	public void setTipoConex(String tipoConex) {
		this.tipoConex = tipoConex;
	}

	public double getVelProcesamiento() {
		return velProcesamiento;
	}

	public void setVelProcesamiento(double velProcesamiento) {
		this.velProcesamiento = velProcesamiento;
	}
	
	
	
	
	
}
