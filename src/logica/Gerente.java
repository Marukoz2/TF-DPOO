package logica;

public class Gerente {
	private String nombre;
	private String apellido;
	private String fechaCargo;


	public Gerente(String nombre, String apellido, String fechaCargo) {

		setNombre(nombre);
		setApellido(apellido);
		setFechaCargo(fechaCargo);
	}


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		if(nombre.isEmpty()){
			throw new IllegalArgumentException("Nombre vacio");
		}else{
			this.nombre = nombre;
		}
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		if(apellido.isEmpty()){
			throw new IllegalArgumentException("Apellido vacio");
		}else{
			this.apellido = apellido;
		}
	}

	public String getFechaCargo() {
		return fechaCargo;
	}

	public void setFechaCargo(String fechaCargo) {
		this.fechaCargo = fechaCargo;
	}





}
