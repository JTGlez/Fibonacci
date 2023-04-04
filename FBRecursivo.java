public class FBRecursivo {

    private double[] valores = new double[100000];

    public double calcular(int n) {

        //Caso base.
        if (n == 0) {
            return 0;

        //Caso 1.
        } else if (n == 1) {
            return 1;

        //Valores ya calculados.
        } else if (valores[n] != 0) {
            return valores[n];

        //Caso recursivo.
        } else {

            double calculo = calcular(n - 1) + calcular(n - 2);
            valores[n] = calculo;
            System.out.println("Actual: " + calculo);
            return calculo;

        }
    }
}