package problema2_ejecutarempleado;

public class Empleado {

    private int edad;
    private double salario;
    private String nombre;

    public Empleado(String nombre, double salario, int edad) {
        this.nombre = nombre;
        this.salario = salario;
        this.edad = edad;
    }

    public String setNombre(String nombre) {
        this.nombre = nombre;
        return this.nombre;
    }

    public double setSalario(double salario) {
        this.salario = salario;
        return this.salario;
    }

    public int setEdad(int edad) {
        this.edad = edad;
        return this.edad;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSalario() {
        return salario;
    }

    public int getEdad() {
        return edad;
    }

    public boolean salarioMenorPromedio(double promedio) {
        return this.salario < promedio;
    }

    public void aumento(double porcentaje) {
        this.salario = this.salario * ((100 + porcentaje)/100);
    }

   
}