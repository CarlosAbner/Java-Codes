// link da aula


// aula sobre operador ternario

// esse operador, sempre vai associar um valor diretamente para uma variavel ou retorno de metodo

//ex: String resultado = (condicao) ? verdadeiro : falso;

public class Aula06EstruturasCondicionais04 {
    public static void main(String[] args) {
        // fazer uma doacao de R$500,00 se o salario for maior que R$5000,00
        double salario = 9000;

        String mensagemDoar = "Eu vou doar R$500,00 pro DevDojo";
        String mensagemNaoDoar = "Ainda não tenho condições, mas vou ter";

        String resultado = salario > 5000 ? mensagemDoar : mensagemNaoDoar;

        System.out.println(resultado);

    }

}
