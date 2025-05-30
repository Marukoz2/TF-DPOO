
public class Trabajador {
	private String nombre;
	private String apellido;
	private String id;
	private int numTrab;
	private double salarioBas;
	private String nivelEsc;
	private String cargo;

	public Trabajador(String nombre, String apellido, String id,
			int numTrab, double salarioBas, String nivelEsc, String cargo) {

		setNombre(nombre);
		setApellido(apellido);
		setId(id);
		setNumtrab(numTrab);
		setSalarioBas(salarioBas);
		setNivelEsc(nivelEsc);
		setCargo(cargo);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		if (nombre != null && !nombre.trim().isEmpty() && nombre.matches("[a-zA-Z·ÈÌÛ˙¡…Õ”⁄Ò—]+")) {
            this.nombre = nombre;
        } else {
            throw new IllegalArgumentException("Nombre inv·lido: debe contener solo letras y no estar vacÌo.");
        }
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		if (apellido != null && !apellido.trim().isEmpty() && apellido.matches("[a-zA-Z·ÈÌÛ˙¡…Õ”⁄Ò—]+")) {
            this.apellido = apellido;
        } else {
            throw new IllegalArgumentException("Apellido inv·lido: debe contener solo letras y no estar vacÌo.");
        }
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		if (id == null || id.isEmpty() || id.matches("\\s+")) {
	        throw new IllegalArgumentException("La ID no puede estar vacÌa ni contener solo espacios.");
	    }
	    if (!id.matches("^[a-zA-Z0-9]{5}$")) {
	        throw new IllegalArgumentException("La ID debe ser alfanumÈrica y contener exactamente 5 caracteres.");
	    }
	    this.id = id;
	}

	public int getNumtrab() {
		return numTrab;
	}

	public void setNumtrab(int numtrab) {
		numTrab = numtrab;
	}

	public double getSalarioBas() {
		return salarioBas;
	}

	public void setSalarioBas(double salarioBas) {
		this.salarioBas = salarioBas;
	}

	public String getNivelEsc() {
		return nivelEsc;
	}

	public void setNivelEsc(String nivelEsc) {
		this.nivelEsc = nivelEsc;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		if(!cargo.equals("") && cargo.equals(" "))
			this.cargo = cargo;
		else throw new IllegalArgumentException("No se admite cargo vacio");
			
		}
	
	public void mostrarSaralio(double salarioBas){
		
		
	}
	
}
