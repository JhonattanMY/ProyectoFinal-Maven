package proyecto.finall.biblioteca;

public class Estudiante {

	private String cedula;

	@Override
	public String toString() {
		return " - Estudiante: " + cedula + " - ";
	}

	// METODOS SET Y GET
	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

}
