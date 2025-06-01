package logica;


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
		 if (velProcesamiento < 0) {
		        throw new IllegalArgumentException("La velocidad de procesamiento no puede ser negativa.");
		    }
		    this.velProcesamiento= velProcesamiento;
		}
@Override
	

public String mostrarPropiedades() {
    return "Micro: " + modelo + "\nVelocidad de procesamiento: " + velProcesamiento + " GHz\nTipo de conexión: " + tipoConex;
}
	
	
	
}
