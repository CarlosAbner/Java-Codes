package Exercicios;


// baseado no salario da irlanda de 2020, calcule a taxa de imposto sobre o salario

// de 0 a $34.712 taxa de 9.70%;
// de $34.713 a $68.507 taxa de 37.35%;
// de $68.508 > taxa de 49.5%;

public class Aula07Exercicios {
    public static void main(String[] args) {
        // salario do funcionario
        double salario = 25000;

        double taxa1 = 9.70;
        double taxa2 = 37.35;
        double taxa3 = 49.5;

        double resultado;

        if (salario <= 34712) {
            resultado = salario * (taxa1 / 100);
        }else if (salario >= 34713 && salario <= 68507 ) {
            resultado = salario * (taxa2 / 100);
        }else{
            resultado = salario * (taxa3 / 100);
        }

        System.out.println("Sálario é: "+salario+". \nO valor da sua taxa é: "+resultado);

    }

}
