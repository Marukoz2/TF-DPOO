package logica;
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
			throw new IllegalArgumentException ("Tiene que haber un nombre vacio no?");
		}else{
			this.nombre = nombre;
		}
	}

	public String getNumId() {
		return numId;
	}

	public void setNumId(String numId) {
		if(numId== "" || numId == " "){
			throw new IllegalArgumentException ("El id no puede estar vacio");
		}else
			this.numId=numId;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		if(direccion == "" || direccion == " "){
			throw new IllegalArgumentException ("La direccion no puede estar vacia");
		}else
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		if(telefono.matches("//d{8}")){
			this.telefono = telefono;
		}else
			throw new IllegalArgumentException ("El telefo debe contener solo 8 digitos");
		
	}

	public Gerente getGerente() {
		return gerente;
	}

	public void setGerente(Gerente gerente) {
		this.gerente = gerente;
	}
	
	
	public Trabajador crearTrabajador(String nombre, String apellido, String id, int numTrab,
			double salarioBas, String nivelEsc, String cargo){
		return new Trabajador(nombre, apellido, id, numTrab, salarioBas, nivelEsc, cargo);
		
	}
	public void addTrabajador(Trabajador trabajador){
		trabajadores.add(trabajador);
	}
	public void delTrabajador(String id){
		boolean encontrado = false;	
		for(int i=0;i<trabajadores.size() && !encontrado;i++){
			if(trabajadores.get(i).equals(id)){
				trabajadores.remove(i);
				encontrado = true;
			}
		}
	}
	public void modTrabajador(String id, String nuevoNombre, String nuevoApellido, int nuevoNumTrab,
			double nuevoSalarioBas, String nuevoNivelEsc, String nuevoCargo){
		for(Trabajador trabajador : trabajadores){
			if(trabajador.getId().equals(id)){
				trabajador.setNombre(nuevoNombre);
				trabajador.setApellido(nuevoApellido);
				trabajador.setNumtrab(nuevoNumTrab);
				trabajador.setSalarioBas(nuevoSalarioBas);
				trabajador.setNivelEsc(nuevoNivelEsc);
				trabajador.setCargo(nuevoCargo);
				return;
			}
			
		}
		throw new IllegalArgumentException("No se encntro un trabajador con el id proporcionado");
		
	}



}
