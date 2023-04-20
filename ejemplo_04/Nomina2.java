/*
Cuarta aproximación a la solución del problema de la nómina de empleados.

Temas:
- Atributos y Metodos estaticos
 */
package ejemplo_04;
import java.util.Scanner;
class Nomina2{
    public static void main(String[] args) {
        int numeroEmpleados = 0, opcionMenu = 0;
        Empleado[] losEmpleados = new Empleado[50];
        String cedula, apellido, nombre;
        double horas, sueldo;
        double total = 0;

        Scanner scanner = new Scanner(System.in);

        while (opcionMenu != 3) {
            System.out.println("1. Ingresar empleado");
            System.out.println("2. Calcular nomina");
            System.out.println("3. Salir");
            System.out.print("Ingrese una opcion: ");
            opcionMenu = scanner.nextInt();

            switch (opcionMenu) {
                case 1:
                    System.out.println("Ingrese los datos del empleado " + (numeroEmpleados + 1));
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

                    Empleado unEmpleado = new Empleado(cedula, apellido, nombre, horas, sueldo);

                    losEmpleados[numeroEmpleados] = unEmpleado;
                    numeroEmpleados++;
                    break;
                case 2:
                    for (int i = 0; i < numeroEmpleados; i++) {
                        total = total + losEmpleados[i].calcularSalario();
                    }
                    System.out.println("El total de la nómina es: " + total);
                    break;
                case 3:
                    System.out.println("Gracias por usar el programa");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;

            }
        }
    }

}