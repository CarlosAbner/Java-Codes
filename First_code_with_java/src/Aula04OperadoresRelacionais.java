// link da aula: https://www.youtube.com/watch?v=U390IaCtOUk&list=PL62G310vn6nFIsOCC0H-C2infYgwm8SWW&index=17


public class Aula04OperadoresRelacionais {
    public static void main(String[] args) {
        // operadores = +, -, /, *
        int numero1 = 10;
        int numero2 = 20;

        // % (Resto)
        int resto = 20 % 2;
        // System.out.println(resto);

        // (demais operadores, sempre vao retornar valores boolean) =  <, >, <=, >=, ==, !=

        boolean isDezMaiorQueVinte = numero1 > numero2;
        boolean isVinteMaiorQueDez = numero2 > numero1;
        boolean isDezMaiorOuIgualQueVinte = numero2 >= numero1;
        boolean isVinteMaiorOuIgualQueDez = numero2 >= numero1;
        boolean isDezIgualVinte = numero1 == numero2;
        boolean isDezDiferentelVinte = numero1 != numero2;

        System.out.println(isDezDiferentelVinte);
    }
}
