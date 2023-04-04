public class FBIterativo {


    public int calcular(int n){

        //Caso base.
        if (n == 0) {
            return 0;

        //Caso 1.
        } else if (n == 1) {
            return 1;

        //Ciclo for.
        } else {

            int x = 0;
            int y = 1;
            int calculo = 0;

            for (int i = 2; i <= n; i++) {
                calculo = x + y;
                x = y;
                y = calculo;
                System.out.println("Actual: " + y);
            }
            return calculo;
        }
    }
}