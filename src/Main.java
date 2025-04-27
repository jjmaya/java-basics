import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nombre = "Tony Stark";
        String tipoCuenta = "Corriente";
        double saldo = 1599.99;
        int opcion = 0;

        System.out.println("****************");
        System.out.println("\nNombre del cliente: " + nombre);
        System.out.println("El tipo de cuenta es: " + tipoCuenta);
        System.out.println("Su saldo disponble es: $" + saldo);
        System.out.println("\n****************\n");

        String menu = """
                *** Escriba el numero de la opción deseada ***
                1 - Consultar saldo.
                2 - Retirar.
                3 - Deositar.
                9 - Salir.
                """;
        Scanner teclado = new Scanner(System.in);
        while (opcion != 9){
            System.out.println(menu);
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Su saldo disponble es: $" + saldo);
                    break;
                case 2:
                    System.out.println("¿Cuál es el valor que desea retirar?");
                    double valorRetirar = teclado.nextDouble();
                    if (saldo >= valorRetirar) {
                        saldo -= valorRetirar;
                        System.out.println("Su saldo actual es: $" + saldo);
                    } else {
                        System.out.println("No posee los fondos suficiente para retirar esta cantiad de dinero.");
                    }
                    break;
                case 3:
                    System.out.println("¿Cuál es el valor a depositar?");
                    double valorDeposito = teclado.nextDouble();
                    saldo += valorDeposito;
                    System.out.println("Su saldo actual es: $" + saldo);
                    break;
                case 9:
                    System.out.println("Gracias por utliar nuestros servicios");
                    break;
                default:
                    System.out.println("Opción no valida.");
            }

        }

    }
}