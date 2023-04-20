package tallerVehiculo;

/*
Definir la clase ```Vehículo```: Todo vehículo debe tener atributos como ```Placa``` (de tipo string), ```Marca``` (de tipo string) y ```Motor``` (de tipo Motor). Debe tener dos (2) constructores sobrecargados. El primer constructor recibe placa y marca, el motor debe instanciarse con datos por defecto. El otro constructor recibe placa, marca, cilindrada, velocidadmax, caballosfuerza y tipocombustible. La clase debe tener un método público, llamado ```imprimir()``` que permita conocer las características del vehículo y su motor.
*/
public class Vehiculo {
    private String placa;
    private String marca;
    private Motor motor;

    public Vehiculo(String placa, String marca) {
        this.placa = placa;
        this.marca = marca;
        this.motor = new Motor(1400,240,4,"Diesel");
    }

    public Vehiculo(String placa, String marca, int cilindrada, double velocidadMax, int caballosFuerza, String tipoCombustible) {
        this.placa = placa;
        this.marca = marca;
        this.motor = new Motor(cilindrada, velocidadMax, caballosFuerza, tipoCombustible);
    }

    public void imprimir() {
        System.out.println("Placa: " + placa);
        System.out.println("Marca: " + marca);
        motor.imprimir();
    }

    /*
    METODOS GET Y SET
     */

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }
    /*
        public String getPlaca(): Este método se utiliza para obtener el valor de la placa del vehículo, que es de tipo String. Devuelve el valor actual de la placa.

    public void setPlaca(String placa): Este método se utiliza para establecer el valor de la placa del vehículo. Toma un parámetro de tipo String que representa el nuevo valor de la placa y lo asigna al atributo "placa".

    public String getMarca(): Este método se utiliza para obtener el valor de la marca del vehículo, que es de tipo String. Devuelve el valor actual de la marca.

    public void setMarca(String marca): Este método se utiliza para establecer el valor de la marca del vehículo. Toma un parámetro de tipo String que representa el nuevo valor de la marca y lo asigna al atributo "marca".

    public Motor getMotor(): Este método se utiliza para obtener el objeto "Motor" del vehículo. Devuelve el objeto "Motor" actual del vehículo.

    public void setMotor(Motor motor): Este método se utiliza para establecer el objeto "Motor" del vehículo. Toma un parámetro de tipo "Motor" que representa el nuevo objeto "Motor" y lo asigna al atributo "motor".

En resumen, estos métodos permiten obtener y establecer los valores de los atributos de la clase "Vehiculo". Los métodos "get" se utilizan para obtener el valor de un atributo y los métodos "set" se utilizan para establecer el valor de un atributo. Además, el método "getMotor" y "setMotor" permiten obtener y establecer el objeto "Motor" de la clase "Vehiculo".
     */

    /*
    4. En la clase Vehiculo se debe contar con un metodo estatico para comparar los motores de 2 objetos de tipo vehiculo. La comparacion debe permitir comparar la cilindrada de los motores, de manera que indique, cual es el mejor vehiculo y en caso de que sean iguales, mostrar el mensaje respectivo. Este metodo estatico recibe como parametros 2 objetos de tipo vehiculo para poder compararlo.
     */

    public static void compararMotores(Vehiculo vehiculo1, Vehiculo vehiculo2) {
        if (vehiculo1.getMotor().getCilindrada() > vehiculo2.getMotor().getCilindrada()) {
            System.out.println("El vehiculo 1 es mejor");
        } else if (vehiculo1.getMotor().getCilindrada() < vehiculo2.getMotor().getCilindrada()) {
            System.out.println("El vehiculo 2 es mejor");
        } else {
            System.out.println("Los vehiculos tienen la misma cilindrada");
        }
    }

    /*
        public static void compararMotores(Vehiculo vehiculo1, Vehiculo vehiculo2): Este es un método estático que toma dos parámetros de tipo "Vehiculo" llamados "vehiculo1" y "vehiculo2". Este método se utiliza para comparar la cilindrada de los motores de ambos vehículos.

    if (vehiculo1.getMotor().getCilindrada() > vehiculo2.getMotor().getCilindrada()): Este es un condicional que compara la cilindrada del motor de "vehiculo1" con la cilindrada del motor de "vehiculo2" utilizando los métodos "get" de la clase "Motor". Si la cilindrada del motor de "vehiculo1" es mayor que la cilindrada del motor de "vehiculo2", entonces se imprimirá el mensaje "El vehiculo 1 es mejor".

    else if (vehiculo1.getMotor().getCilindrada() < vehiculo2.getMotor().getCilindrada()): Si la cilindrada del motor de "vehiculo1" es menor que la cilindrada del motor de "vehiculo2", entonces se imprimirá el mensaje "El vehiculo 2 es mejor".

    else: Si la cilindrada del motor de "vehiculo1" es igual a la cilindrada del motor de "vehiculo2", entonces se imprimirá el mensaje "Los vehiculos tienen la misma cilindrada".


    Un método estático en Java se puede llamar sin la necesidad de instanciar un objeto de la clase en la que se encuentra. En otras palabras, un método estático pertenece a la clase en sí misma y no a una instancia particular de la clase.

Existen algunas situaciones en las que es útil tener métodos estáticos en una clase. Algunos de los casos más comunes incluyen:

    Funcionalidad compartida: Si una funcionalidad es compartida por todas las instancias de una clase, entonces es más apropiado definirla como un método estático. Por ejemplo, un método que convierte una cadena en mayúsculas podría ser definido como estático si esa funcionalidad es compartida por todas las instancias de una clase.

    Acceso a atributos estáticos: Los métodos estáticos pueden acceder a los atributos estáticos de una clase. Esto puede ser útil si necesitas realizar algún tipo de operación en base a esos atributos estáticos.

    Utilidad de clase: En algunos casos, puede haber métodos que no necesitan una instancia particular de la clase para ser ejecutados, pero que aún tienen sentido en el contexto de la clase. Por ejemplo, una clase "Math" podría tener métodos estáticos para realizar operaciones matemáticas comunes como la raíz cuadrada o el valor absoluto.

     */


}

/*
La clase "Vehiculo" es una clase en Java que representa un vehículo. Tiene tres atributos privados: "placa", "marca" y "motor". "placa" y "marca" son de tipo String y representan la placa y la marca del vehículo, respectivamente. "motor" es de tipo "Motor", una clase que representa el motor del vehículo.

La clase "Vehiculo" tiene dos constructores: uno que toma como parámetros la placa y la marca del vehículo, y otro que toma como parámetros la placa, la marca y los valores del motor. El primer constructor crea un nuevo objeto "Motor" con valores predeterminados de cilindrada, velocidad máxima, caballos de fuerza y tipo de combustible. El segundo constructor crea un objeto "Motor" con los valores proporcionados.

La clase "Vehiculo" tiene un método llamado "imprimir" que se utiliza para imprimir los valores de los atributos del objeto en la consola. Este método utiliza la función "System.out.println" para imprimir la placa y la marca del vehículo y luego llama al método "imprimir" del objeto "motor" para imprimir los valores de los atributos del motor.

En resumen, la clase "Vehiculo" es una clase que representa un vehículo y tiene tres atributos: "placa", "marca" y "motor". Tiene dos constructores para crear un objeto "Vehiculo" con diferentes valores para sus atributos y un método para imprimir los valores de sus atributos, incluyendo los atributos del objeto "motor".
 */