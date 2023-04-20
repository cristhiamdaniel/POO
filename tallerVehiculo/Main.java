package tallerVehiculo;
/*
Elabore un programa en Java, que permita instanciar por lo menos 2 objetos de tipo vehiculo, para utilizar los dos metodos constructores,
 */
public class Main {
    public static void main(String[] args) {
        /*

        // Instanciar dos objetos tipo Motor

        Motor motor1 = new Motor(1400, 240, 4, "Diesel");
        motor1.imprimir();
        System.out.println("--------------------");
        Motor motor2 = new Motor(1600, 260, 6, "Gasolina");
        motor2.imprimir();
        System.out.println("--------------------");
        Vehiculo vehiculo1 = new Vehiculo("ABC-123", "Toyota");
        Vehiculo vehiculo2 = new Vehiculo("DEF-456", "Mazda", 1600, 260, 6, "Gasolina");
        vehiculo1.imprimir();
        System.out.println("--------------------");
        vehiculo2.imprimir();
        System.out.println("--------------------");

        // Utilizando los métodos "get" y "set" de la clase "Vehiculo" para modificar y obtener valores de los atributos
        System.out.println("Placa vehiculo1 antes del cambio: " + vehiculo1.getPlaca());
        vehiculo1.setPlaca("GHI-789");
        System.out.println("Placa vehiculo1 después del cambio: " + vehiculo1.getPlaca());

        System.out.println("Marca vehiculo2 antes del cambio: " + vehiculo2.getMarca());
        vehiculo2.setMarca("Ford");
        System.out.println("Marca vehiculo2 después del cambio: " + vehiculo2.getMarca());

        // Utilizando los métodos "get" y "set" de la clase "Motor" para modificar y obtener valores de los atributos
        System.out.println("Cilindrada del motor de vehiculo1 antes del cambio: " + vehiculo1.getMotor().getCilindrada());
        vehiculo1.getMotor().setCilindrada(1200);
        System.out.println("Cilindrada del motor de vehiculo1 después del cambio: " + vehiculo1.getMotor().getCilindrada());

        System.out.println("Tipo de combustible del motor de vehiculo2 antes del cambio: " + vehiculo2.getMotor().getTipoCombustible());
        vehiculo2.getMotor().setTipoCombustible("Gas");
        System.out.println("Tipo de combustible del motor de vehiculo2 después del cambio: " + vehiculo2.getMotor().getTipoCombustible());
        System.out.println("--------------------");
        System.out.println("Imprimiendo los objetos vehiculo1 y vehiculo2 después de los cambios");
        System.out.println("--------------------");
        System.out.println("Vehiculo1");
        vehiculo1.imprimir();
        System.out.println("--------------------");
        System.out.println("Vehiculo2");
        vehiculo2.imprimir();

        */

        // Llamando al método estático "compararMotores"
        Vehiculo vehiculo1 = new Vehiculo("ABC-123", "Toyota");
        Vehiculo vehiculo2 = new Vehiculo("DEF-456", "Mazda", 1600, 260, 6, "Gasolina");
        Vehiculo.compararMotores(vehiculo1, vehiculo2);
    }

}
