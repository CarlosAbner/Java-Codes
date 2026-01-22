// link da aula:

public class Aula07EstruturasDeRepeticao01 {
    public static void main(String[] args) {
        // estruturas de repeticao = for, while, do while

        int count = 0;

        while (count < 10) {
            System.out.println(count); //(++count) mostra o 10
            count+=1;
        }
        // a condicao do while é executaod pelo menos uma vez
        count = 0;
        do {
            System.out.println("Dentro do Do While " + ++count);
        }while (count < 10);

        for (count=0; count < 10; count++) {
            System.out.println("Dentro do For " + count);
        }
    }
}
