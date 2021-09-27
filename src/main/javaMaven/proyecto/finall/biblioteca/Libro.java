package proyecto.finall.biblioteca;

public class Libro {

	private String nombreLibro;
	private String autorLibro;
	private String codigoLibro;
	private int anioPublicacion;
	private String Editorial;
	private int paginas;
	private int precio;
	private String estado;

	// VARIABLEs DE REFERENCIA
	private Estudiante estudiante;

	@Override
	public String toString() {
		return "Nombre del Libro: " + nombreLibro + " - Autor del Libro: " + autorLibro + " - Codigo del Libro: "
				+ codigoLibro + " - Año de Publicacion: " + anioPublicacion + " - Estado: " + estado + " - Estudiante: "
				+ estudiante + "\n";
	}

	// METODOS SET Y GET
	public String getNombreLibro() {
		return nombreLibro;
	}

	public void setNombreLibro(String nombreLibro) {
		this.nombreLibro = nombreLibro;
	}

	public String getAutorLibro() {
		return autorLibro;
	}

	public void setAutorLibro(String autorLibro) {
		this.autorLibro = autorLibro;
	}

	public String getCodigoLibro() {
		return codigoLibro;
	}

	public void setCodigoLibro(String codigoLibro) {
		this.codigoLibro = codigoLibro;
	}

	public String getEditorial() {
		return Editorial;
	}

	public void setEditorial(String editorial) {
		Editorial = editorial;
	}

	public int getAnioPublicacion() {
		return anioPublicacion;
	}

	public void setAnioPublicacion(int anioPublicacion) {
		this.anioPublicacion = anioPublicacion;
	}

	public int getPaginas() {
		return paginas;
	}

	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public Estudiante getEstudiante() {
		return estudiante;
	}

	public void setEstudiante(Estudiante estudiante) {
		this.estudiante = estudiante;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
}
