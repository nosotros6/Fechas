import java.util.Scanner;

public class Fechas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario la primera fecha
        System.out.println("Ingrese la primera fecha como DD/MM/AAAA:");
        String fecha1Str = scanner.nextLine();

        // Solicitar al usuario la segunda fecha
        System.out.println("Ingrese la segunda fecha como DD/MM/AAAA:");
        String fecha2Str = scanner.nextLine();

        // Obtener día, mes y año de la primera fecha
        int dia1 = Integer.parseInt(fecha1Str.substring(0, 2));
        int mes1 = Integer.parseInt(fecha1Str.substring(3, 5));
        int anio1 = Integer.parseInt(fecha1Str.substring(6));

        // Obtener día, mes y año de la segunda fecha
        int dia2 = Integer.parseInt(fecha2Str.substring(0, 2));
        int mes2 = Integer.parseInt(fecha2Str.substring(3, 5));
        int anio2 = Integer.parseInt(fecha2Str.substring(6));

        // Comparar las fechas
        if (anio1 > anio2) {
            System.out.println("La persona 1 es mayor.");
        } else if (anio1 < anio2) {
            System.out.println("La persona 2 es mayor.");
        } else if (mes1 > mes2) {
            System.out.println("La persona 1 es mayor.");
        } else if (mes1 < mes2) {
            System.out.println("La persona 2 es mayor.");
        } else if (dia1 > dia2) {
            System.out.println("La persona 1 es mayor.");
        } else if (dia1 < dia2) {
            System.out.println("La persona 2 es mayor.");
        } else {
            System.out.println("Tienen la misma edad.");
        }

        scanner.close();
    }
}
