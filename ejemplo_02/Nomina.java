/*
SEGUNDA APROXIMACION DEL CALCULO DE LA NOMINA DE UNA EMPRESA

Temas:
- Metodos
- Metodo constructor
 */
package ejemplo_02;

import java.util.Scanner;
class Nomina {
    public static void main(String[] args){
        int numeroEmpleados;
        Empleado[] losEmpleados = new Empleado[50];
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

            Empleado unEmpleado = new Empleado(cedula, apellido, nombre, horas, sueldo);
            losEmpleados[i] = unEmpleado;
        }

        for (int i = 0; i < numeroEmpleados; i++) {
            total = total + losEmpleados[i].calcularSalario();
        }

        System.out.println("El total de la nómina es: " + total);
    }
}

/*
Puntos convenientes a resaltar en el codigo anterior:

* El proceso de instanciacion de un objeto de la clase Empleado ahora es mucho mas simple.

* Cuando se requiere calcular cuanto devenga un empleado por concepto de salario
se invoca la ejecucion del meodo calcularSalario() de la clase Empleado.
 */