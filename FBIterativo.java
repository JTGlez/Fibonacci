public class FBIterativo {

    public double calcular(int n){

        //Caso base.
        if (n == 0) {
            return 0;

        //Caso 1.
        } else if (n == 1) {
            return 1;

        //Ciclo for.
        } else {

            double x = 0;
            double y = 1;
            double calculo = 0;

            for (int i = 2; i <= n; i++) {
                calculo = x + y;
                x = y;
                y = calculo;
            }
            return calculo;
        }
    }
}