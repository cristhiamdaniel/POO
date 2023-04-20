/*
CALCULO DE LA NOMINA EMPLEANDO PROGRAMACION ESTRUCTURADA
 */

package ejemplo_00;

import java.util.Scanner;
public class Nomina {
    public static void main(String[] args){

        int numeroEmpleados;
        String[] cedulas = new String[50];
        String[] apellidos = new String[50];
        String[] nombres = new String[50];
        double[] horasTrabajadas = new double[50];
        double[] sueldoXHora = new double[50];
        String cedula, apellido, nombre;
        double horas, sueldo;
        double total = 0;

       Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de empleados: ");
        numeroEmpleados = scanner.nextInt();

        for (int i = 0; i < numeroEmpleados; i++) {
            System.out.println("Ingrese los datos del empleado " + (i + 1));
            System.out.print("Cédula: ");
            cedula = scanner.next();
            System.out.print("Apellido: ");
            apellido = scanner.next();
            System.out.print("Nombre: ");
            nombre = scanner.next();
            System.out.print("Horas trabajadas: ");
            horas = scanner.nextDouble();
            System.out.print("Sueldo por hora: ");
            sueldo = scanner.nextDouble();

            cedulas[i] = cedula;
            apellidos[i] = apellido;
            nombres[i] = nombre;
            horasTrabajadas[i] = horas;
            sueldoXHora[i] = sueldo;
        }

        for (int i = 0; i < numeroEmpleados; i++) {
            total = total + (horasTrabajadas[i] * sueldoXHora[i]);
        }
        System.out.println("El total de la nómina es: " + total);
    }
}