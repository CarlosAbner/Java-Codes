package Exercicios;

public class EstruturasCondicionais {
    public static void main(String[] args) {
        // dados os valores de 1 a 7, imprima se é util ou final de semana
        // considerando 1 como domingo

        byte dia = 10;

        switch (dia) {
            case 1:
                System.out.println("Domingo, Final de Semana");
                break;
            case 2:
                System.out.println("Segunda-Feira, Dia da Semana, dia útil");
                break;
            case 3:
                System.out.println("Terca-Feira, Dia da Semana, dia útil");
                break;
            case 4:
                System.out.println("Quarta-Feira, Dia da Semana, dia útil");
                break;
            case 5:
                System.out.println("Quinta-Feira, Dia da Semana, dia útil");
                break;
            case 6:
                System.out.println("Sexta-Feira, Dia da Semana, dia útil");
                break;
            case 7:
                System.out.println("Sabado, Final de Semana");
                break;
            default:
                System.out.println("Dia da semana invalido");;
        }
    }
}
