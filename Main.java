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
                    double tiempoProm = 0;

                    for (int i = 0; i < 100; i++){
                        long tiempoInicio = System.nanoTime();
                        System.out.println("El resultado de la secuencia recursiva hasta " + n + " es: " + resultado.calcular(n));
                        long tiempoFin = System.nanoTime();
                        long tiempoTotal = tiempoFin - tiempoInicio;
                        System.out.println("\nTiempo total de ejecución: " + (double)(tiempoTotal)/1000000  + " milisegundos.");
                        tiempoProm = tiempoProm + (double)(tiempoTotal)/1000000;
                    }
                    
                    System.out.println("\nPromedio de 100 ejecuciones: " + (double)(tiempoProm/100) + " milisegundos.");
            

                    break;

                case 2:

                    FBIterativo resultado2 = new FBIterativo();
                    System.out.print("Ingresa el valor n para calcular hasta ese punto la secuencia: ");
                    int n2 = scanner.nextInt();
                    double tiempoProm2 = 0;

                    for (int i = 0; i < 100; i++){
                        long tiempoInicio2 = System.nanoTime();
                        System.out.println("El resultado de la secuencia iterativa hasta " + n2 + " es: " + resultado2.calcular(n2));
                        long tiempoFin2 = System.nanoTime();
                        long tiempoTotal2 = tiempoFin2 - tiempoInicio2;
                        System.out.println("\nTiempo total de ejecución: " + (double)(tiempoTotal2)/1000000  + " milisegundos.");
                        tiempoProm2 = tiempoProm2 + (double)(tiempoTotal2)/1000000;
                    }
                    
                    System.out.println("\nPromedio de 100 ejecuciones: " + (double)(tiempoProm2/100) + " milisegundos.");

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
