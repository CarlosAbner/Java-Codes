// link da aula: https://www.youtube.com/watch?v=74hd4o7V328&list=PL62G310vn6nFIsOCC0H-C2infYgwm8SWW&index=13


// declarando os tipos primitivos em java parte 3


/*
O double quando colocado o seu separador, ele identifica que o numero é um numero flutante, ex: 2500.0

Mas quando o Float no mesmo cenario, nao identifica o separador, com isso é necessario add um novo argumento na variavel
esse argumento na variavel é o F (maiusculo ou minusculo)
*/

public class Aula02TiposPrimitivos3 {

    public static void main(String[] args) {

        double salarioDouble = 2500.0;
        float salarioFloat = 2500.25F;

        System.out.println("Esse é o valor Double: "+ salarioDouble + "\nE esse é o valor Float: "+salarioFloat);
    }
}