package proyecto.finall.biblioteca;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainBiblioteca {

	public static void main(String[] args) {

		Scanner lee = new Scanner(System.in);
		Scanner leeInt = new Scanner(System.in);

		int opcionTipo;
		int opcion;
		int opcionSalirBucle = 0;

		Estudiante cedula = new Estudiante();

		Libro estado = new Libro();

		List<Libro> baseDatosLibro = new ArrayList<Libro>();

		do {
			System.out.println("     ELIJA UNA OPCION");
			System.out.println("===========================");
			System.out.println("1. Estudiante");
			System.out.println("2. Bibliotecario");
			System.out.println("===========================");
			opcion = leeInt.nextInt();

			char literalEstudiante;
			char literalBibliotecario;

			if (opcion == 1) {
				System.out.println(" ELIJE UN LITERAL");
				System.out.println("====================");
				System.out.println("a. Consulta libros");
				System.out.println("b. Reservar libro");
				System.out.println("====================");
				literalEstudiante = lee.nextLine().charAt(0);

				if (literalEstudiante == 'A' || literalEstudiante == 'a') {

					System.out.println("Ingrese nombre del libro: ");
					String nombreL = lee.nextLine();
					System.out.println("Ingrese autor: ");
					String autorL = lee.nextLine();

					boolean resultado = false;

					for (int i = 0; i < baseDatosLibro.size(); i++) {

						Libro busqueda = baseDatosLibro.get(i);
						String nombreLi = busqueda.getNombreLibro();
						String autorLi = busqueda.getAutorLibro();
						boolean resultadoLocal = nombreL.equals(nombreLi);
						boolean resultadoLocal2 = autorL.equals(autorLi);

						if (resultadoLocal == true || resultadoLocal2 == true) {
							resultado = true;
						}

					}
					if (resultado == true) {

						System.out.println("LIBROS: ");
						baseDatosLibro.forEach(System.out::println);

					} else {

					}
				} else if (literalEstudiante == 'b' || literalEstudiante == 'B') {

					System.out.println("Ingrese Codigo del libro a reservar: ");
					String libroReserva = lee.nextLine();
					System.out.println("Ingrese cedula del estudiante: ");
					String cedulaEst = lee.nextLine();

					Estudiante saveCedula = new Estudiante();
					saveCedula.setCedula(cedulaEst);
					Libro cedulaEstudiante = new Libro();
					cedulaEstudiante.getEstudiante().getCedula();
					baseDatosLibro.add(cedulaEstudiante);

					boolean resultadoLocal2;
					for (int i = 0; i < baseDatosLibro.size(); i++) {

						Libro busqueda2 = baseDatosLibro.get(i);
						String codigoLi = busqueda2.getCodigoLibro();
						resultadoLocal2 = libroReserva.equals(codigoLi);

						if (resultadoLocal2 == true) {

							if (estado.getEstado().equals("Disponible")) {
								String nuevoEstado = "Reservado";
								estado.setEstado(nuevoEstado);
								baseDatosLibro.add(estado);

								LocalDate diaHoy = LocalDate.now();
								LocalDate diaFin = diaHoy.plusDays(5);
								System.out.println("Fecha de reserva: " + diaHoy);
								System.out.println("Dia de entrega: " + diaFin);
								System.out.println("Numero del cedula del estudiante: " + cedula.getCedula());

							} else if (estado.getEstado() == "Reservado" || estado.getEstado() == "Prestado") {

								LocalDate diaHoy2 = LocalDate.now();
								LocalDate diaFin2 = diaHoy2.plusDays(5);
								System.out.println("El libro no esta disponible por el momento");
								System.out.println("El libro estara disponible el: " + diaFin2);
								System.out.println("Paselo a ver en la biblioteca es dia");
							}

						} else {
							System.out.println("No se a encontrado el libro");
						}
					}

				} else {
					System.out.println("No existe esa opcion");
				}

			} else if (opcion == 2) {
				do {
					System.out.println(" ELIJE UN LITERAL");
					System.out.println("====================");
					System.out.println("a. Ingresar libro");
					System.out.println("b. Prestar libro");
					System.out.println("c. Aplazar fecha de entrega");
					System.out.println("====================");
					literalBibliotecario = lee.nextLine().charAt(0);

					if (literalBibliotecario == 'a' || literalBibliotecario == 'A') {

						System.out.println("Ingrese codigo del libro ");
						String codigoLibro = lee.nextLine();
						System.out.println("Ingrese nombre del libro ");
						String nombreLibro = lee.nextLine();
						System.out.println("Ingrese autor del libro ");
						String autoLibro = lee.nextLine();
						System.out.println("Ingrese año de publicacion del libro ");
						int anioPublicacion = leeInt.nextInt();
						System.out.println("Ingrese editorial del libro ");
						String editorial = lee.nextLine();
						System.out.println("Ingrese cantidad de paginas del libro");
						int paginas = leeInt.nextInt();
						System.out.println("Precio del libro");
						int precio = leeInt.nextInt();

						System.out.println("ELIJA LA OPCION DEL TIPO DE LIBRO");
						System.out.println(" 1.    Libro de trabajo");
						System.out.println(" 2.    Libro de lectura");
						opcionTipo = leeInt.nextInt();

						if (opcionTipo == 1) {
							System.out.println("Ingrese el codigo de autorizacion: ");
							String codigoAutorizacion1 = lee.nextLine();
							LibroTrabajo libroTrabajo = new LibroTrabajo();
							libroTrabajo.setCodigoAutorizacion(codigoAutorizacion1);
							libroTrabajo.setCodigoLibro(codigoLibro);
							libroTrabajo.setNombreLibro(nombreLibro);
							libroTrabajo.setAutorLibro(autoLibro);
							libroTrabajo.setAnioPublicacion(anioPublicacion);
							libroTrabajo.setEditorial(editorial);
							libroTrabajo.setPaginas(paginas);
							libroTrabajo.setPrecio(precio);

							baseDatosLibro.add(libroTrabajo);

						} else {
							System.out.println("¿Tiempo aproximado de lectura? (dado en minutos) :");
							int timpoLectura1 = leeInt.nextInt();
							LibroLectura libroLectura = new LibroLectura();
							libroLectura.setTiempoLectura(timpoLectura1);
							libroLectura.setCodigoLibro(codigoLibro);
							libroLectura.setNombreLibro(nombreLibro);
							libroLectura.setAutorLibro(autoLibro);
							libroLectura.setAnioPublicacion(anioPublicacion);
							libroLectura.setEditorial(editorial);
							libroLectura.setPaginas(paginas);
							libroLectura.setPrecio(precio);

							baseDatosLibro.add(libroLectura);
						}

						System.out.println("Elija una opcion");
						System.out.println("1.  Continuar Añadiendo libro");
						System.out.println("2.  No añadir mas libros");
						opcionSalirBucle = leeInt.nextInt();

					} else if (literalBibliotecario == 'b' || literalBibliotecario == 'B') {
						System.out.println("Ingrese codigo del libro: ");
						String libroPrestado = lee.nextLine();

						boolean resultado = false;

						for (int i = 0; i < baseDatosLibro.size(); i++) {

							Libro busqueda3 = baseDatosLibro.get(i);
							String codigoLi = busqueda3.getCodigoLibro();
							Boolean resultadoLocal3 = libroPrestado.equals(codigoLi);

							if (resultadoLocal3 == true) {
								resultado = true;
							}

						}
						if (resultado == true) {

							System.out.println("LIBRO: ");
							baseDatosLibro.forEach(System.out::println);

							int opcionPrestacion;
							System.out.println("Seleccione una opcion");
							System.out.println("1. PRESTAR");
							System.out.println("2. NO PRESTAR");
							opcionPrestacion = leeInt.nextInt();

							if (opcionPrestacion == 1) {

								LocalDate diaHoyPrestar = LocalDate.now();
								LocalDate diaFinPresta = diaHoyPrestar.plusDays(5);

								boolean resultadoBusc = false;

								for (int i = 0; i < baseDatosLibro.size(); i++) {

									Libro busqueda3 = baseDatosLibro.get(i);
									String codigoLi = busqueda3.getCodigoLibro();
									Boolean resultadoLocal3 = libroPrestado.equals(codigoLi);

									if (resultadoLocal3 == true) {
										String nuevoEstado = "Prestado";
										estado.setEstado(nuevoEstado);
										baseDatosLibro.add(estado);
										resultadoBusc = true;
									}

								}
								if (resultadoBusc == true) {

									System.out.println("LIBRO: ");
									baseDatosLibro.forEach(System.out::println);
								}
								System.out.println("Fecha de entrega: " + diaFinPresta);
							}

						} else {

						}

					} else if (literalBibliotecario == 'c' || literalBibliotecario == 'C') {
						System.out.println("Ingrese codigo del libro: ");
						String libroAplazado = lee.nextLine();
						System.out.println("Ingrese numero de cedula del estudiante al que presto libro: ");
						String cedula4 = lee.nextLine();

						Estudiante saveCedula = new Estudiante();
						saveCedula.setCedula(cedula4);
						Libro cedulaEstudiante = new Libro();
						cedulaEstudiante.getEstudiante().getCedula();
						baseDatosLibro.add(cedulaEstudiante);

						boolean resultado = false;

						for (int i = 0; i < baseDatosLibro.size(); i++) {

							Libro busqueda3 = baseDatosLibro.get(i);
							String codigoLibro = busqueda3.getCodigoLibro();
							boolean resultadoLocal = libroAplazado.equals(codigoLibro);

//							Libro busqueda4 = baseDatosLibro.get(i);
//							boolean resultadoLocal2 = cedula4.equals(busqueda4.getEstudiante().getCedula());

							if (resultadoLocal == true) {
								resultado = true;
							}

						}
						if (resultado == true) {
							System.out.println("LIBRO: ");
							baseDatosLibro.forEach(System.out::println);

							int opcionPrestacion;
							System.out.println("Seleccione una opcion");
							System.out.println("1. APLAZAR");
							System.out.println("2. NO APLAZAR");
							opcionPrestacion = leeInt.nextInt();

							if (opcionPrestacion == 1) {

								LocalDate diaHoyAplazar = LocalDate.now();
								LocalDate diaFinAplazado = diaHoyAplazar.plusDays(5);
								LocalDate nuevaFechaEntrega = diaFinAplazado.plusDays(5);
								System.out.println("Su nueva fecha de entrega es: " + nuevaFechaEntrega);
							}

						} else {
							System.out.println("Libro no fue encontrado en la base de datos");
						}

					} else {
						System.out.println("Esa opcion no se ha encontrado");
					}
				} while (opcionSalirBucle != 2);
			} else {
				System.out.println("Esa opcion es inexistente\n");

			}
		} while (opcion != 3);
	}

}
