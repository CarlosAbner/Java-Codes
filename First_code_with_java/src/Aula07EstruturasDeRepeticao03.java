public class Aula07EstruturasDeRepeticao03 {
    public static void main(String[] args) {
        // inprima os primeiros 25 nunmeros de um dado valor, Por exemplo 50
        int valorMaximo = 50;

        for (int i = 0; i < valorMaximo; i++) {
            if (i <= 25) break; // enxuto porem mais simples de entender
            System.out.println(i);
        }
    }

}
