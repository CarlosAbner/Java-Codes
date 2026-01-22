

public class Aula07EstruturasDeRepeticao02 {
    public static void main(String[] args) {
        // imprima todos numeros opares at 1000000
        int count = 0;

        for (count = 0; count <= 1000000; count++) {
            if (count % 2 == 0)
                System.out.println("Todos os numeros pares: " + count);
        }
    }
}
