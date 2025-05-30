
public class Disco extends Componente{
	private String modelo;
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
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo=modelo;
	}

	public double getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(double capacidad) {
		   if (capacidad < 0) {
		        throw new IllegalArgumentException("La capacidad disponible no puede ser negativa.");
		    }
		    this.capacidad = capacidad;
		}

	public String getTipoConex() {
		return tipoConex;
	}

	public void setTipoConex(String tipoConex) {
		this.tipoConex=tipoConex;
	}
	
	@Override
	
	public String mostrarPropiedades(){
		
		
		return "DiscoDuro:" + marca +""+ modelo + ",Capasidad:"+ capacidad +",TipoConex:"+tipoConex;
	}
	
	
	
}
