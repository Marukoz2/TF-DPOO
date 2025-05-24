
public class Ram extends Componente {
	private double cantMemoria;
	private String tipoMemoria;
	
	public Ram(int cantDisp, String numSerie, String marca, double precio,
			double cantMemoria, String tipoMemoria) {
		super(cantDisp, numSerie, marca, precio);
		setCantMemoria(cantMemoria);
		setTipoMemoria(tipoMemoria);
	}

	public double getCantMemoria() {
		return cantMemoria;
	}

	public void setCantMemoria(double cantMemoria) {
		this.cantMemoria = cantMemoria;
	}

	public String getTipoMemoria() {
		return tipoMemoria;
	}

	public void setTipoMemoria(String tipoMemoria) {
		this.tipoMemoria = tipoMemoria;
	}
	
	
	
	
	
}
