package ejemplo_03;

public class Empleado {
    private String cedula;
    private String apellido;
    private String nombre;
    private double horasTrabajadas;
    private double sueldoXHora;

    public Empleado(String cedula, String apellido, String nombre, double horasTrabajadas, double sueldoXHora) {
        setCedula(cedula);
        setApellido(apellido);
        setNombre(nombre);
        setHorasTrabajadas(horasTrabajadas);
        setSueldoXHora(sueldoXHora);
    }
    public double calcularSalario() {
        return horasTrabajadas * sueldoXHora;
    }
    public String getCedula() {
        return cedula;
    }
    private void setCedula(String cedula) {
        if (cedula!=null) {
            this.cedula = cedula;
        }
        else {
            this.cedula = "";
        }
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        if (apellido!=null) {
            this.apellido = apellido;
        }
        else {
            this.apellido = "";
        }
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        if (nombre!=null) {
            this.nombre = nombre;
        }
        else {
            this.nombre = "";
        }
    }
    public double getHorasTrabajadas() {
        return horasTrabajadas;
    }
    public void setHorasTrabajadas(double horasTrabajadas) {
        if (horasTrabajadas>=0) {
            this.horasTrabajadas = horasTrabajadas;
        }
        else {
            this.horasTrabajadas = 0;
        }
    }
    public double getSueldoXHora() {
        return sueldoXHora;
    }
    public void setSueldoXHora(double sueldoXHora) {
        if (sueldoXHora>=0) {
            this.sueldoXHora = sueldoXHora;
        }
        else {
            this.sueldoXHora = 0;
        }
    }
}