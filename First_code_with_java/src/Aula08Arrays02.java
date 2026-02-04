public class Aula08Arrays02 {
    public static void main(String[] args) {
        // tipos de decalaração de arrays

        // byhte, short, int, long, float, e double == (Valores iguala a 0)
        // char == (Valor igual a '\u0000')
        // boolean == false
        // String == null

        String [] nomes = new String[3];
        nomes[0] = "Maria";
        nomes[1] = "João";
        nomes[2] = "Ana";

        for (int i = 0; i <= nomes.length; i++) {
            System.out.println("Olá! Meu nome é: "+ nomes[i]);
        }
    }
}
