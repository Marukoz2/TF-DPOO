import java.util.ArrayList;


public class Tienda {
	private String nombre;
	private String numId;
	private String direccion;
	private String telefono;
	private Gerente gerente;
	private ArrayList<Trabajador> trabajadores;

	public Tienda(String nombre, String numId, String direccion,
			String telefono, Gerente gerente) {
		super();
		setNombre(nombre);
		setNumId(numId);
		setDireccion(direccion);
		setTelefono(telefono);
		setGerente(gerente);
		trabajadores = new ArrayList<Trabajador>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		if(nombre.isEmpty()){
			throw new IllegalArgumentException ("Nombre vacio");
		}else{
			this.nombre = nombre;
		}
	}

	public String getNumId() {
		return numId;
	}

	public void setNumId(String numId) {
		this.numId = numId;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public Gerente getGerente() {
		return gerente;
	}

	public void setGerente(Gerente gerente) {
		this.gerente = gerente;
	}
	
	



}
