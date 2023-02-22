public class Suma {
    public static int sumaTresNumeros(int num1, int num2, int num3){
        int resultado = num1 + num2 + num3;
        return resultado;
    }
    public static void main (String[] args){
        int a = 5;
        int b = 10;
        int c = 15;
        int resultado = sumaTresNumeros(a, b, c);
        System.out.println("La suma de los tres números es: " + resultado);
    }

}
