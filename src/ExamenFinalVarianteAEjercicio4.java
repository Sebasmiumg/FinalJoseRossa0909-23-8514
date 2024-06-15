import java.util.Scanner;
class Numeros {
    private int valor;

    public Numeros(int valor) {
        this.valor = valor;
    }

    public boolean esPar() {
        return valor / 2 == 0;
    }

    public int getValor() {
        return valor;
    }
}
public class ExamenFinalVarianteAEjercicio4 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese un número entero
        System.out.print("Por favor, ingresa un número entero: ");
        int numero = scanner.nextInt(); //leer el entero ingresado por el usuario por la entrada estandar.

        Numeros numeros = new Numeros(numero);
        // Determinar si el número es par o impar
        if (numero / 2 == 0) {
            System.out.println("El número " + numero + " es primo.");
        } else {
            System.out.println("El número " + numero + " no es primo.");
        }

        // Cerrar el objeto Scanner
        scanner.close();
    }
}
