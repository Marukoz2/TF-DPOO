import java.util.ArrayList;

public class MotherBoard extends Componente {
	
	private String modelo;
	private String tipoConector;
	private String tipoRam;
	private ArrayList<String> listaConex;
	
	public MotherBoard(int cantDisp, String numSerie, String marca,
			double precio, String modelo, String tipoConector, String tipoRam,
			ArrayList<String> listaConex) {
		
		super(cantDisp, numSerie, marca, precio);
		
		setModelo(modelo);
		setTipoConector(tipoConector);
		setTipoRam(tipoRam);
		setListaConex(listaConex);
	}

	
	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getTipoConector() {
		return tipoConector;
	}

	public void setTipoConector(String tipoConector) {
		this.tipoConector = tipoConector;
	}

	public String getTipoRam() {
		return tipoRam;
	}

	public void setTipoRam(String tipoRam) {
		this.tipoRam = tipoRam;
	}

	public ArrayList<String> getListaConex() {
		return listaConex;
	}

	public void setListaConex(ArrayList<String> listaConex) {
		this.listaConex = listaConex;
	}
	
	@Override
	public String mostrarPropiedades() {
	    return "MotherBoard: " + modelo + ", Tipo RAM: " + tipoRam + ", Tipo Conector: " + tipoConector;
	}

	

	
}
