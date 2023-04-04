import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int opcion = 0;

        do{

            System.out.println("\nAlgoritmo de Fibonacci. Selecciona la forma de calcular el algoritmo:" +
            "\n1)Recursivo\n2)Iterativo\n3)Salir del programa\n");

            System.out.print("\nOpción: ");
            opcion = scanner.nextInt();

            switch(opcion){

                case 1:
                    FBRecursivo resultado = new FBRecursivo();
                    System.out.print("Ingresa el valor n para calcular hasta ese punto la secuencia: ");
                    int n = scanner.nextInt();
                    System.out.println("El resultado de la secuencia recursiva hasta " + n + " es: " + resultado.calcular(n));
                    break;

                case 2:
                    FBIterativo resultado2 = new FBIterativo();
                    System.out.print("Ingresa el valor n para calcular hasta ese punto la secuencia: ");
                    int n2 = scanner.nextInt();
                    System.out.println("El resultado de la secuencia iterativa hasta " + n2 + " es: " + resultado2.calcular(n2));
                    break;

                case 3:
                    System.out.println("\nPrograma finalizado.");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("\nIngrese una opción válida.");

            }

        } while(opcion!=3);
        
    }
    
}
