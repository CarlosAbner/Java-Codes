// link da aula: https://www.youtube.com/watch?v=EFrq1WxsL1k&list=PL62G310vn6nFIsOCC0H-C2infYgwm8SWW&index=20

public class Aula05OperadoresDeAtribuicao {
    public static void main(String[] args) {
        // operadores: =, +=, -=, *=, /=, %=

        double bonus = 1800;

        bonus += 1000;
        bonus -= 1000;
        bonus *= 2;
        bonus /= 2;
        bonus %= 2;

        System.out.println(bonus);

        //

        int contador = 0;
        contador += 1;  //contador = contador + 1;
        contador++;
        contador--;
        ++contador;
        --contador;

        //dif entre add os sinais antes e depois da variavel: depende do momento que quer ser executado
            // se voce coloca antes, primeiro ex o que quer fazer ex:

            // contador2 = 0
                // contador2++ = esse caso, primeiro imprime e depois "adicionaria" o contador, mas retorna 0
            // ++contador2 = esse caso ele diz primeiro: adiciona o contador, e depois imprimi na tela
        int contador2 = 0;


        System.out.println(++contador2);
    }

}
