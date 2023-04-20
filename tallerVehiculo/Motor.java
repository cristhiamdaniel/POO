package tallerVehiculo;
/*
 Definir la clase ```Motor```: Todo motor debe tener atributos como
 ```Cilindrada``` (de tipo entero),
 ```VelocidadMax``` (de tipo double),
 ```CaballosFuerza``` (de tipo entero) y
 ```TipoCombustible``` (de tipo string).
 Estos atributos deben ser privados.
 El constructor debe recibir los parámetros cuando se instancie un objeto.
 La clase debe tener un método público, llamado ```imprimir()``` que permita conocer las características del motor.
 Ejemplo de datos de un motor:
 ```(Cilindrada: 1400, VelocidadMax: 240, CaballosFuerza: 4, TipoCombustible: Diesel)```
*/
public class Motor {
    private int cilindrada;
    private double velocidadMax;
    private int caballosFuerza;
    private String tipoCombustible;

    public Motor(int cilindrada, double velocidadMax, int caballosFuerza, String tipoCombustible) {
        this.cilindrada = cilindrada;
        this.velocidadMax = velocidadMax;
        this.caballosFuerza = caballosFuerza;
        this.tipoCombustible = tipoCombustible;
    }

    public void imprimir() {
        System.out.println("Cilindrada: " + cilindrada);
        System.out.println("VelocidadMax: " + velocidadMax);
        System.out.println("CaballosFuerza: " + caballosFuerza);
        System.out.println("TipoCombustible: " + tipoCombustible);
    }

    /*
    METODOS GET Y SET
     */
    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public double getVelocidadMax() {
        return velocidadMax;
    }

    public void setVelocidadMax(double velocidadMax) {
        this.velocidadMax = velocidadMax;
    }

    public int getCaballosFuerza() {
        return caballosFuerza;
    }

    public void setCaballosFuerza(int caballosFuerza) {
        this.caballosFuerza = caballosFuerza;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }
    /*
    Esta es la implementación de los métodos "get" y "set" en la clase "Motor". Los métodos "get" se utilizan para obtener el valor de un atributo y los métodos "set" se utilizan para establecer el valor de un atributo.

Aquí hay una explicación de cada uno de los métodos:

    public int getCilindrada(): Este método se utiliza para obtener el valor de la cilindrada del motor, que es de tipo int. Devuelve el valor actual de la cilindrada.

    public void setCilindrada(int cilindrada): Este método se utiliza para establecer el valor de la cilindrada del motor. Toma un parámetro de tipo int que representa el nuevo valor de la cilindrada y lo asigna al atributo "cilindrada".

    public double getVelocidadMax(): Este método se utiliza para obtener el valor de la velocidad máxima del motor, que es de tipo double. Devuelve el valor actual de la velocidad máxima.

    public void setVelocidadMax(double velocidadMax): Este método se utiliza para establecer el valor de la velocidad máxima del motor. Toma un parámetro de tipo double que representa el nuevo valor de la velocidad máxima y lo asigna al atributo "velocidadMax".

    public int getCaballosFuerza(): Este método se utiliza para obtener el valor de los caballos de fuerza del motor, que es de tipo int. Devuelve el valor actual de los caballos de fuerza.

    public void setCaballosFuerza(int caballosFuerza): Este método se utiliza para establecer el valor de los caballos de fuerza del motor. Toma un parámetro de tipo int que representa el nuevo valor de los caballos de fuerza y lo asigna al atributo "caballosFuerza".

    public String getTipoCombustible(): Este método se utiliza para obtener el valor del tipo de combustible del motor, que es de tipo String. Devuelve el valor actual del tipo de combustible.

    public void setTipoCombustible(String tipoCombustible): Este método se utiliza para establecer el valor del tipo de combustible del motor. Toma un parámetro de tipo String que representa el nuevo valor del tipo de combustible y lo asigna al atributo "tipoCombustible".

En resumen, estos métodos permiten obtener y establecer los valores de los atributos de la clase "Motor". Los métodos "get" se utilizan para obtener el valor de un atributo y los métodos "set" se utilizan para establecer el valor de un atributo.
     */

}

/*
Este código define una clase llamada "Motor" que tiene cuatro atributos: cilindrada, velocidadMax, caballosFuerza y tipoCombustible. Todos estos atributos son de tipos diferentes, como entero (int), doble (double) y cadena de caracteres (String).

La clase Motor también tiene un constructor, que es un método especial utilizado para inicializar los atributos de un objeto cuando se crea una instancia de la clase. El constructor tiene cuatro parámetros, cada uno correspondiente a uno de los atributos de la clase.

Dentro del constructor, los valores de los parámetros se asignan a los atributos correspondientes de la clase utilizando la palabra clave "this". La palabra clave "this" se utiliza para hacer referencia a la instancia actual de la clase y se utiliza para distinguir entre los nombres de parámetros y atributos.

Finalmente, la clase Motor tiene un método llamado "imprimir", que se utiliza para imprimir los valores de los atributos en la consola. El método simplemente utiliza la función de impresión de la clase System.out.println para imprimir cada atributo con un mensaje descriptivo.

En resumen, este código define una clase llamada "Motor" que tiene cuatro atributos y un constructor que inicializa los atributos de la clase. Además, la clase tiene un método que imprime los valores de los atributos en la consola. Este código es un ejemplo básico de cómo se puede definir una clase en Java y cómo se pueden inicializar y acceder a los atributos de la clase.
*/