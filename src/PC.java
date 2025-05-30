import java.util.ArrayList;
import java.util.List;


public class PC {

	 private String numeroSerie;
	    private ArrayList<Componente> componentes;

	    public PC(String numeroSerie) {
	        setNumeroSerie(numeroSerie);
	        componentes = new ArrayList<Componente>();
	    }
	    
	    
	    public String getNumeroSerie() {
			return numeroSerie;
		}
		public void setNumeroSerie(String numeroSerie) {
			this.numeroSerie = numeroSerie;
		}

		public void agregarComponente(Componente c) {
	        componentes.add(c);
	    }

	    public double calcularPrecio() {
	        double total = 0;
	        for (Componente c : componentes) {
	            total += c.calcularPrecio();
	        }
	        return total;
	    }

	    public void mostrarComponentes() {
	        System.out.println("Pc Serie: " + numeroSerie);
	        for (Componente c : componentes) {
	            System.out.println("Es:"+c);
	        }
	        System.out.println("Precio total: $" + calcularPrecio());
	    }
	}
	
	

