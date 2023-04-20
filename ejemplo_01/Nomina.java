/*
Primera aproximacion a la aplicacion del calculo de la nomina
mediante programacion orientada a objetos

Temas:
- Clases
- Objetos
- Instanciacion
- Atributos
 */
package ejemplo_01;

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

            Empleado unEmpleado = new Empleado();
            unEmpleado.cedula = cedula;
            unEmpleado.apellido = apellido;
            unEmpleado.nombre = nombre;
            unEmpleado.horasTrabajadas = horas;
            unEmpleado.sueldoXHora = sueldo;

            losEmpleados[i] = unEmpleado;
        }

        for (int i = 0; i < numeroEmpleados; i++) {
            total = total + losEmpleados[i].sueldoXHora * losEmpleados[i].horasTrabajadas;
        }
        System.out.println("El total de la nómina es: " + total);
    }

}

/*
Puntos a resaltar en /ejemplo_00/Nomina.java:
* Note que en vez de tener arrays independientes para cada uno de los datos a registrar de un empleado
(como la cedula, apellido, etc) en este codigo se crea un unico array
de elementos de tipo Empleado.
* Note como es la manipulacion del array de objetos de tipo Empleado que lleva
por nombre losEmpleados.
 */