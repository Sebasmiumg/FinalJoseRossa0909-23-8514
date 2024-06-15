import java.util.Scanner;

class Datos {
    private int numero;
    private int numero1;
    private int numero2;

    public Datos(int numero) {
        this.numero = numero;
    }
}
public class ExamenFinalVarianteAEjercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el caracter No.1: ");
        String numero1 = scanner.nextLine();
        System.out.println(numero1);

        System.out.print("Ingrese el caracter No.2: ");
        String numero2 = scanner.nextLine();
        System.out.println(numero2);

        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicacion");
        System.out.println("4. Division");

        // Leer la opción seleccionada por el usuario
        System.out.print("Ingresa el número de ejercicio que deseas ejecutar: ");
        int opcion = scanner.nextInt();

        // Ejecutar el ejercicio seleccionado
        switch (opcion) {
            case 1:
                numero1 += numero2;
                break;
            case 2:
                numero1 -= numero2 ;
                break;
            case 3:
                numero1 += numero2;
                break;
            case 4:
                numero1 += numero2;
                break;
            default:
                System.out.println("Opción no válida. Por favor ingresa un número del 1 al 7.");
                break;
    }
}
    {
    }

}
