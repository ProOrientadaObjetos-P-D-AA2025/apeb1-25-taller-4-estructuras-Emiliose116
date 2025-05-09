package problema2_ejecutarempleado;

import java.util.Scanner;

public class Problema2_EjecutarEmpleado {

    private static Empleado[] empleados = new Empleado[100]; // Puedes ajustar el tamaño
    private static int contador = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean bandera = true;
        String salida;

        while (bandera) {
            System.out.print("Ingrese el nombre del empleado: ");
            String nombre = scanner.nextLine();

            System.out.print("Ingrese el salario del empleado: ");
            double salario = scanner.nextDouble();

            System.out.print("Ingrese la edad del empleado: ");
            int edad = scanner.nextInt();
            scanner.nextLine();

            agregarEmpleado(nombre, salario, edad);

            System.out.print("¿Desea ingresar otro empleado? presione s");
            salida = scanner.nextLine().toLowerCase();
            
            if (salida.equals("s")) {
                bandera = true;
            } else {
                bandera = false;
            }

        }

        mostrarEmpleado();

        double suma = 0;
        for (int i = 0; i < contador; i++) {
            suma += empleados[i].getSalario();
        }
        double promedio = suma / contador;
        System.out.println("Salario promedio: " + promedio);

        System.out.print("Ingrese el porcentaje de aumento para empleados con salario menor al promedio: ");
        double porcentajeAumento = scanner.nextDouble();

        for (int i = 0; i < contador; i++) {
            if (empleados[i].salarioMenorPromedio(promedio)) {
                empleados[i].aumento(porcentajeAumento);
            }
        }

        System.out.println("\nEmpleados luego del posible aumento:");
        mostrarEmpleado();
    }

    public static void agregarEmpleado(String nombre, double salario, int edad) {
        empleados[contador] = new Empleado(nombre, salario, edad);
        contador++;
    }

    public static void mostrarEmpleado() {
        for (int i = 0; i < contador; i++) {
            System.out.printf("Empleado: %s\nSalario: %.2f\nEdad: %d\n\n", empleados[i].getNombre(), empleados[i].getSalario(), empleados[i].getEdad());
        }
    }
}
