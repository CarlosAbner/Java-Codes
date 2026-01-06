// link da aula: https://www.youtube.com/watch?v=gk1_Pn8GZA4&list=PL62G310vn6nFIsOCC0H-C2infYgwm8SWW&index=21


public class Aula05EstruturasCondicionais {
    public static void main(String[] args) {
        int idade = 17;
        boolean isAutorizadoComprarBebida = idade >= 18;
        if (idade >= 18){
            System.out.println("Maior de Idade");
        }
        if (isAutorizadoComprarBebida == false) { // utilizar ! na frente da variavel é a mesma coisa que  == false
            System.out.println("Não autorizado a comprar bebida alcoolica");
        }

        System.out.println("Fora do if");
    }
}

