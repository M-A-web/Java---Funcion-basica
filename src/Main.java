public class Main {
    public static void main(String[] args) {





       int resultado = suma(10,10);
       double resultadoIva = masIva(resultado,1.50);

        System.out.println(resultadoIva);
    }
    static int suma(int num1, int num2){
        return num1 + num2;
    }

    static double masIva(int resultado, double iva ){
        return resultado + iva;
    }
}

