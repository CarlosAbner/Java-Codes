package Exercicios;


// link = https://www.youtube.com/watch?v=Q0REhCVBvAg&list=PL62G310vn6nFIsOCC0H-C2infYgwm8SWW&index=15

/*
    Prática:
            - Criar variaveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

            Eu <nome> morando no endereço <endereco>,
            confirmo que recebi o sálario de <salario>, na data <data>
*/

public class Aula03TiposPrimitivosExercicios {
    public static void main(String[] args) {
        String nome = "Abner Carlos";
        String endereco = "Rua algum lugar do mundo 123";
        Float salario = 1000.00F;
        String dataRecebimentoSalario = "02/jan/2026";


        String relatorio = "Eu "+ nome + " morando no endereço: " + endereco + ", \nConfirmo que recebi o sálario de: " + salario + " na data de: " + dataRecebimentoSalario;

        System.out.println(relatorio);
    }
}
