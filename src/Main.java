import java.util.*;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String continuar;
        List<Mascotas2> lmascota = new ArrayList<>();
        Scanner teclado= new Scanner(System.in);
        int opc;

do {
    System.out.println("    MENU   ");
    System.out.println("1. Registrar mascota");
    System.out.println("2. Mostrar todas las mascotas");
    System.out.println("3. Buscar  por nombre");
    System.out.println("4. salir");
    System.out.println("Selecione umna opcion: ");
    opc = teclado.nextInt();
    teclado.nextLine();
    switch (opc) {
        case 1:
            System.out.println("----------REGISTRO DE MASCOTAS------------");
            String cont1;
            do{
            System.out.println(" Nombre ");
            String noMbrem = teclado.nextLine();
            System.out.println(" Especie ");
            String espeCie = teclado.nextLine();
            System.out.println(" Edad ");
            int edAd = teclado.nextInt();
            System.out.print("  Peso(kg) : ");
            double peSo = teclado.nextDouble();
            teclado.nextLine();
            System.out.print("¿Los datos son correctos? (si/no): ");
            cont1 = teclado.nextLine().trim().toLowerCase();

            if (cont1.equals("si")) {
                Mascotas2 m2mascotas = new Mascotas2(noMbrem, espeCie, edAd, peSo);
                lmascota.add(m2mascotas);
                System.out.println(" Mascota registrada correctamente.");
            } else {
                System.out.println("Volviendo a ingreso datos ");
            }
    }while (cont1.equals("no"));
            break;
        case 2:
            System.out.println("              LISTAS DE MASCOTAS           ");
            if (lmascota.isEmpty()) {
                System.out.println("No hay  mascotas registradas");
            }
             else{
        for (Mascotas2 B1 : lmascota) {
            System.out.println(B1.getNom());
        }
    }
            break;
        case 3:
            System.out.println("INGRESE DATOS");
            String bus = teclado.nextLine();
            Mascotas2 encontrado = null;
            for (Mascotas2 m : lmascota){
                if (m.getNom().equalsIgnoreCase(bus))   {
                encontrado = m;
                break;
                }
            }
            if (encontrado == null) {
                System.out.println(" Mascota no encontrada.");
            } else {
                System.out.println(" Mascota encontrada:");
                encontrado.mostrarDatos();

                // Submenu de acciones
                int opcion;
                do {
                    System.out.println("-- Acciones para " + encontrado.getNom() + " --");
                    System.out.println("1. Mostrar informacipn");
                    System.out.println("2. Alimentar mascota");
                    System.out.println("3. Vacunar mascota");
                    System.out.println("4. Cumpleaños (+1 año)");
                    System.out.println("5. Volver al menú");
                    System.out.print("Seleccione: ");
                    opcion =teclado.nextInt();
                    teclado.nextLine();

                    switch (opcion) {
                        case 1:
                            encontrado.mostrarDatos();
                            break;
                        case 2:
                            System.out.print("Cantidad de alimento (kg): ");
                            double cantidad = teclado.nextDouble();
                            teclado.nextLine();
                            encontrado.alimentar(cantidad);
                            break;
                        case 3:
                            encontrado.vacunar();
                            break;
                        case 4:
                            encontrado.cumplirAnios();
                            break;
                        case 5:
                            System.out.println("Volviendo al menú...");
                            break;
                        default:
                            System.out.println("Opción no válida.");
                    }
                } while (opcion > 6);
            }
            break;

        case 4:
            System.out.println(" Saliendo del sistema...");
            break;

        default:
            System.out.println(" Opción no válida.");
    }

} while (opc != 4);


       /* System.out.print("¿Los datos son correctos? (si/no): ");
        continuar = sc.nextLine().trim().toLowerCase();  esta cadena de caracteristicas se
        usan para determinar errorres en string como mayuscolas espacios y lee los que maingrese el usuario
*/




        teclado.close();


}
}