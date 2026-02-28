import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String noMbrem, espeCie,continuar;
        int edAd;
        double peSo;
        int dat = 1;

    do

    {
        System.out.println("----------REGISTRO DE MASCOTAS------------");
        System.out.println(" Nombre ");
        noMbrem = sc.nextLine();
        System.out.println(" Especie ");
        espeCie = sc.nextLine();
        System.out.println(" Edad ");
        edAd = sc.nextInt();
        System.out.print("  Peso(kg) : ");
        peSo = sc.nextDouble();
        sc.nextLine();



        System.out.print("¿Los datos son correctos? (si/no): ");
        continuar = sc.nextLine().trim().toLowerCase(); /* esta cadena de caracteristicas se
        usan para determinar errorres en string como mayuscolas espacios y lee los que maingrese el usuario
*/

    } while (continuar.equals("no"));
        Mascotas2 miMascota = new Mascotas2(noMbrem, espeCie, edAd, peSo);
        System.out.println("sus registron son ");
        miMascota.mostrarDatos();


        int opcion;
     do

    {

        System.out.println(" CLÍNICA VETERINARIA 🐾      ");
        System.out.println("1. Mostrar información       ");
        System.out.println("2. Alimentar mascota         ");
        System.out.println("3. Vacunar mascota           ");
        System.out.println("4. Cumpleaños  (+ 1 año)     ");
        System.out.println("0. Salir                     ");
        System.out.print("Seleccione una opción: ");
        opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                miMascota.mostrarDatos();
                break;
            case 2:
                System.out.print("Cantidad de alimento (kg): ");
                double cantidad = sc.nextDouble();
                miMascota.alimentar(cantidad);
                break;
            case 3:
                miMascota.vacunar();
                break;
            case 4:
                miMascota.cumplirAnios();
                break;
            case 0:
                System.out.println(" Saliendo...");
                break;
            default:
                System.out.println("️  Opción no válida.");
        }

    } while(opcion !=0);



        System.out.println("   ESTADO FINAL DE LA MASCOTA");

        miMascota.mostrarDatos();

        sc.close();


}
}