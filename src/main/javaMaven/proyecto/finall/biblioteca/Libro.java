package proyecto.finall.biblioteca;

import java.time.LocalDate;

public class Libro {

	private String nombreLibro;
	private String autorLibro;
	private String codigoLibro;
	private int anioPublicacion;
	private String Editorial;
	private int paginas;
	private int precio;
	private String estado="Disponible";

	// VARIABLE DE REFERENCIA
	private Estudiante estudiante;

	@Override
	public String toString() {
		return "Nombre del Libro: " + nombreLibro + " - Autor del Libro: " + autorLibro + " - Codigo del Libro: "
				+ codigoLibro + " - Año de Publicacion: " + anioPublicacion + " - Estado: " + estado + " - Estudiante: "
				+ estudiante + "\n";
	}
	public void estadoLibro() {
		
		if(estado == "Disponible") {
			this.estado = "reservado";

				LocalDate diaHoyReserva = LocalDate.now();
				LocalDate diaFinReserva = diaHoyReserva.plusDays(5);
				System.out.println("Fecha de reserva: " + diaHoyReserva);
				System.out.println("Fecha de entrega: " + diaFinReserva);

			} else if (estado == "Reservado" || estado == "Prestado") {

				LocalDate diaHoyReserva2 = LocalDate.now();
				LocalDate diaFinReserva2 = diaHoyReserva2.plusDays(5);
				System.out.println("El libro no esta disponible por el momento");
				System.out.println("El libro estara disponible el: " + diaFinReserva2);
				System.out.println("Paselo a ver en la biblioteca es dia");
				
		}
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
