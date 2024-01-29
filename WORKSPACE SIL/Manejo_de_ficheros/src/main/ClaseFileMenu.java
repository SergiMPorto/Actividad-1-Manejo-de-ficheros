package main;

import java.util.Scanner;

public class ClaseFileMenu {

	public static void main(String[] args) {
		 Almacen almacen = new Almacen();
	        Scanner scanner = new Scanner(System.in); 
	        
		int opcion =0;

		do {
		opcion = pintarMenu();
		switch (opcion) {
		case 1:
			System.out.println("*** INICIAR EL PROCESO -AÑADIR NUEVO ARTÍCULO- *** ");
			agregarArticulo(almacen, scanner);
			break;
		case 2:
		    System.out.println("*** INICIAR EL PROCESO -BORRAR ARTÍCULO POR ID- *** ");
		    borrarArticulo(almacen, scanner);
			break;
		case 3:
			System.out.println("*** INICIAR EL PROCESO -CONSULTAR ARTÍCULO POR ID- *** ");
			 consultarArticulo(almacen, scanner);
			break;
		case 4:
			System.out.println("*** INICIAR EL PROCESO -LISTADO DE TODOS LOS ARTICULOS- *** ");
			 listarArticulos(almacen);
			break;
		case 5:
			System.out.println("*** INICIAR EL PROCESO -EXPORTAR ARTÍCULOS A ARCHIVOS CSV- *** ");
			exportarACSV(almacen);
            almacen.guardarArticulosEnArchivo();
			break;
		case 6:
			// AL SELECCIONAR  LA OPCIÓN 6 EL PROGRAMA LLEGARA A SU FIN
			break;
			
		}
		
		}while(opcion != 6);
		
		System.out.println(" ★★★ FIN DE PROGRAMA ★★★ ");
		}
	

	public static int pintarMenu() {
		Scanner leer = new Scanner(System.in);
		int opcion=0;
		System.out.println("             ★★★★★ MENÚ ★★★★★              ");
		System.out.println("      ------------------------------------    ");
		System.out.println("  1.         AÑADIR NUEVO ARTÍCULO            ");
		System.out.println("  2.        BORRAR ARTÍCULO POR ID            ");
		System.out.println("  3.       CONSULTAR ARTÍCULO POR ID          ");
		System.out.println("  4.     LISTADO DE TODOS LOS ARTICULOS       ");
		System.out.println("  5.    EXPORTAR ARTÍCULOS A ARCHIVOS CSV     ");
		System.out.println("  6.                SALIR                     ");
		System.out.println(" PULSA UNA OPCION ENTRE 1 Y 5 PARA REALIZAR LA OPERACION O PULSA 6 PARA CERRAR EL PROCESO.");
		opcion=leer.nextInt();
     	while (opcion <1 || opcion >6 ) {
			System.out.println("PULAS UNA OPCION  DE 1 A 5");
			opcion=leer.nextInt();
			}
		return opcion;	
	}

	
	/*s
	 * METODOS DEL MENÚ
	 */
			
	private static void agregarArticulo(Almacen almacen, Scanner scanner) {
        System.out.print(" INTRODUCIR EL ID DEL ARTÍCULO: ");
        int id = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print(" INTRODUCIR EL NOMBRE DEL ARTÍCULO: ");
        String nombre = scanner.nextLine();

        System.out.print(" INTRODUCIR LA DESCRIPCIÓN DEL ARTÍCULO: ");
        String descripcion = scanner.nextLine();

        System.out.print(" INTRODUCIR LA CANTIDAD DEL ARTÍCULO: ");
        int stock = scanner.nextInt();

        System.out.print("INTRODUCIR EL PRECIO DEL ARTÍCULO: ");
        double precio = scanner.nextDouble();

        Articulo nuevoArticulo = new Articulo(id, nombre, descripcion, stock, precio);
        almacen.agregarArticulo(nuevoArticulo);
    }

    private static void borrarArticulo(Almacen almacen, Scanner scanner) {
        System.out.print("INTRODUCIR EL ID DEL ARTÍCULO  PARA REALIZAR EL PROCESO DE -BORRAR ARTICULO-: ");
        int id = scanner.nextInt();
        almacen.borrarArticuloPorId(id);
        System.out.println("EL PROCESO DE -BORRAR ARTÍCLULO- SE HA REZALIZADO CON EXISTO!");
    }

    private static void consultarArticulo(Almacen almacen, Scanner scanner) {
        System.out.print("INTRODUCIR EL ID DEL ARTÍCULO PARA REALIZAR LA CONSULTA : ");
        int id = scanner.nextInt();
        Articulo articulo = almacen.consultarArticuloPorId(id);
        if (articulo != null) {
            System.out.println(" INFORMACIÓN DEL ARTÍCULO :");
            System.out.println(articulo.toString());
        } else {
            System.out.println(" EL ARTÍCULO INTRODUCIDO NO SE PUEDE ENCONTRAR!");
        }
    }

    private static void listarArticulos(Almacen almacen) {
        System.out.println(" LISTADO DE TODOS LOS ARTÍCULOS: ");
        for (Articulo articulo : almacen.listarArticulos()) {
            System.out.println(articulo.toString());
        }
    }

    private static void exportarACSV(Almacen almacen) {
        almacen.exportarACSV(" ARTICULOS CSV ");
    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
