package ExerciciosAParte;

public class BasicoTabuada {
    public static void main(String[] args) {
        int numero = 3;

        System.out.println("Tabuada do " + numero + ":");

            for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }
}
