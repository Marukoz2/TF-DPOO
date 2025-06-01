package logica;

 public  abstract class Componente  {
	protected int cantDisp;
	protected String numSerie;
	protected String marca;
	protected double precio;
	
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
	    if (cantDisp < 0) {
	        throw new IllegalArgumentException("La cantidad disponible no puede ser negativa.");
	    }
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
		   if (precio < 0) {
		        throw new IllegalArgumentException("La cantidad disponible no puede ser negativa.");
		    }
		    this.precio= precio;
		}
	
	
	public abstract String mostrarPropiedades();
		
	public double calcularPrecio(){	
		return precio;
	}
	
	@Override
	public String toString(){
		
		return mostrarPropiedades()+"Precio:"+ precio;
	}
}
