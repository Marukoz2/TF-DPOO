
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
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
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
		this.cargo = cargo;
	}
	
}
