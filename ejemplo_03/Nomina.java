/*
Tercera aproximacion al problema de la nomina de empleados.

Temas:

- Encapsulamiento
 */
package ejemplo_03;

import java.util.Scanner;
public class Nomina {
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

* Como se definen dos clases publicas estas deben crearse en archivos independientes.
En Java no puede haber dos clases publicas definidas en un mismo archivo.

* Se ha agregado codigo de validaciones simples a cada uno de los metodos modificadores
de los atributos.

*  Note que el constructor de la clase ya no le asigna valroes directamente a los
atributos, sino que ahora utiliza los metodos modificadores; con esto se garantiza
que a la hora de crear un nuevo objeto de la clase se cumplan las validaciones.

* Note que el metodo para alterar el valor del atributo cedula de la clase Empleado
es privado. Al definirlo de esta manera, desde ninguna otra clase distinta a Empleado
prodra ser invocado.

 */
