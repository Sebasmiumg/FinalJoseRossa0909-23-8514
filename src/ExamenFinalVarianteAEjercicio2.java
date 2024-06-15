import java.util.Scanner;

class Multiplo {
    private static int numero;

    public Multiplo(int numero) {
        this.numero = numero;
    }
    public static void Multiplicar() {
        System.out.println("Ingrese el" + numero + "a multiplicar" + ":");
        for (int i = 1; i <= 10; ++i){
            System.out.println(numero * i);
        }

class ExamenFinalVarianteAEjercicio2 {
            public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int numero;

            Multiplo multiplo = new Multiplo(scanner.nextInt());
            System.out.println("el resultado es:"+multiplo.numero);

            Multiplo.Multiplicar();
        }

}{
            {
            }
        }}
    }