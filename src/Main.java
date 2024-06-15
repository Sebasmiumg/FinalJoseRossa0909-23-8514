import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el caracter No.1: ");
        char resultado1 = scanner.nextLine().charAt(0);
        System.out.println(resultado1);

        System.out.print("Ingrese el caracter No.2: ");
        char resultado2 = scanner.nextLine().charAt(0);
        System.out.println(resultado2);

        System.out.print("Ingrese el caracter No.3: ");
        char resultado3 = scanner.nextLine().charAt(0);
        System.out.println(resultado3);
    }
}