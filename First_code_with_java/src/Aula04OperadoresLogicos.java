// link da aula: https://www.youtube.com/watch?v=cT6sw-Pw4l0&list=PL62G310vn6nFIsOCC0H-C2infYgwm8SWW&index=18

public class Aula04OperadoresLogicos {
    public static void main(String[] args) {
        // operadores LOGICOS = (AND) == &&), (OR == ||), (NOT == !)
        int idade = 35;
        float salario = 3500F;


        boolean isDentroDaLeiMaiorQueTrinta = idade > 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >=  3381;

        // System.out.println("isDentroDaLeiMaiorQueTrinta " + isDentroDaLeiMaiorQueTrinta);
        // System.out.println("isDentroDaLeiMenorQueTrinta "+ isDentroDaLeiMenorQueTrinta);

        // ========================== operadores || (OR)  ===========================

                // simulação: duas contas bancarias, verificando se da para comprar um PS5

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlayStation = 5000F;

        boolean isPlayStationCincoCompravel = valorTotalContaCorrente > 5000 || valorTotalContaPoupanca > valorPlayStation;

        System.out.println("isPlayStationCincoCompravel: " + isPlayStationCincoCompravel);


    }
}
