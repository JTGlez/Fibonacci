public class FBRecursivo {

    public double calcular(int n) {

        //Caso base.
        if (n == 0) {
            return 0;

        //Caso 1.
        } else if (n == 1) {
            return 1;

        //Caso recursivo.
        } else {

            return calcular(n - 1) + calcular(n - 2);

        }
    }
}